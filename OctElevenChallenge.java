import java.util.Scanner;
public class OctElevenChallenge {
    public static void main(String[] args) {
        Scanner responseScanner = new Scanner(System.in);
        System.out.println("Type in any question.");
        int var = 0;
        while (var < 5) {
        String input = responseScanner.nextLine();
        if (!"".equals(input)) {
            Double castingTemp = (Math.random() * 10);
            Integer randomizerReturn = castingTemp.intValue();
            if (input.equalsIgnoreCase("Will my dad come back?")) {
                System.out.println("He will never come back.");
            } else if (input.equalsIgnoreCase("Will my dad come back")) {
                System.out.println("He will never come back.");
            } else {
            switch (randomizerReturn) {
                case 0:
                    System.out.println("Yes");
                    break;
                case 1:
                    System.out.println("Maybe");
                    break;
                case 2:
                    System.out.println("Very likely");
                    break;
                case 3:
                    System.out.println("Probably");
                    break;
                case 4:
                    System.out.println("No");
                    break;
                case 5:
                    System.out.println("Not likely");
                    break;
                case 6:
                    System.out.println("Stop asking");
                    break;
                case 7:
                    System.out.println("Definitely");
                    break;
                case 8:
                    System.out.println("No chance");
                    break;
                case 9:
                    System.out.println("Probably not");
                    break;
                default:
                    System.out.println("Internal Error: Randomizer returned an integer not included in the switch statement");
            }
                }
            }
        }
    }
}