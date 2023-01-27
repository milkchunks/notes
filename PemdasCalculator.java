import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.regex.*;
public class PemdasCalculator {
    static boolean loop = true;
    public static void main(String[] args) {
        ArrayList<String> ops = new ArrayList<>();
        ArrayList<String> ops2 = new ArrayList<>();
        ArrayList<Double> digs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any equation without variables, regardless of PEMDAS. Type 'exit' to exit");
        String string = "foo";
        Pattern p = Pattern.compile("[\\+|\\-|\\\\/|\\*|\\^|%]");
        Pattern p2 = Pattern.compile("([1-9]|[1-9][0-9]|[1-9][0-9][0-9])");
        Matcher m;
        Matcher m2;
        //TODO make it do negatives?
        //TODO use the operator to separate digits, so whatevers next to/between operators gets sent to another array
        while (loop) {
                if (!string.equalsIgnoreCase("exit")) {
                    string = scanner.next();
                    m = p.matcher(string);
                    m2 = p2.matcher(string);
                    ops.clear();
                    digs.clear();
                    while (m.find()) {
                        ops.add(m.group());
                    }
                    while (m2.find()) {
                        digs.add(Double.valueOf(m2.group()));
                    }
                    System.out.println(digs);
                    System.out.println(doMath(ops, digs, ops2));
                } else {
                    System.out.println("Exiting...");
                    loop = false;
                    break;
                }
        }
    }
    public static Double doMath(ArrayList<String> ops, ArrayList<Double> digs, ArrayList<String> ops2) {
        int pos = 0;
        for (int i=1; i<=ops.size();i++) {
            if (ops.get(pos).equals("^")) {
                ops2.add(ops.get(pos));
                if (i!=1) {
                    digs.add(0, digs.get(pos));
                    digs.add(1, digs.get(pos + 1));
                    digs.remove(pos + 2);
                    digs.remove(pos + 2);
                }
            }
            if (pos < ops.size()-1) {
                pos++;
            }
        }
        pos = 0;
        for (int i=1; i<=ops.size();i++) {
            if (ops.get(pos).equals("*") || ops.get(pos).equals("%") || ops.get(pos).equals("/")) {
                ops2.add(ops.get(pos));
                if (i!=1) {
                    //[3, 5, 8] pos = 1
                    digs.add(0, digs.get(pos));
                    digs.add(1, digs.get(pos+2));
                    digs.remove(pos + 2);
                    digs.remove(pos + 2);
                }
            }
            if (pos < ops.size()-1) {
                pos++;
            }
        }
        pos = 0;
        for (int i=1; i<=ops.size();i++) {
            if (ops.get(pos).equals("+") || ops.get(pos).equals("-")) {
                ops2.add(ops.get(pos));
                if (i!=1) {
                    digs.add(0, digs.get(pos));
                    digs.add(1, digs.get(pos + 1));
                    digs.remove(pos + 2);
                    digs.remove(pos + 2);
                }
            }
            if (pos < ops.size()-1) {
                pos++;
            }
        }
        System.out.println(ops2);
        System.out.println(digs);
        String operator;
        Double end = null;
        for (int i=-1; i<=ops2.size(); i++) {
            if (ops2.size() > 0) {
                operator = ops2.get(0);
                switch (operator) {
                    case "^":
                        end = Math.pow(digs.get(0), digs.get(1));
                        break;
                    case "*":
                        end = digs.get(0) * digs.get(1);
                        break;
                    case "/":
                        end = digs.get(0) / digs.get(1);
                        break;
                    case "%":
                        end = digs.get(0) % digs.get(1);
                        break;
                    case "+":
                        end = digs.get(0) + digs.get(1);
                        break;
                    case "-":
                        end = digs.get(0) - digs.get(1);
                        break;
                    default:
                        end = 0.0;
                        System.out.println("Error: Invalid Operator??");
                        break;
                }
                System.out.println(ops2);
                System.out.println(digs);
                digs.remove(0);
                digs.remove(0);
                ops2.remove(0);
                digs.add(0, end);
            }
        }
        return end;
    }
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i=1; i <= n-1; i++) {
            int j = i;
            while (j > 0 && arr.get(j-1) > arr.get(j)) {
                Collections.swap(arr, j, j-1);
                j--;
            }
        }
        return arr;
    }
}
