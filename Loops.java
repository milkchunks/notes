public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { //i <= 5 is how many times you want it to loop, i=1 doesn't really matter
            System.out.println(i);//this prints numbers up to 5
        }
        int var = 0;
        while (var < 5) {
            var++;
            System.out.println(var);
        }
        String[] stringArray = {"very good", "good", "ok", "bad", "very bad"};
        for (String s : stringArray) {
            System.out.println(s);
            if (s == "ok") {
                break;
            }
            //this prints each object in an array
            //now it will only print up to ok
        }
        /*
        do {
            //System.out.println("hi");, this prints while infinitely
        } while (var < 6) ;
        }
         */
    }
}