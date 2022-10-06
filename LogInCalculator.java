import java.util.Scanner;
public class LogInCalculator {
    public static void main(String[] args) {
        //set username and password
        Scanner setCredentials = new Scanner(System.in);
        System.out.println("Type in your new username and password on separate lines.");
        String correctUsername = setCredentials.nextLine();
        String correctPassword = setCredentials.nextLine();
        //this is here because i had my mom try to break my calculator, and she ended up being able to set a blank username/password, and i know i will forget to delete this
        if (correctUsername.equals("") || correctPassword.equals("") || correctUsername.equals(" ") || correctPassword.equals(" ")) {
            System.out.println("you're not allowed to do that mom");
            } else {
                //print instructions and read credentials that the user puts in
            System.out.println("Log in to use calculator");
            Scanner readCredentials = new Scanner(System.in);
            String username = readCredentials.nextLine();
            String password = readCredentials.nextLine();
            //check inputs against logged password & username
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Logged in, type in a number, then an operator, then another number all on different lines.");
                System.out.println(doMath()); //does the math
            } else {
                System.out.println("Incorrect Username or Password"); //error message
            }
        }
    }
    //declare and return the first variable as numberOne
    public static double readNumberOne() {
        Scanner numberOneReader = new Scanner(System.in);
        double numberOne = numberOneReader.nextDouble();
        return (numberOne);
    }
    //return and declare the operator, with operator choices being +, -, /, *, %, or ^, else it will return an error message
    public static String readOperator() {
        Scanner operatorReader = new Scanner(System.in);
        String operator = operatorReader.nextLine();
        if (!operator.equals("+", "-", "/", "*", "%", "^")) {
            String operatorError= ("Error: not a viable operator");
            return (operatorError);
        }
        return (operator);
    }
    //declare and return the first variable as numberTwo
    public static double readNumberTwo() {
        Scanner numberTwoReader = new Scanner(System.in);
        double numberTwo = numberTwoReader.nextDouble();
        return (numberTwo);
    }
    //uses elif statements to do math
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
/*
next steps: tokenize the string so the user can put in equations like 3+5 instead of:
3
+
5
*/
