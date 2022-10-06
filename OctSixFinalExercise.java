import java.sql.SQLOutput;
import java.util.Scanner;
public class OctSixFinalExercise {
    public static void main(String[] args) {
        Scanner repeatScanner = new Scanner(System.in);
        Scanner wordScanner = new Scanner(System.in);
        System.out.println("Type in any random word");
        var wordInput = wordScanner.nextLine();
        System.out.println("How many times would you like this word repeated?");
        int repeatInput = wordScanner.nextInt();
        for (int i = 1; i <= repeatInput; i++) {
            System.out.println(wordInput);
        }
    }
}
