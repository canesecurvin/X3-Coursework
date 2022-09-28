package Unit1.MarsWeek.src;

public class PrintNames_0101 {
    public static void main(String[] args) {

        String[] names;
        names = new String[]{"Bob", "Alphonse", "Lily", "Marcus", "Jess"};
        int[] ages = {28,30,25,22,20};

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i] + ", " + ages[i]);
        }
    }
}