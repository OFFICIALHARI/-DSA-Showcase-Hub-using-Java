import java.util.Scanner;

public class InventoryManagement {
    static final int MAX_ITEMS = 100;
    static String[] itemNames = new String[MAX_ITEMS];
    static int[] quantities = new int[MAX_ITEMS];
    static int itemCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n== Inventory Management ==");
            System.out.println("1. Add new item");
            System.out.println("2. Update item quantity");
            System.out.println("3. View stock");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addItem(sc);
                case 2 -> updateItem(sc);
                case 3 -> viewStock();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    static void addItem(Scanner sc) {
        if (itemCount >= MAX_ITEMS) {
            System.out.println("Inventory full!");
            return;
        }

        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        sc.nextLine(); // Consume newline

        itemNames[itemCount] = name;
        quantities[itemCount] = qty;
        itemCount++;

        System.out.println("Item added successfully.");
    }

    static void updateItem(Scanner sc) {
        System.out.print("Enter item name to update: ");
        String name = sc.nextLine();
        int index = findItemIndex(name);

        if (index == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.print("Enter new quantity: ");
            int qty = sc.nextInt();
            sc.nextLine(); // Consume newline
            quantities[index] = qty;
            System.out.println("Quantity updated.");
        }
    }

    static void viewStock() {
        System.out.println("\n-- Current Stock --");
        if (itemCount == 0) {
            System.out.println("No items in inventory.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                System.out.println(itemNames[i] + " : " + quantities[i] + " units");
            }
        }
    }

    static int findItemIndex(String name) {
        for (int i = 0; i < itemCount; i++) {
            if (itemNames[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
}
