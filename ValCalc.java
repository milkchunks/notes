import java.util.Scanner;
import java.util.ArrayList;
public class ValCalc {
    final static Double minGameTime = 9.333333332;
    final static Double maxGameTime = 16.333333331;
    static Integer xp;

    static Integer lvl;
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What battle pass level are you on?");
        lvl = scanner.nextInt();
        System.out.println("Do you have the premium battle pass track? (y/n)");
        String yn = scanner.next();
        if (yn.equalsIgnoreCase("y")) {
            xp = 1030;
        } else if (yn.equalsIgnoreCase("n")) {
            xp = 1000;
        } else {
            System.out.println("Error: Invalid answer");
        }
        //1k xp per game, so how many games until you meet lvl 50?
        double gameNum = calcLvlXp()/xp;
        double maxMinutes = gameNum * maxGameTime;
        double minMinutes = gameNum * minGameTime;
        double avgMinutes = (minMinutes + maxMinutes) / 2;
        list.add((int) Math.floor(maxMinutes/60));
        list.add((int) maxMinutes % 60);
        list.add((int) Math.floor(minMinutes/60));
        list.add((int) minMinutes % 60);
        list.add((int) Math.floor(avgMinutes/60));
        list.add((int) avgMinutes % 60);
        //double avgTime = (maxTime + minTime) / 2;
        System.out.println("Max Time: " + list.get(0) + "h " + list.get(1) + "m, " + "Min Time: " + list.get(2) + "h " + list.get(3) + "m, " + "Avg Time: " + list.get(4) + "h " + list.get(5) + "m");
    }
    public static Integer calcLvlXp() {
        Integer lvl2;
        lvl2 = 50-lvl;
        Integer x;
        if (lvl == 1) {
            x = 0;
        } else {
            x = 1250;
        }
        Integer y;
        //calculates how much xp you have earned to get to your current level
        if (lvl != 1) {
            for (int i = 1; i <= lvl; i++) {
                x = x + 750;
            }
        } else {

        }
        y = x;
        //calculates how much xp you need for lvl 50
        for (int i=1; i<=lvl2; i++) {
            y = y + x;
            x = x + 750;
        }
        //returns how much xp you need for lvl 50
        return y;
    }
}