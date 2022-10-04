//9.29.22
import java.util.Scanner;
public class inputsmethodsmath { //final exercise
    public static void main(String[] args) {
        System.out.println(favoriteFoods());
    }

    public static int favoriteFoods() { //when collecting numbers use int not String
        Scanner scannerName = new Scanner(System.in);
        System.out.println("Input two integers. Input them on different lines");
        int x = scannerName.nextInt(); //when collecting numbers use int not String
        int y = scannerName.nextInt();
        return x + y;
    }
}
/*
Math
public static void main: public: anything can see it, static: belongs to the class instead of an instance of a class, void: will not return anything
you NEED public static void main(String[] args) for a program to run at all
var stores numbers, decimals, and letters
% modulus = returns remainder of a division sequence
++ increment = adds one to a variable
-- decrement = subtracts one from a variable

Math.pow is the substitute for a carrot, with syntax Math.pow(x, y) where x is raised to the power of y
the reason finalAmountAttempt didn't work because order of operations demands that (1+r/n) is brought to the power of nt BEFORE multiplication,
so put p* OUTSIDE of Math.pow
 */ //Math

/*
User Input
remember to import the class w import java.util.Scanner; ABOVE YOUR CLASS SCOPE
Scanner is an object that you call and give a name

Scanner scannerName = new Scanner(System.in); //this just created a new Scanner
System.out.println("What are we doing?"); //prompt
String answer = scannerName.nextLine(); //stored what scanner has picked up as a string, nextLine looks for a string
System.out.println("We are currently " + answer); //this prints We are currently + what Scanner has picked up from the terminal
System.out.println("How old are you?"); //prompt
int age = scannerName.nextInt(); //nextInt looks for next input
System.out.println("We are currently age " + age);
 */ //User Input

/*
Infinite Loop:
boolean loop = true;
while (loop = true) {
    code here
}
 */ //Infinite Loop

/*
Methods:
a method is a block of code that only runs when called (a function)
overloading is when you have two methods of the same name with different parameters, but the max is two
complicatedMath(8, 10) vs complicatedMath()

overloading and method example:
public static void main(String[] args) {
        System.out.println(complicatedMath());
        System.out.println(complicatedMath(8, 10)); //put the print statement in the main method
        System.out.println(complicatedMath(1, 2)); //this will run complicatedMath with different variables
    }
    public static int complicatedMath() { //no void because it will return an integer
        return 3+5;
    }
    public static int complicatedMath(int x, int y) {
        //int x int y made variables that only work in this method
        //you have to define the variables in the print statement in the main method
        return x + y;
    }
 */ //Methods