import java.util.Scanner;
public class OctFourFinalExercise {
    public static void main(String[] args) {
        OctFourFinalExercise ex = new OctFourFinalExercise();
        ex.exerciseOne();
        ex.exerciseTwo();
        ex.exerciseTwoMyVersion();
    }
    public void exerciseOne() {
        int x = 50;
        int y = 60;
        if (x>y) {
            System.out.println("hello world");
        }
        if (x<y) {
            System.out.println("peace out world");
        }
        if (x != y) {
            System.out.println("hello world?");
        } else {
            System.out.println("peace out world?");
        }
    }
    public void exerciseTwo() {
        String username = "johnathon";
        String password = "ilikecheddar62";
        if (username.equals("johnathon") && password.equals("ilikecheddar62")) {
            System.out.println("Logged in.");
        } else {
            System.out.println("Username or password is incorrect.");
        }
    }
    public void exerciseTwoMyVersion() {
        Scanner usernamePasswordChecker = new Scanner(System.in);
        System.out.println("Input username and password on different lines, with the username coming first");
        String correctUsername = "johnathon";
        String correctPassword = "ilikecheddar62";
        var username = usernamePasswordChecker.nextLine();
        var password = usernamePasswordChecker.nextLine();
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Logged in");
        } else {
            System.out.println("Username or password is incorrect");
        }
    }
}
