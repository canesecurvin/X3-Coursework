public class Allowed_0102 {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "Bob";
        names[1] = "Alphonse";
        names[2] = "Lily";
        names[3] = "Marcus";
        names[4] = "Jess";

        int[] ages = new int[] { 28, 30, 25, 22, 20 };

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase("Bob") || ages[i] < 24) {
                System.out.println(i + ": Banned");
            } else { System.out.println(i + ": Allowed"); }
        }
    }
}