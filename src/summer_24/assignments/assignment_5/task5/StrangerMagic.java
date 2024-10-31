package summer_24.assignments.assignment_5.task5;

public class StrangerMagic {
    public static void main(String[] args) {
        MagicItem char1 = new MagicItem();
        MagicItem char2 = new MagicItem();

        char1.newCharacter("Eleven");
        char2.newCharacter("Mike Wheeler");

        System.out.println("1 ==========");
        char1.displayInfo();
        System.out.println("2 ==========");
        char2.displayInfo();
        System.out.println("3 ==========");
        char1.findItem("Potion");
        char1.findItem("Elixir");
        char1.findItem("Elixir");
        char2.findItem("Potion");
        System.out.println("4 ==========");
        char1.findItem("Amulet");
        System.out.println("5 ==========");
        char1.displayInfo();
        System.out.println("6 ==========");
        char1.useItem("Potion");
        char1.useItem("Elixir");
        System.out.println("7 ==========");
        char1.displayInfo();
        System.out.println("8 ==========");
        char1.findItem("Amulet");
        System.out.println("9 ==========");
        char1.displayInfo();
        System.out.println("10 ==========");
        char2.useItem("Amulet");
        System.out.println("11 ==========");
        char2.displayInfo();
    }
}
