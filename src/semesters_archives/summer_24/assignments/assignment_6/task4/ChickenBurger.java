package semesters_archives.summer_24.assignments.assignment_6.task4;

public class ChickenBurger {
    public String bun;
    public int price;
    public String sauceOption;
    public String spiceLevel;
    private String[] spiceLevels = { "Mild", "Spicy", "Naga", "Extreme" };

    public ChickenBurger() {
        this.bun = "Sesame";
        this.price = 200;
        this.sauceOption = "Less";
        this.spiceLevel = "Not Set";
    }

    public String serveBurger() {
        String result;

        if (this.spiceLevel.equals("Not Set")) {
            result = "Cannot serve now. Customize Spice Level first.";
        } else {
            result = "The burger is being served:-\nBun Type: " + this.bun + "\nPrice: " + this.price
                    + "\nSauce Option: " + this.sauceOption + "\nSpice Level: " + this.spiceLevel;
        }

        return result;
    }

    public void customizeSpiceLevel(String spiceLevel) {
        boolean isLevelValid = false;

        for (String spiceLvl : this.spiceLevels) {
            if (spiceLevel.equals(spiceLvl)) {
                isLevelValid = true;
                break;
            }
        }

        if (isLevelValid) {
            this.spiceLevel = spiceLevel;
            System.out.printf("Spice level set to %s.\n", spiceLevel);
        } else {
            System.out.println("This spice level is unavailable.");
        }
    }
}
