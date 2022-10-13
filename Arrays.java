import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Arrays {
    public static void main(String[] args) {
        //Array Lists
        //you have to use the wrapper class of your data type
        //YOU NEED THE IMPORT STATEMENT
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        intArr.add(7);
        intArr.add(9);
        int intArrGetter = intArr.get(0); // this just got the integer in the 0th place on the array (first place)
        System.out.println(intArrGetter); // this prints the 0th place
        System.out.println(intArr); // this prints the entire array
        intArr.set(1, 2); // now the array will print [1, 2]
        intArr.add(4);
        intArr.add(1);
        intArr.add(10);
        intArr.add(8);
        intArr.add(0);
        Collections.sort(intArr);
        for (int i : intArr) { // int i : intArr will make the for loop print intArr until there are no more numbers to print (this works for printing any parsed string or any array)
            System.out.println(i);
            System.out.println(intArr.toString()); //this prints it as a string
        }

        String equation = "3 + 3";
        ArrayList<String> nums = new ArrayList<>(List.of(equation.split(" ")));
        System.out.println(nums.toString());
        System.out.println(Integer.parseInt(nums.get(0) + Integer.parseInt(nums.get(2)))); //this wont print 6 it prints string place 0 and string place 2 next to each other
    }
    public static void castingStrings() {
        //Casting with Strings
        int[] myInt;
        double[] myDouble;
        String[] myString = {"yes", "no"};
        String a = myString[0]; //this just casted omg to a string instead of an array
        int x = myString[0].length();
    }
    public static void printingWithSplit() {
        //Printing with .split()
        String sentence = "My cat is walking my dog";
        String[] brokenSentence = sentence.split(" "); //whatever is in the quotes on .split("") will get removed from the string
        for (String s : brokenSentence) {
            System.out.println(sentence); //i have no idea why this prints six times and i wont question it
        }
        //rejects (the .split()) rejects (removes) a certain part of a string
    }
    public static void parsingStrings() {
        //Parsing strings
        String equation = "3 + 3";
        String[] num0 = equation.split(" "); //this removed the spaces from the equation
        int answer = Integer.parseInt(num0[0]) + Integer.parseInt(num0[2]); //this zero gives what place the character in the string is (so the + would be [1] because the spaces were taken out and the first place is place 0
        //parse.Int breaks the string into characters, and the place of the character is what is in the brackets
        System.out.println("answer:");
        System.out.println(answer);
        int[][] map = {{1, 2, 3}, {4, 5, 6}}; //this just stored two arrays under one name
    }
    public static void arrayLists() {
            //Array Lists
            //you have to use the wrapper class of your data type
            //YOU NEED THE IMPORT STATEMENT
            ArrayList<Integer> intArr = new ArrayList<Integer>();
            intArr.add(8);
            intArr.add(9);
            int intArrGetter = intArr.get(0); // this just got the integer in the 0th place on the array (first place)
            System.out.println(intArrGetter); // this prints the 0th place
            System.out.println(intArr); // this prints the entire array
            intArr.set(1, 2); // now the array will print [1, 2]
    }
}
/*
arrays are any data type followed by brackets
ARRAYS ARE SIGNIFIED BY [], SO int[] is an int array
use {} for the list ends (so like {1, 2, 3})
 */