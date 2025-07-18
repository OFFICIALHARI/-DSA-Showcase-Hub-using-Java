import java.util.Map;
import java.util.TreeMap;

public class StudentScoreboard {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> scoreboard = new TreeMap<>();

        // Insert student marks: rollNo -> marks
        scoreboard.put(102, 85);
        scoreboard.put(101, 78);
        scoreboard.put(105, 92);
        scoreboard.put(104, 74);
        scoreboard.put(103, 88);

        System.out.println("📘 Sorted Student Scoreboard:");
        for (Map.Entry<Integer, Integer> entry : scoreboard.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " | Marks: " + entry.getValue());
        }

        // Update marks
        scoreboard.put(104, 80);
        System.out.println("\n✅ Updated Marks for Roll No 104 to 80");

        // Get student with lowest and highest roll number
        System.out.println("\n🎯 First Roll No: " + scoreboard.firstKey());
        System.out.println("🎯 Last Roll No: " + scoreboard.lastKey());
    }
}
