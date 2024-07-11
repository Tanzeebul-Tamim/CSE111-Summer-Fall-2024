package assignments.assignment_5.task5;

public class MagicItem {
    private class Item {
        String itemName;
        int boost;

        Item(String itemName, int boost) {
            this.itemName = itemName;
            this.boost = boost;
        }
    }

    private String characterName;
    private int energyLevel;
    private Item[] items;
    private int itemCount;

    void newCharacter(String characterName) {
        this.characterName = characterName;
        this.energyLevel = 0;
        this.itemCount = 0;
        items = new Item[3];
    }

    void displayInfo() {
        System.out.printf("Character Name: %s\n", characterName);
        System.out.printf("Energy Level: %d\n", energyLevel);

        for (int i = 0; i < items.length; i++) {
            String itemName = items[i] == null ? "null" : items[i].itemName;
            System.out.printf("Item %d: %s\n", i + 1, itemName);
        }
    }

    void findItem(String foundItem) {
        if (itemCount > 2) {
            System.out.println("All item slots occupied.");
            itemCount--;
            return;
        }

        int boost;
        switch (foundItem) {
            case "Potion" -> boost = 50;
            case "Elixir" -> boost = 100;
            case "Amulet" -> boost = 200;
            default -> {
                System.out.printf("Invalid magic item!");
                return;
            }
        }

        items[itemCount] = new Item(foundItem, boost);
        System.out.printf("%s found a %s\n", this.characterName, foundItem);
        itemCount++;

    }

    void useItem(String usedItem) {
        if (itemCount < 0) {
            System.out.println("All item slots occupied.");
            itemCount++;
        } else {
            boolean found = false;

            for (int i = 0; i < items.length; i++) {
                Item item = items[i];

                if (item != null && item.itemName.equals(usedItem)) {
                    this.energyLevel += item.boost;
                    items[i] = null;
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.printf("%s used a %s\n", this.characterName, usedItem);
                System.out.printf("Energy Level after using item: %d\n", this.energyLevel);
                itemCount--;
            } else {
                System.out.println("Item not in inventory.");
            }
        }
    }
}
