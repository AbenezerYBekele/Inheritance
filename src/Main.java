public class Main {
    public static void main(String[] args) {
        ModArrayList listy = new ModArrayList();
        listy.add(2);
        listy.add(47);
        listy.add(42);
        listy.add(35);

        System.out.println(listy.getUsingMod(1));
        System.out.println(listy.getUsingMod(-2));
        System.out.println(listy.getUsingMod(-40));
    }
}