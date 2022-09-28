package Unit2.src.CodingChallenges;

public class StudentandTeacher_0203 {
}

class Student extends UpgradedPerson{
    private char grade;
    public Student(String name, int age, char grade) {
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
}

class Teacher extends UpgradedPerson {
    private int salary;

    public Teacher(String name, int age, int salary) {
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
}