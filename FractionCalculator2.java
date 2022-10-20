import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FractionCalculator2 {
    public static void main(String[] args) {
        Float floatOne = (Float) readEquation().get(0);
        String operator = (String) readEquation().get(1);
        Float floatTwo = (Float) readEquation().get(2);
        System.out.println(floatOne);
        System.out.println(operator);
        System.out.println(floatTwo);
        if (operator == "+") {
            System.out.println(addition());
        } else if (operator == "-") {
            System.out.println(subtraction());
        } else if (operator == "*") {
            System.out.println(multiplication());
        } else if (operator == "/") {
            System.out.println(division());
        }
    }
    public static ArrayList readEquation() {
        Scanner operatorReader = new Scanner(System.in);
        ArrayList equationParse = new ArrayList();
        String equation = operatorReader.nextLine();
        equationParse.add(equation.split());
        return (equation);
    }
    public static float addition() {
        Float floatOne = (Float) readEquation().get(0);
        Float floatTwo = (Float) readEquation().get(2);
        return (floatOne + floatTwo);
    }
    public static float subtraction() {
        Float floatOne = (Float) readEquation().get(0);
        Float floatTwo = (Float) readEquation().get(2);
        return (floatOne - floatTwo);
    }
    public static float multiplication() {
        Float floatOne = (Float) readEquation().get(0);
        Float floatTwo = (Float) readEquation().get(2);
        return (floatOne * floatTwo);
    }
    public static float division() {
        Float floatOne = (Float) readEquation().get(0);
        Float floatTwo = (Float) readEquation().get(2);
        return (floatOne / floatTwo);
    }
}