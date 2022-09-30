package Unit2.src.CodeChallenges;

public class InheritedIntros_0204 {
    public static void main(String args[]){
        new UpgradedPerson("Lah", 30).introduce();
        new NewStudent("Paul", 29, 'A').introduce();
        new NewTeacher("Ralph", 30, 24000).introduce();
        new NewTeacher("Sam", 78, 34000).introduce("Paul");
    }
}

class NewStudent extends UpgradedPerson{
    private char grade;
    public NewStudent(String name, int age, char grade) {
        //this("Johndoe", 99, "B"): if constructor has no arguments
        super(name, age);
        setGrade(grade);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        //make sure to validate
        this.grade = grade;
    }

    public String toString(NewStudent s){
        return s.getName() + ": " + s.getAge();
    }
}

class NewTeacher extends UpgradedPerson {
    private int salary;

    public NewTeacher(String name, int age, int salary) {
        super(name, age);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        //make sure to validate
        this.salary = salary;
    }

    @Override
    public void introduce(){
        System.out.println("Hello, I'm Professor " + getName());
    }

    public void introduce(String otherName){
        System.out.println("Nice to meet you, " + otherName + "! I'm Professor " + getName());
    }
}