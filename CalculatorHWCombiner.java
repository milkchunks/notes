import java.util.Scanner;
public class LogInCalculator {
    public static void main(String[] args) {
        Scanner setCredentials = new Scanner(System.in);
        System.out.println("Type in your new username and password on separate lines.");
        String correctUsername = setCredentials.nextLine();
        String correctPassword = setCredentials.nextLine();
        //this is here because i had my mom try to break my calculator, and she ended up being able to set a blank username/password, and i know i will forget to delete this
        if (correctUsername.equals("") || correctPassword.equals("") || correctUsername.equals(" ") || correctPassword.equals(" ")) {
            System.out.println("you're not allowed to do that mom");
            } else {
            System.out.println("Log in to use calculator");
            Scanner readCredentials = new Scanner(System.in);
            String username = readCredentials.nextLine();
            String password = readCredentials.nextLine();
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Logged in, type in a number, then an operator, then another number all on different lines.");
                System.out.println(doMath());
            } else {
                System.out.println("Incorrect Username or Password");
            }
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

        if (operator.equals("+")) {
            return (numberOne + numberTwo);
        } else if (operator.equals("-")) {
            return (numberOne - numberTwo);
        } else if (operator.equals("*")) {
            return (numberOne * numberTwo);
        } else if (operator.equals("/")) {
            return (numberOne / numberTwo);
        } else if (operator.equals("%")) {
            return (numberOne % numberTwo);
        } else if (operator.equals("^")) {
            return (Math.pow(numberOne, numberTwo));
        }
        return (3); //i had to have a final return statement, and i can't have it return a string saying "error" or something because the method is listed as returning a double, so i just had it return three because it shouldn't ever return three
    }
}