class Dog {
    // properties
    String breed;
    String name;
    int age;
  
    // behavior
    public void bark() {
      System.out.println("Woof!");
    }
  }

public class Main {
    public static void main(String[] args) {
        // create an object of the Dog class
        Dog myDog = new Dog();
    
        // set the properties of the dog
        myDog.breed = "German Shepherd";
        myDog.name = "Buddy";
        myDog.age = 3;
    
        // call the behavior of the dog
        myDog.bark();
      }
}
