package Unit2.src.CodingChallenges;
public class UpgradePerson_0202 {
    public static void main(String args[]) {

    }
}

class UpgradedPerson {
    private String name;
    private int age;

    public UpgradedPerson(String name, int age) {
        setName(name);
        setAge(age);
    }

    public UpgradedPerson() {
        this("JohnDoe", 99);
    }

    public String toString(UpgradedPerson person){
        return person.name + ": " + person.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println(age + " Needs to be postive integer. Replacing with default settings");
        }
    }
}

