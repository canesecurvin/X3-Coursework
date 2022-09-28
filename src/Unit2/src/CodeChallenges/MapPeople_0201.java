package Unit2.src.CodeChallenges;

import java.util.*;

public class MapPeople_0201 {
    public static void main(String args[]) {
        Person bob = new Person();
        bob.name = "Bob";
        bob.age = 28;

        Person alphonse = new Person();
        alphonse.name = "Alphonse";
        alphonse.age = 30;

        Person lily = new Person();
        lily.name = "Lily";
        lily.age = 25;

        Person marcus = new Person();
        marcus.name = "Marcus";
        marcus.age = 22;

        Person jess = new Person();
        jess.name = "Jess";
        jess.age = 20;

        Person[] persons = new Person[] { bob, alphonse, lily, marcus, jess };
        int[] ids = {13530, 48851, 97531, 25545, 92862};
        int i = 0;

        HashMap<Integer, Object> People = new HashMap<Integer, Object>();
        for (Person p: persons) {
            People.put(ids[i], p);
            System.out.println(ids[i] + "," + p.toString(p));
//            people.values
            i++;
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID");
        //create Person object by searching through hashmap by ID, then print the toString version
        Person tmpPerson = (Person) People.get(input.nextInt());
        System.out.println(tmpPerson.toString(tmpPerson));
    }
}

class Person {
    public String name;
    public int age;

    public String toString(Person person){
        return person.name + ": " + person.age;
    }
}