package Unit2.src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
                System.out.println(itemNumber + ": " + c.type(" with the price being $") + c.getPrice() + "0");
            }

            System.out.println("DRINKS: ");
            for (Drink d : drinkMenu) {
                itemNumber++;
                System.out.println(itemNumber + ": " + d.type(" with the price being $") +  + d.getPrice() + "0");
            }
        } else {
            System.out.println("Have a nice day then");
        }

        boolean ordering = true;
        double subTotal = 0.0;
        while (ordering) {
            System.out.println("What would you like to order?");
            Scanner input2 = new Scanner(System.in);
            int orderChoice = input2.nextInt();
            input2.nextLine();

            if (orderChoice == 1){
                order.add(cupcakeMenu.get(0).toString());
                subTotal += cupcakeMenu.get(0).getPrice();
                System.out.println(cupcakeMenu.get(0).toString() + " added to order with price of " + cupcakeMenu.get(0).getPrice());
            } else if (orderChoice == 2){
                order.add(cupcakeMenu.get(1).toString());
                subTotal += cupcakeMenu.get(1).getPrice();
                System.out.println(cupcakeMenu.get(1).toString() + " added to order with price of " + cupcakeMenu.get(1).getPrice());
            } else if (orderChoice == 3){
                order.add(cupcakeMenu.get(2).toString());
                subTotal += cupcakeMenu.get(2).getPrice();
                System.out.println(cupcakeMenu.get(2).toString() + " added to order with price of " + cupcakeMenu.get(2).getPrice());
            } else if (orderChoice == 4){
                order.add(drinkMenu.get(0).toString());
                subTotal += drinkMenu.get(0).getPrice();
                System.out.println(drinkMenu.get(0) + " added to order with price of " + drinkMenu.get(0).getPrice());
            } else if (orderChoice == 5){
                order.add(drinkMenu.get(1).toString());
                subTotal += drinkMenu.get(1).getPrice();
                System.out.println(drinkMenu.get(1) + " added to order with price of " + drinkMenu.get(1).getPrice());
            } else if (orderChoice == 6){
                order.add(drinkMenu.get(2).toString());
                subTotal += drinkMenu.get(2).getPrice();
                System.out.println(drinkMenu.get(2) + " added to order with price of " + drinkMenu.get(2).getPrice());
            } else {System.out.println("Sorry that's not an option");}

            System.out.println("Would you like to continue ordering? (Y/N)");
            placeOrder = input.nextLine();
            if (placeOrder.equalsIgnoreCase("N")){
                System.out.println("Your subtotal is $" + subTotal + "0");
                ordering = false;
            }
        }

        new CreateFile();
        new WriteToFile(order, subTotal);
    }
}

class CreateFile {
    public CreateFile(){
        try{
            File salesData = new File("salesData.txt");
            if (salesData.createNewFile()){
                System.out.println("File created: " + salesData.getName());
            }else {
                System.out.println("File already exists");
            }
        }catch(Exception e){
            System.out.println("an error occured: " + e);
        }
    }
}

class WriteToFile {
    public WriteToFile(ArrayList<Object> order, double subtotal){
        try {
            FileWriter fw = new FileWriter("salesData.txt");
            PrintWriter salesWriter = new PrintWriter(fw);

            for (Object o: order){
                salesWriter.println("\t\t" + o);
            }
            salesWriter.println("---------------------------------------------------");
            salesWriter.println("Subtotal: \t$" + subtotal + "0");
            salesWriter.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(Exception e){
            System.out.println("An error occured");
        }
    }
}