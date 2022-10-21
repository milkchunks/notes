import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FractionCalculator2 {
    public static void main(String[] args) {
        Double doubleOne = (Double) readEquation().get(0);
        String operator = (String) readEquation().get(1);
        Double doubleTwo = (Double) readEquation().get(2);
        System.out.println(doubleOne);
        System.out.println(operator);
        System.out.println(doubleTwo);
        if (operator.equals("+")) {
            System.out.println(addition());
        } else if (operator.equals("-")) {
            System.out.println(subtraction());
        } else if (operator.equals("*")) {
            System.out.println(multiplication());
        } else if (operator.equals("/")) {
            System.out.println(division());
        } else {
            System.out.println("Error: invalid operator");
        }
    }
    public static ArrayList readEquation() {
        Scanner operatorReader = new Scanner(System.in);
        ArrayList equationParse = new ArrayList();
        String equation = operatorReader.nextLine();
        equationParse.add(equation.split(""));
        return (equation);
    }
    public static double addition() {
        Double doubleOne = (Double) readEquation().get(0);
        Double doubleTwo = (Double) readEquation().get(2);
        return (doubleOne + doubleTwo);
    }
    public static float subtraction() {
        Double doubleOne = (Double) readEquation().get(0);
        Double doubleTwo = (Double) readEquation().get(2);
        return (doubleOne - doubleTwo);
    }
    public static float multiplication() {
        Double doubleOne = (Double) readEquation().get(0);
        Double doubleTwo = (Double) readEquation().get(2);
        return (doubleOne * doubleTwo);
    }
    public static float division() {
        Double doubleOne = (Double) readEquation().get(0);
        Double doubleTwo = (Double) readEquation().get(2);
        return (doubleOne / doubleTwo);
    }
}
