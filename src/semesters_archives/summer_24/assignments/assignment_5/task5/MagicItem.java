/*
 * Copyright (c) 2024 Tanzeebul Tamim
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package semesters_archives.summer_24.assignments.assignment_5.task5;

public class MagicItem {
    private class Item {
        private String itemName;
        private int boost;

        private Item(String itemName, int boost) {
            this.itemName = itemName;
            this.boost = boost;
        }
    }

    private String characterName;
    private int energyLevel;
    private Item[] items;
    private int itemCount;

    public void newCharacter(String characterName) {
        this.characterName = characterName;
        items = new Item[3];
    }

    public void displayInfo() {
        System.out.printf("Character Name: %s\n", characterName);
        System.out.printf("Energy Level: %d\n", energyLevel);

        for (int i = 0; i < items.length; i++) {
            String itemName = items[i] == null ? "null" : items[i].itemName;
            System.out.printf("Item %d: %s\n", i + 1, itemName);
        }
    }

    public void findItem(String foundItem) {
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

        items[itemCount++] = new Item(foundItem, boost);
        System.out.printf("%s found a %s\n", this.characterName, foundItem);

    }

    public void useItem(String usedItem) {
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
