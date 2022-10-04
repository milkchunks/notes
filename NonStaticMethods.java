//10.4.22
public class NonStaticMethods {
    public static void main(String[] args) {
        NonStaticMethods ex = new NonStaticMethods();
        ex.nonstaticmethod();
    }
   public void nonstaticmethod() {
       System.out.println("bugatti");
   }
}
/*
if a method is nonstatic you can't just type System.out.println(nonstaticmethod()); and expect it to run
you have to create an instance of your object before running a nonstatic method
the print statement to 'run' a static method is only if the method returns something you want to print
to run a method that you don't need to print, you would just type method();
 */