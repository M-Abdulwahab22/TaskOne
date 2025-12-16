public class Person {
    String name;
    int age;
    /*
    * this is the constructor which is a special type of method that initialize instance variables.
    * by adding parameters to the constructor we can pass the values when creating the new object.*/
    public Person (String name , int age) {
        this.name = name;
        this.age = age;
    }
    /*
    * this is the hello method it has a return type of void so it doesn't return a value
    * it prints out the sentence in the console
    * it is called by the objects created from this class like this : person1.hello()*/
    public void hello () {
        System.out.println("Hello, my name is " + name + " and i am " + age + " years old");
    }
    public static void main(String[] args) {
        Person person1 = new Person("Ahmed",22);
        Person person2 = new Person("Omar",25);
        person1.hello();
        person2.hello();
    }
}