public class Lists{
    public static void main(String[] args) {
        Integer i = 0;
        Double d = i.doubleValue();
        System.out.println(i + d);
    }

    /* this makes DriveLeft a child of Drive
    class Drive extends DriveLeft{
        protected String no = "no";
        protected String yes = "yes";
        Drive driveNow = new Drive();
        driveNow.yes();
    }
    class DriveLeft {
        public void yes() {
            System.out.println("yes");
        }
    }
     */
}
/*
return i instanceof Integer; will return a true or false depending on what type of object
i think you need to declare the method as a boolean though
Integer is not a primitive type
int is

utility method to cast:
Integer i = 0;
Double d = i.doubleValue();

if you want to check if two strings arent equal to some text, do this:
if (!"<content you want to check that the string isn't equal to>".equals(<string name>))
*/
