import java.util.Scanner;

public class FindbyName_0104 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Bob";
        names[1] = "Alphonse";
        names[2] = "Lily";
        names[3] = "Marcus";
        names[4] = "Jess";

        int[] ages = new int[] { 28, 30, 25, 22, 20 };

        Person[] parray = new Person[5];

        for (int i = 0; i < names.length; i++){
            parray[i] = new Person();

            parray[i].name = names[i];
            parray[i].age = ages[i];
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Hi You! Enter Your name and submit by clicking 'enter' key.");

        String name = input.nextLine();
        for(Person p: parray) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.print(p.toString(p));
            }
        }

    }
}