package Unit2.src;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        ArrayList order = new ArrayList<>();

        if (placeOrder.equalsIgnoreCase("y")) {
            LocalDate.now();
            LocalTime.now();

            System.out.println("Here's the menu: ");
            System.out.println("CUPCAKES: ");
            int itemNumber = 0;
            for (Cupcake c : cupcakeMenu) {
                itemNumber++;
                System.out.print(itemNumber + ": ");
                c.type(" with the price being " + c.getPrice());
            }

            System.out.println("DRINKS: ");
            for (Drink d : drinkMenu) {
                itemNumber++;
                System.out.print(itemNumber + ": ");
                d.type(" with the price being " + d.getPrice());
            }
        } else {
            System.out.println("Have a nice day then");
        }

        boolean ordering = true;
        while (ordering) {
            System.out.println("What would you like to order?");
            Scanner input2 = new Scanner(System.in);
            int orderChoice = input2.nextInt();
            input2.nextLine();

            if (orderChoice == 1){
                order.add(cupcakeMenu.get(0));
                System.out.println("Item added to order");
            } else if (orderChoice == 2){
                order.add(cupcakeMenu.get(1));
                System.out.println("Item added to order");
            } else if (orderChoice == 3){
                order.add(cupcakeMenu.get(2));
                System.out.println("Item added to order");
            } else if (orderChoice == 4){
                order.add(drinkMenu.get(0));
                System.out.println("Item added to order");
            } else if (orderChoice == 5){
                order.add(drinkMenu.get(1));
                System.out.println("Item added to order");
            } else if (orderChoice == 6){
                order.add(drinkMenu.get(2));
                System.out.println("Item added to order");
            } else {System.out.println("Sorry that's not an option");}

            System.out.println("Would you like to continue ordering? (Y/N)");
            placeOrder = input.nextLine();
            if (placeOrder.equalsIgnoreCase("N")){
                ordering = false;
            }
        }
    }
}