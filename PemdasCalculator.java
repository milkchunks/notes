import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Calculator {
    static boolean error = false;
    public static void main(String[] args) {
        ArrayList<Double> digs = new ArrayList();
        ArrayList<String> ops = new ArrayList();
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String string;
        Pattern p = Pattern.compile("\\d\\d?\\d?\\d?");
        Matcher m;
        Pattern p2 = Pattern.compile("\\+|\\-|\\\\/|\\*|\\^|%");
        Matcher m2;
        double math;
        System.out.println("Input any problem without a variable or type 'exit' to exit the calculator");
        System.out.println("Your problem doesn't have to be in PEMDAS order");
        while (loop) {
            string = scanner.next();
            m = p.matcher(string);
            m2 = p2.matcher(string);
            if (!string.equalsIgnoreCase("exit")) {
                while (m.find()) {
                    digs.add(Double.valueOf(m.group()));
                }
                while (m2.find()) {
                    ops.add(m2.group());
                }
                math = doMath(digs, ops);
                if (!error) {
                    System.out.println(math);
                }
                ops.clear();
                digs.clear();
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
    public static Double doMath(ArrayList<Double> digs, ArrayList<String> ops) {
        try {
            Double end = null;
            int expoCount = Collections.frequency(ops, "^");
            int multCount = Collections.frequency(ops, "*") + Collections.frequency(ops, "/") + Collections.frequency(ops, "%");
            int addCount = Collections.frequency(ops, "+") + Collections.frequency(ops, "-");
            Double tempEnd;
            int pos = 0;
            int temp = 0;
            boolean removed = false;
            do {
                if (ops.size() != 0) {
                    if (ops.get(pos).equals("^")) {
                        if (pos > 0) {
                            tempEnd = Math.pow(digs.get(pos), digs.get(pos + 1));
                        } else {
                            tempEnd = Math.pow(digs.get(0), digs.get(1));
                        }
                        digs.remove(pos);
                        digs.remove(pos);
                        ops.remove(pos);
                        removed = true;
                        if (pos > 0) {
                            digs.add(pos, tempEnd);
                        } else {
                            digs.add(0, tempEnd);
                        }
                    }
                    if (!removed) {
                        pos++;
                    }
                    if (removed) {
                        temp++;
                    }
                    removed = false;
                }
            } while (temp != expoCount);
            pos = 0;
            temp = 0;
            removed = false;
            do {
                if (ops.size() != 0) {
                    switch (ops.get(pos)) {
                        case "*":
                            if (pos > 0) {
                                tempEnd = digs.get(pos) * digs.get(pos + 1);
                            } else {
                                tempEnd = digs.get(0) * digs.get(1);
                            }
                            digs.remove(pos);
                            digs.remove(pos);
                            ops.remove(pos);
                            if (pos > 0) {
                                digs.add(pos, tempEnd);
                            } else {
                                digs.add(0, tempEnd);
                            }
                            removed = true;
                            break;
                        case "/":
                            if (pos > 0) {
                                tempEnd = digs.get(pos) / digs.get(pos + 1);
                            } else {
                                tempEnd = digs.get(0) / digs.get(1);
                            }
                            digs.remove(pos);
                            digs.remove(pos + 1);
                            ops.remove(pos);
                            if (pos > 0) {
                                digs.add(pos, tempEnd);
                            } else {
                                digs.add(0, tempEnd);
                            }
                            removed = true;
                            break;
                        case "%":
                            if (pos > 0) {
                                tempEnd = digs.get(pos) % digs.get(pos + 1);
                            } else {
                                tempEnd = digs.get(0) % digs.get(1);
                            }
                            digs.remove(pos);
                            digs.remove(pos);
                            ops.remove(pos);
                            if (pos > 0) {
                                digs.add(pos, tempEnd);
                            } else {
                                digs.add(0, tempEnd);
                            }
                            removed = true;
                            break;
                        default:
                            break;
                    }
                    if (!removed) {
                        pos++;
                    }
                    if (removed) {
                        temp++;
                    }
                    removed = false;
                }
            } while (temp != multCount);
            pos = 0;
            temp = 0;
            removed = false;
            do {
                if (ops.size() != 0) {
                    switch (ops.get(pos)) {
                        case "+":
                            if (pos > 0) {
                                tempEnd = digs.get(pos) + digs.get(pos + 1);
                            } else {
                                tempEnd = digs.get(0) + digs.get(1);
                            }
                            digs.remove(pos);
                            digs.remove(pos);
                            ops.remove(pos);
                            removed = true;
                            if (pos > 0) {
                                digs.add(pos, tempEnd);
                            } else {
                                digs.add(0, tempEnd);
                            }
                            break;
                        case "-":
                            if (pos > 0) {
                                tempEnd = digs.get(pos) - digs.get(pos + 1);
                            } else {
                                tempEnd = digs.get(0) - digs.get(1);
                            }
                            digs.remove(pos);
                            digs.remove(pos + 1);
                            ops.remove(pos);
                            removed = true;
                            if (pos > 0) {
                                digs.add(pos, tempEnd);
                            } else {
                                digs.add(0, tempEnd);
                            }
                            break;
                    }
                    if (!removed) {
                        pos++;
                    }
                    if (removed) {
                        temp++;
                    }
                    removed = false;
                }
            } while (temp != addCount);
            end = digs.get(0);
            return end;
        } catch (Exception e) {
            error = true;
            System.out.println("Error: Invalid Problem (Try again)");
        }
        return 0.0;
    }
}
