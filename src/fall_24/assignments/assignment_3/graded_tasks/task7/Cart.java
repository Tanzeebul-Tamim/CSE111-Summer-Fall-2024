package fall_24.assignments.assignment_3.graded_tasks.task7;

public class Cart {
    private class Item {
        String itemName;
        double itemPrice;
        double discountPrice;

        Item(String itemName, double itemPrice) {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }
    }

    private int cartNo;
    private int itemCount;
    private Item[] items;
    private String[] itemNames;
    private double[] itemPrices;
    private double discount;
    boolean hasDiscount;

    public Cart() {
        this.items = new Item[3];
        this.itemNames = new String[3];
        this.itemPrices = new double[3];
    }

    void create_cart(int cartNo) {
        this.cartNo = cartNo;
    }

    void addItem(String itemName, double itemPrice) {
        if (itemCount < 3) {
            Item item = new Item(itemName, itemPrice);

            items[itemCount] = item;
            itemNames[itemCount] = item.itemName;
            itemPrices[itemCount] = item.itemPrice;
            itemCount++;

            System.out.printf("%s added to cart %d.\n", itemName, this.cartNo);
            System.out.printf("You have %d item(s) in your cart now.\n", this.itemCount);
        } else {
            System.out.printf("You already have %d items in your cart.\n", this.itemCount);
        }
    }

    void addItem(double itemPrice, String itemName) {
        addItem(itemName, itemPrice);
    }

    void giveDiscount(int discountPercentage) {
        for (Item item : items) {
            if (item != null) {
                item.discountPrice = item.itemPrice - item.itemPrice * discountPercentage / 100;
            }
        }

        this.hasDiscount = true;
        this.discount = discountPercentage;
    }

    void cartDetails() {
        System.out.printf("Your cart (c%d) :\n", this.cartNo);
        double total = 0;

        for (Item item : items) {
            if (item != null) {
                System.out.printf("%s - %.2f\n", item.itemName, item.itemPrice);
                total = this.hasDiscount ? total + item.discountPrice : total + item.itemPrice;
            }
        }

        System.out.printf("Discount Applied: %.1f%%\n", this.discount);
        System.out.printf("Total price: %.2f\n", total);
    }

}
