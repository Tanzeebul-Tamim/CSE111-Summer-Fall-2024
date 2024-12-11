package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task4;

public class Customer {
    private String name;
    private int total;
    private int itemCount;
    private String[] items;
    private int[] prices;
    private boolean fourParams;

    public Customer() {
        this.items = new String[4];
        this.prices = new int[4];
    }

    public void createCustomer(String name) {
        this.name = name;
    }

    public void showCart() {
        System.out.printf("Customer: %s\n", this.name);

        if (itemCount != 0) {
            for (int i = 0; i < itemCount; i++) {
                String item = items[i];
                int price = prices[i];

                if (item != null && price != 0) {
                    System.out.printf("Item: %s Price: %d\n", item, price);
                }
            }
        }
    }

    public void addItem(String item, int price) {
        if (this.itemCount >= 4) {
            System.out.println("Cart is full");
        } else {
            this.items[this.itemCount] = item;
            this.prices[this.itemCount] = price;
            this.itemCount++;
            this.total += price;

            if (!this.fourParams) {
                System.out.printf("%s added to cart\n", item);
            }
        }
    }

    public void addItem(String item1, int price1, String item2, int price2) {
        this.fourParams = true;

        addItem(item1, price1);
        addItem(item2, price2);

        if (this.fourParams) {
            System.out.printf("%s and %s added to cart\n", item1, item2);
        }

        this.fourParams = false;
    }

    public void calculatePrice() {
        System.out.printf("Total: %d\n", this.total);
    }
}
