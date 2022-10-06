import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("Type in the name of a drink that you want to drink right now.");
        Scanner drinkScanner = new Scanner(System.in);
            var drink = drinkScanner.nextLine();
            switch (drink) {
                case "pepsi":
                    System.out.println("Vending: Pepsi");
                    break;
                case "coke":
                    System.out.println("Vending: Coke");
                    break;
                case "lemonade":
                    System.out.println("Vending: Lemonade");
                    break;
                case "root beer":
                    System.out.println("Vending: Root Beer");
                    break;
                default:
                    System.out.println("We don't have the drink you asked for.");
                    break;
            }
            //this rounded bigNumber down by casting it to an int
            double bigNumber = 18.67358782347582375832785279052;
            bigNumber = (int) bigNumber;
            System.out.println(bigNumber);

            bigNumber = 18.67358782347582375832785279052;
            String stringedBigNumber = String.valueOf(bigNumber);
            System.out.println(bigNumber);
    }
}
