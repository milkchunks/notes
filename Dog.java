public class Dog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
    public void bark() {
        System.out.println("woof");
    }
    public void eat() {
        System.out.println("chomp!");
    }
}

/*this is an example of how you would use nonstatic methods, though i have no idea why you would use them instead of static methods
i googled it and google said that it's because nonstatic methods can call any static variable/method without using the object of the class
*/