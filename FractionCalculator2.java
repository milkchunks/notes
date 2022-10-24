import java.util.Scanner;

public class FractionCalculator2 {
    static String[] parsedEquation = readEquation();
    static String[] parsedMain = readEquation();
    static String[] argumentOne = argumentOne();
    static String[] argumentTwo = argumentTwo();
    static Float argOneNum = Float.valueOf((argumentOne[0]));
    static Float argOneDenom = Float.valueOf(argumentOne[1]);
    static Float argTwoNum = Float.valueOf(argumentTwo[0]);
    static Float argTwoDenom = Float.valueOf(argumentTwo[1]);
    public static void main(String[] args) {
            String operator = String.valueOf(parsedEquation[1]);
            if (!Float.isNaN(argOneNum) || !Float.isNaN(argOneDenom) || !Float.isNaN(argTwoNum) || !Float.isNaN(argTwoDenom)) {
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    if (operator.equals("+")) {
                        System.out.println(addition());
                    } else if (operator.equals("-")) {
                        System.out.println(subtraction());
                    } else if (operator.equals("*")) {
                        System.out.println(multiplication());
                    } else if (operator.equals("/")) {
                        System.out.println(division());
                    }
                } else {
                    System.out.println("Error: invalid operator");
                }
            } else {
                System.out.println("Error: invalid number(s)");
            }
        }
    public static String[] argumentOne() {
        String[] argumentOne = parsedMain[0].split("/");
        return argumentOne;
    }
    public static String[] argumentTwo() {
        String[] argumentTwo = parsedMain[2].split("/");
        return argumentTwo;
    }
    public static String[] readEquation() {
        Scanner operatorReader = new Scanner(System.in);
        String equation = operatorReader.nextLine();
        String[] equation2 = equation.split(" ");
        return (equation2);
    }
    public static Float addition() {
        Float argOneNum = Float.valueOf(argumentOne[0]);
        Float argOneDenom = Float.valueOf(argumentOne[1]);
        Float argTwoNum = Float.valueOf(argumentTwo[0]);
        Float argTwoDenom = Float.valueOf(argumentTwo[1]);
        Float argOneMultNum = argOneNum * argTwoDenom;
        Float argOneMultDenom = argOneDenom * argTwoDenom;
        Float argTwoMultNum = argTwoNum * argOneDenom;
        Float numAddend = argOneMultNum + argTwoMultNum;
        Float denomAddend = argOneMultDenom;
        return (numAddend / denomAddend);
    }
    public static Float subtraction() {
        Float argOneNum = Float.valueOf(argumentOne[0]);
        Float argOneDenom = Float.valueOf(argumentOne[1]);
        Float argTwoNum = Float.valueOf(argumentTwo[0]);
        Float argTwoDenom = Float.valueOf(argumentTwo[1]);
        Float argOneMultNum = argOneNum * argTwoDenom;
        Float argOneMultDenom = argOneDenom * argTwoDenom;
        Float argTwoMultNum = argTwoNum * argOneDenom;
        Float argTwoMultDenom = argTwoDenom * argOneDenom;
        Float numDiff = argOneMultNum - argTwoMultNum;
        Float denomDiff = argOneMultDenom - argTwoMultDenom;
        return (numDiff / denomDiff);
    }
    public static Float multiplication() {
        Float argOneNum = Float.valueOf(argumentOne[0]);
        Float argOneDenom = Float.valueOf(argumentOne[1]);
        Float argTwoNum = Float.valueOf(argumentTwo[0]);
        Float argTwoDenom = Float.valueOf(argumentTwo[1]);
        Float multNum = argOneNum * argTwoNum;
        Float multDenom = argOneDenom * argTwoDenom;
        return (multNum / multDenom);
    }
    public static Float division() {
        Float argOneNum = Float.valueOf(argumentOne[0]);
        Float argOneDenom = Float.valueOf(argumentOne[1]);
        Float argTwoNum = Float.valueOf(argumentTwo[0]);
        Float argTwoDenom = Float.valueOf(argumentTwo[1]);
        Float recipArgOneNum = argOneDenom;
        Float recipArgOneDenom = argOneNum;
        Float multNum = recipArgOneNum * argTwoNum;
        Float multDenom = recipArgOneDenom * argTwoDenom;
        return (multNum / multDenom);
    }
}