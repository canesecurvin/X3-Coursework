package Unit2.src;

import java.util.ArrayList;
import java.util.Scanner;

public class CupcakeWeek {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type("");
        Scanner input = new Scanner(System.in);
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();

        Double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        redVelvet.type("");
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();

        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");
        chocolate.type("");
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();

        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        System.out.println(cupcakeMenu);




        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are deciding on the price for our water. Here is the description:");
        water.type("");
        input = new Scanner(System.in);
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();

        price = Double.parseDouble(priceText);
        water.setPrice(price);

        System.out.println("We are deciding on the price for our soda. Here is the description:");
        soda.type("");
        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();

        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        System.out.println("We are deciding on the price for our milk. Here is the description:");
        milk.type("");
        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();

        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        System.out.println(drinkMenu);

        Order o = new Order(cupcakeMenu, drinkMenu);
    }
}

class Cupcake {
    public double price;
    public Cupcake(){

    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String type(String append){
        return "A basic, generic cupcake, with vanilla frosting" + append;
    }

    @Override
    public String toString(){
        return "$" + getPrice() + "0 - " + type("");
    }
}

class RedVelvet extends Cupcake {
    @Override
    public String type(String append){
        return "A red velvet based cupcake, with cream cheese frosting" + append;
    }
}

class Chocolate extends Cupcake {
    @Override
    public String type(String append){
        return "A chocolate based cupcake, with chocolate frosting" + append;
    }
}

class Drink {
    public double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String type(String append){
        return "A generic drink with no taste, water" + append;
    }

    @Override
    public String toString(){
        return "$" + getPrice() + "0 - " + type("");
    }
}

class Soda extends Drink{
    @Override
    public String type(String append){
        return "A bottle of soda" + append;
    }
}

class Milk extends Drink{
    @Override
    public String type(String append){
        return "A bottle of milk" + append;
    }
}