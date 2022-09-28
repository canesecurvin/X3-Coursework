package Unit1.src;

public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String ColonyName = "Cece's Colony";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        ShipFood -= (ShipPopulation * .75);
        ShipFood -= (ShipPopulation * .75);
        System.out.println(ShipFood);

        ShipFood += ShipFood*.5;
        ShipPopulation += 5;

        String LandingLocation = "The Ocean";
        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");}

        Landing = LandingCheck(15);
        new GuessingGame();
        new MarsExpedition();
        new FindingLists();
    }
    public static boolean LandingCheck(int Loops) throws InterruptedException {
        for (int i = 0; i <= Loops; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Keep Center");
            } else if (i % 5 == 0) {
                System.out.println("Right");
            } else if (i % 3 == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}