import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true); // accessOrder = true for LRU behavior
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public void displayCache() {
        System.out.println("Current Cache: " + this);
    }
}

public class LRUCacheSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cache capacity: ");
        int capacity = sc.nextInt();

        LRUCache<Integer, String> cache = new LRUCache<>(capacity);

        while (true) {
            System.out.println("\n1. Put item\n2. Get item\n3. Display cache\n4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int key = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter value: ");
                    String value = sc.nextLine();
                    cache.put(key, value);
                    break;

                case 2:
                    System.out.print("Enter key to access: ");
                    int getKey = sc.nextInt();
                    if (cache.containsKey(getKey)) {
                        System.out.println("Value: " + cache.get(getKey));
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 3:
                    cache.displayCache();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
