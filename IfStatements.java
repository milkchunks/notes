public class IfStatements {
    public static void main(String[] args) {
    IfStatements ex = new IfStatements();
    ex.greaterThanLessThan();
    ex.redefiningVariables();
    ex.andAndIf();
    }

    public void greaterThanLessThan() {
        int a = 4;
        int b = 6;
        if(a >b)

        {
            System.out.println("a is greater than b");
        } else

        {
            System.out.println("a is smaller than b");
        }
        System.out.println(a + b);
    }

    public void redefiningVariables() {
        int a = 4;
        int b = 6;
        a = 9; // a now equals nine
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