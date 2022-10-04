import java.util.Scanner;
public class OctFourPtTwo {
    public static void main(String[] args) {
        String username = "johnathon";
        String password = "ilikecheddar62";
        if (username.equals("johnathon") && password.equals("ilikecheddar62")) {
            System.out.println("Logged in.");
        } else {
            System.out.println("Username or password is incorrect.");
        }
    }
    public static int usernamePassword() {
        Scanner usernamePasswordChecker = new Scanner(System.in);
        System.out.println("Input username and password on different lines, with the username coming first");
        String correctUsername = "johnathon";
        String correctPassword = "ilikecheddar62";
        int username = usernamePasswordChecker.nextInt();
        int password = usernamePasswordChecker.nextInt();
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Logged in");
        } else {
            System.out.println("Username or password is incorrect");
        }
    }
}
