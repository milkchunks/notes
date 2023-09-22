package src;
public class Main {
    public static int subject = 0;
    public static void main(String[] args) {
        for (int i=0; i<=3; i++) {
            subject = (int) (Math.random() * (5 - 0) + 0);
            String verb = References.masterList[(int) (Math.random() * (4 - 0) + 0)];
            System.out.println(verb);
            System.out.println("verb type: " + Sectioning.getVerbEnding(verb));
            System.out.println("verb stem: " + Sectioning.getVerbStem(verb));
            System.out.println("subject: " + subject);
            System.out.println("---");
        }
    }
}
