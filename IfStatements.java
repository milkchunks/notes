//10.4.22
public class IfStatements {
    public static void main(String[] args) {
    IfStatements ex = new IfStatements();
    ex.greaterThanLessThan();
    ex.redefiningVariables();
    ex.andAndIf();
    ex.nonStaticMethods();
    }
    public void nonStaticMethods() {
        System.out.println("This method is nonstatic, meaning that it's good and we use it in robotics");
    }
    public void greaterThanLessThan() {
        int a = 4;
        int b = 6;
        System.out.println("greaterThanLessThan");
        if(a >b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is smaller than b");
        }
        System.out.println(a + b);
    }

    public void redefiningVariables() {
        int a = 4;
        int b = 6;
        a = 9; // a now equals nine
        System.out.println("redefiningVariables");
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is smaller than b");
        }
        a += b;
        System.out.println(a);
    }

    public void andAndIf() {
        int x = 3;
        System.out.println("andAndIf");
        if (x > 2 && x < 6) { //this is how you would use the && operator
            System.out.println("x is in between 2 and 6");
        }
        /*
        int y = 2;
        if (y = 3 || y = 2) {
            System.out.println("y is either 2 or 3");
        }
        this is how you would use the || operator but if i don't comment this out none of my classes will run
        */
    }
}

/*
you have to type (a == b) to check if a = b because (a = b) tries to set a equal to b
a += b means a = a+b
!= is the operator for =/=
&& - and
|| - or
*/

/*
if a method is nonstatic you can't just type System.out.println(nonstaticmethod()); and expect it to run
you have to create an instance of your object before running a nonstatic method
the print statement to 'run' a static method is only if the method returns something you want to print
to run a method that you don't need to print, you would just type method();
basically just type <document name> <method name (like ex)> = new <document name>();
for this document it would be IfStatements ex = new IfStatements();
then to run the method it would be ex.methodOne();
 */

/*
methods that use int as a keyword (public static int) need a return statement to tell the main method what integer it's storing
if your int method is basically 200 lines of math, you would use public static int and use a return statement for the calculation as "return <equation>"
 */