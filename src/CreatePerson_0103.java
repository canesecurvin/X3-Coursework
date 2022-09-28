import java.util.Scanner;

public class CreatePerson_0103 {
    public static void main(String[] args) {
        //
    }
}

class Person {
    public String name;
    public int age;

    public String toString(Person person){
        return person.name + ": " + person.age;
    }
}