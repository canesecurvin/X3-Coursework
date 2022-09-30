package Unit2.src.CodeChallenges;

import java.io.*;
import java.util.Scanner;

public class LoadPeople_0205 {
    public static void main(String args[]) throws FileNotFoundException {
        UpgradedPerson[] parray = new UpgradedPerson[10];
        int i = 0;
        try {
            File file = new File("people.txt");
            Scanner input = new Scanner(file);
            String type = "";

            String[] line;
            String currentToken = "";
            while(input.hasNextLine()){
                currentToken = input.nextLine();
                line = currentToken.split("\t");
                if (line.length == 1) {
                    type = line[0];
                }else if (type.equals("People")){
                    parray[i] = new UpgradedPerson(line[0], Integer.parseInt(line[1]));
                } else if (type.equals("Students")){
                    parray[i] = new NewStudent(line[0], Integer.parseInt(line[1]), line[2].charAt(0));
                } else if (type.equals("Teachers")){
                    parray[i] = new Teacher(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                }
                if (line.length > 1) {
                    i++;
                }
            }

            input.close();
            UpgradedPerson oldest = new UpgradedPerson("Jane", 0);
            for (UpgradedPerson p: parray){
                if (p.getAge() >= oldest.getAge()){
                    oldest = p;
                }
            }
            FileWriter fw = new FileWriter("people.txt", true);
            PrintWriter salesWriter = new PrintWriter(fw);
            try {
                salesWriter.println("oldest:" + oldest.toString(oldest));
                salesWriter.close();
            }catch (Exception e){System.out.println(e);}
        }catch(IOException e){System.out.println(e);}

    }
}