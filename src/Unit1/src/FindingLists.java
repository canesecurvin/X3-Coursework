package Unit1.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingLists {
    public FindingLists() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

        ArrayList<String> rockList = new ArrayList<String>();
        System.out.println("Rock data downloaded");
        rockList.add(0, "rock");
        rockList.add(1, "weird rock");
        rockList.add(2, "smooth rock");
        rockList.add(3, "not rock");
        System.out.println(rockList);

        System.out.println("Wait a second that last one is not a rock we need to delete that one from the list.");
        rockList.remove(3);
        System.out.println(rockList);
        System.out.println("Perfect!");

        Thread.sleep(500);
        HashMap<String, String> fossilDirectory = new HashMap<String, String>();
        System.out.println("Fossil data downloaded");
        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water ");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important?");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        if (fossilChoice.equals("Bird Fossil")){
            System.out.print("Fossil: " + fossilChoice +
                            "\nFossil Directory: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equals("Fish Fossil")){
            System.out.print("Fossil: " + fossilChoice +
                    "\nFossil Directory: " + fossilDirectory.get(fossilChoice));
        } else {
            System.out.print("Fossil: " + fossilChoice +
                    "\nFossil Directory: " + fossilDirectory.get(fossilChoice));
        }

        Thread.sleep(500);
        HashSet<String> suppliesBrought = new HashSet<String>();
        HashSet<String> suppliesUsed = new HashSet<String>();

        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");

        System.out.println("\nMedicine");
    }
}