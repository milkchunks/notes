import java.util.Scanner;
public class CalculatorHW {
    //this calculator is more user friendly and doesn't require logging in
    public static void main(String[] args) {
            System.out.println("Calculator");
            System.out.println("Input a number, operator, and another number all on different lines");
            System.out.println("Use ^ to represent an exponent");
            Double integer = doMath(); //i don't know why this works but it does
            if (integer != -0.5878374859743589) {
                System.out.println(doMath());
            } else {
                System.out.println(integer);
                System.out.println("Error: invalid operator");
            }
    }
    public static double readNumberOne() {
        Scanner numberOneReader = new Scanner(System.in);
        double numberOne = numberOneReader.nextDouble();
        return (numberOne);
    }
    public static String readOperator() {
        Scanner operatorReader = new Scanner(System.in);
        String operator = operatorReader.nextLine();
        return (operator);
    }
    public static double readNumberTwo() {
        Scanner numberTwoReader = new Scanner(System.in);
        double numberTwo = numberTwoReader.nextDouble();
        return (numberTwo);
    }

    public static double doMath() {
            double numberOne = readNumberOne();
            String operator = readOperator();
            double numberTwo = readNumberTwo();
            double integer;
            switch (operator) {
                case "+":
                    integer = numberOne + numberTwo;
                    break;
                case "-":
                    integer = numberOne - numberTwo;
                    break;
                case "/":
                    integer = numberOne / numberTwo;
                    break;
                case "*":
                    integer = numberOne * numberTwo;
                    break;
                case "%":
                    integer = numberOne % numberTwo;
                    break;
                case "^":
                    integer = Math.pow(numberOne, numberTwo);
                    break;
                default:
                    integer = -0.5878374859743589;
                    break;
            }
            return (integer);
    }
}
