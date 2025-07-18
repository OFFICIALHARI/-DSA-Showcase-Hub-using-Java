import java.util.*;

public class SetVoterIdTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> voterIds = new HashSet<>();

        System.out.print("Enter number of voters: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Voter ID: ");
            String id = sc.nextLine();
            if (voterIds.contains(id)) {
                System.out.println("Duplicate entry detected: " + id);
            } else {
                voterIds.add(id);
                System.out.println("Added successfully!");
            }
        }

        System.out.println("\nFinal Unique Voter IDs:");
        for (String id : voterIds) {
            System.out.println(id);
        }

        sc.close();
    }
}
