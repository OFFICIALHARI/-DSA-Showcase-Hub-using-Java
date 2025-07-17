package util;
import java.util.*;

class Patient {
    String name;
    int priority;

    Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}

public class PriorityQueueER {
    PriorityQueue<Patient> queue;

    public PriorityQueueER() {
        queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.priority));
    }

    public void addPatient(String name, int priority) {
        queue.add(new Patient(name, priority));
        System.out.println(name + " added with priority " + priority);
    }

    public void treatNext() {
        if (!queue.isEmpty()) {
            Patient next = queue.poll();
            System.out.println("Treating patient: " + next.name);
        } else {
            System.out.println("No patients in queue.");
        }
    }

    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Current Queue:");
        for (Patient p : queue) {
            System.out.println("- " + p.name + " (priority: " + p.priority + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueueER er = new PriorityQueueER();

        while (true) {
            System.out.println("\n1. Add Patient\n2. Treat Next\n3. Show Queue\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter priority (1 = High): ");
                    int p = sc.nextInt();
                    er.addPatient(name, p);
                    break;
                case 2:
                    er.treatNext();
                    break;
                case 3:
                    er.showQueue();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
