import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.*;
import java.util.Scanner;
public class NegativeMaker {
    //TODO copy paste method & way of making global list (list w both ops & digs) into calculator, in the method add the digs and ops to arraylists w digs and ops, pass those into doMath
    static boolean loop = true;
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (loop) {
            String string = scanner.next();
            //TODO modify this exp to include 0-9999 and remove newline character
            Pattern p = Pattern.compile("[0-9()+\\-*/.]");
            Matcher m = p.matcher(string);
            while (m.find()) {
                list.add(m.group());
            }
            System.out.println("sorted: " + sorter(list));
            list.clear();
        }
    }
    public static ArrayList sorter(ArrayList<String> arr) {
        int pos = 0;
        int negFrequency = Collections.frequency(arr, "-");
       // do {
            if (arr.get(pos).equals("-")) {
                try {
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
        //} while (negFrequency != arr.size());
        return arr;
    }
}