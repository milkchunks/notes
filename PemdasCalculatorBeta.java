import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PemdasCalculatorBeta {
    //TODO its stuck in a dowhile in + for some reason (check other operator dowhiles too)
    static boolean error = false;
    public static void main(String[] args) {
        ArrayList<Double> digs = new ArrayList();
        ArrayList<String> ops = new ArrayList();
        ArrayList<String> all = new ArrayList();
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any problem without a variable or type 'exit' to exit the calculator");
        System.out.println("Your problem doesn't have to be in PEMDAS order");
        while (loop) {
            String string = scanner.next();
            //TODO make this accept 0-9999 and remove newline character
            Pattern p = Pattern.compile("[0-9()+\\-*/.]");
            Matcher m = p.matcher(string);
            if (!string.equalsIgnoreCase("exit")) {
                while (m.find()) {
                    all.add(m.group());
                }
                if (!error) {
                    System.out.println(doMath(sorter(all)));
                }
                ops.clear();
                digs.clear();
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
    public static String doMath(ArrayList<String> all) {
        try {
            String end = null;
            int expoCount = Collections.frequency(all, "^");
            int multCount = Collections.frequency(all, "*") + Collections.frequency(all, "/") + Collections.frequency(all, "%");
            int addCount = Collections.frequency(all, "+") + Collections.frequency(all, "-");
            String tempEnd = null;
            int pos = 0;
            int temp = 0;
            boolean removed = false;
            do {
                removed = false;
                if (all.get(pos).equals("^")) {
                    tempEnd = String.valueOf(Math.pow(Double.valueOf(all.get(pos-1)), Double.valueOf(all.get(pos+1))));
                    all.remove(pos-1);
                    all.remove(pos);
                    all.remove(pos+1);
                    all.add(pos-1, tempEnd);
                    removed = true;
                }
                if (!removed) {
                    pos++;
                }
                if (removed) {
                    temp++;
                }
            } while (temp != expoCount);
            pos = 0;
            temp = 0;
            do {
                removed = false;
                if (all.get(pos).equals("/") || all.get(pos).equals("%") || all.get(pos).equals("*")) {
                switch (all.get(pos)) {
                    case "*":
                        tempEnd = String.valueOf(Double.valueOf(all.get(pos-1)) * Double.valueOf(all.get(pos+1)));
                        break;
                    case "/":
                        tempEnd = String.valueOf(Double.valueOf(all.get(pos-1)) / Double.valueOf(all.get(pos+1)));
                        break;
                    case "%":
                        tempEnd = String.valueOf(Double.valueOf(all.get(pos-1)) % Double.valueOf(all.get(pos+1)));
                        break;
                    
                    default: 
                        break;
                }
                all.remove(pos-1);
                all.remove(pos);
                all.remove(pos+1);
                all.add(pos-1, tempEnd);
                removed = true;
                }
                if (!removed) {
                    pos++;
                }
                if (removed) {
                    temp++;
                }
            } while (temp != multCount);
            pos = 0;
            temp = 0;
            do {
                removed = false;
                if (all.get(pos).equals("-") || all.get(pos).equals("+")) {
                    switch (all.get(pos)) {
                        case "+":
                        tempEnd = String.valueOf(Double.valueOf(all.get(pos-1)) + Double.valueOf(all.get(pos+1)));
                            break;
                        case "-":
                        tempEnd = String.valueOf(Double.valueOf(all.get(pos-1)) - Double.valueOf(all.get(pos+1)));
                        default:
                            break;
                    }
                    all.remove(pos-1);
                    all.remove(pos);
                    all.remove(pos+1);
                    all.add(pos-1, tempEnd);
                    removed = true;
                }
            } while (temp != addCount);
            end = all.get(0);
            return end;
        } catch (Exception e) {
            error = true;
            System.out.println("Error: Invalid Problem (Try again)");
        }
        return "How did this even happen";
    }
    public static ArrayList sorter(ArrayList<String> arr) {
        int pos = 0;
        int neg = 0;
        int negFrequency = Collections.frequency(arr, "-");
        do {
            if (arr.get(pos).equals("-")) {
                try {
                    neg++;
                    if (pos != 0) {
                        double num = Double.valueOf(arr.get(pos - 1));
                    }
                    if (pos == 0) {
                        double num = Double.valueOf(arr.get(pos));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("caught");
                    double num2 = -Double.valueOf(arr.get(pos + 1));
                    arr.remove(pos + 1);
                    arr.remove(pos);
                    arr.add(pos, String.valueOf(num2));
                    System.out.println("neg: " + neg + ", neg frequency: " + negFrequency);
                }
            }
            pos++;
        } while (neg != negFrequency);
        return arr;
    }
}
