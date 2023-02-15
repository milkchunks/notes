import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PemdasCalculator {
    static boolean error = false;
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList();
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any problem without a variable or type 'exit' to exit the calculator");
        System.out.println("Your problem doesn't have to be in PEMDAS order");
        while (loop) {
            String string = scanner.next();
            //this statement is weird but wtv
            Pattern p = Pattern.compile("(\\d\\d?\\d?\\d?)|\\(|\\)|\\+|\\-|\\*|/|\\^|%");
            Matcher m = p.matcher(string);
            if (!string.equalsIgnoreCase("exit")) {
                while (m.find()) {
                    all.add(m.group());
                }
                if (!error) {
                    System.out.println(doMath(sorter(all)));
                }
                all.clear();
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
    public static String doMath(ArrayList<String> all) {
        try {
            String end = null;
            int parCount = Collections.frequency(all, "(");
            int expoCount = Collections.frequency(all, "^");
            int multCount = Collections.frequency(all, "*") + Collections.frequency(all, "/") + Collections.frequency(all, "%");
            int addCount = Collections.frequency(all, "+") + Collections.frequency(all, "-");
            String toAdd = null;
            int pos = 0;
            int signCount = 0;
            boolean removed = false;
            int parPos = all.indexOf("(");
            if (parCount != 0) {
            do {
                removed = false;
                if (all.size() == 1) {
                    return all.get(0);
                }
                if (!all.get(parPos+2).equals(")") && pos > parPos) {
                        do {
                            switch (all.get(pos)) {
                                case "^":
                                    toAdd = String.valueOf(Math.pow(Double.valueOf(all.get(pos - 1)), Double.valueOf(all.get(pos + 1))));
                                    all.remove(pos - 1);
                                    all.remove(pos);
                                    all.remove(pos - 1);
                                    all.add(pos - 1, toAdd);
                                    signCount++;
                                    removed = true;
                                    expoCount = expoCount - 1;
                                    break;
                                case "*":
                                    toAdd = String.valueOf(Double.valueOf(all.get(pos - 1)) * Double.valueOf(all.get(pos + 1)));
                                    all.remove(pos - 1);
                                    all.remove(pos);
                                    all.remove(pos - 1);
                                    all.add(pos - 1, toAdd);
                                    signCount++;
                                    removed = true;
                                    multCount = multCount - 1;
                                    break;
                                case "%":
                                    toAdd = String.valueOf(Double.valueOf(all.get(pos - 1)) % Double.valueOf(all.get(pos + 1)));
                                    all.remove(pos - 1);
                                    all.remove(pos);
                                    all.remove(pos - 1);
                                    all.add(pos - 1, toAdd);
                                    signCount++;
                                    removed = true;
                                    multCount = multCount - 1;
                                    break;
                                case "/":
                                    toAdd = String.valueOf(Double.valueOf(all.get(pos - 1)) / Double.valueOf(all.get(pos + 1)));
                                    all.remove(pos - 1);
                                    all.remove(pos);
                                    all.remove(pos - 1);
                                    all.add(pos - 1, toAdd);
                                    signCount++;
                                    removed = true;
                                    multCount = multCount - 1;
                                    break;
                                case "+":
                                    toAdd = String.valueOf(Double.valueOf(all.get(pos - 1)) + Double.valueOf(all.get(pos + 1)));
                                    all.remove(pos - 1);
                                    all.remove(pos);
                                    all.remove(pos - 1);
                                    all.add(pos - 1, toAdd);
                                    signCount++;
                                    removed = true;
                                    addCount = addCount - 1;
                                    break;
                                case "-":
                                    toAdd = String.valueOf(Double.valueOf(all.get(pos - 1)) - Double.valueOf(all.get(pos + 1)));
                                    all.remove(pos - 1);
                                    all.remove(pos);
                                    all.remove(pos - 1);
                                    all.add(pos - 1, toAdd);
                                    signCount++;
                                    removed = true;
                                    addCount = addCount - 1;
                                    break;
                                default:
                                    if (!removed) {
                                        pos++;
                                    }
                                    break;
                            }
                        } while (!all.get(parPos + 2).equals(")"));
                }
                if (!removed) {
                    pos++;
                }
                //TODO this < is a bandaid, fix later
            } while (signCount < parCount);
            all.remove(parPos);
            all.remove(parPos + 1);
            }
            removed = false;
            pos = 0;
            signCount = 0;
            do {
                if (all.size() == 1) {
                    return all.get(0);
                }
                removed = false;
                if (all.get(pos).equals("^")) {
                    toAdd = String.valueOf(Math.pow(Double.valueOf(all.get(pos-1)), Double.valueOf(all.get(pos+1))));
                    all.remove(pos - 1);
                    all.remove(pos);
                    all.remove(pos - 1);
                    all.add(pos - 1, toAdd);
                    removed = true;
                }
                if (!removed) {
                    pos++;
                }
                if (removed) {
                    signCount++;
                }
            } while (signCount != expoCount);
            removed = false;
            pos = 0;
            signCount = 0;
            do {
                removed = false;
                if (all.size() == 1) {
                    return all.get(0);
                }
                if (all.get(pos).equals("/") || all.get(pos).equals("%") || all.get(pos).equals("*")) {
                switch (all.get(pos)) {
                    case "*":
                        toAdd = String.valueOf(Double.valueOf(all.get(pos-1)) * Double.valueOf(all.get(pos+1)));
                        break;
                    case "/":
                        toAdd = String.valueOf(Double.valueOf(all.get(pos-1)) / Double.valueOf(all.get(pos+1)));
                        break;
                    case "%":
                        toAdd = String.valueOf(Double.valueOf(all.get(pos-1)) % Double.valueOf(all.get(pos+1)));
                        break;
                    
                    default: 
                        break;
                }
                    all.remove(pos - 1);
                    all.remove(pos);
                    all.remove(pos - 1);
                    all.add(pos - 1, toAdd);
                removed = true;
                }
                if (!removed) {
                    pos++;
                }
                if (removed) {
                    signCount++;
                }
            } while (signCount != multCount);
            removed = false;
            pos = 0;
            signCount = 0;
            do {
                if (all.size() == 1) {
                    return all.get(0);
                }
                removed = false;
                if (all.get(pos).equals("-") || all.get(pos).equals("+")) {
                    switch (all.get(pos)) {
                        case "+":
                            toAdd = String.valueOf(Double.valueOf(all.get(pos - 1)) + Double.valueOf(all.get(pos + 1)));
                            break;
                        case "-":
                            toAdd = String.valueOf(Double.valueOf(all.get(pos - 1)) - Double.valueOf(all.get(pos + 1)));
                        default:
                            break;
                    }
                    removed = true;
                    all.remove(pos - 1);
                    all.remove(pos);
                    all.remove(pos - 1);
                    all.add(pos - 1, toAdd);
                }
                if (!removed) {
                    pos++;
                }
                    if (removed) {
                        signCount++;
                    }
                    removed = true;
            } while (signCount != addCount);
            end = all.get(0);
            return end;
        } catch (Exception e) {
            error = true;
            System.out.println("Error: Invalid Problem (Try again)");
        }
        return null;
    }
    public static ArrayList sorter(ArrayList<String> arr) {
        //this method transforms [<any operator> ,-, x] (x being a number) into [<any operator>, -x]
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
                    double num2 = -Double.valueOf(arr.get(pos + 1));
                    arr.remove(pos + 1);
                    arr.remove(pos);
                    arr.add(pos, String.valueOf(num2));
                }
            }
            pos++;
        } while (neg != negFrequency);
        return arr;
    }
}
