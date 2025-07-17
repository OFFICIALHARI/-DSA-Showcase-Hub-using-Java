import java.util.*;

public class QueueTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> bookingQueue = new LinkedList<>();

        System.out.println("🎟️ Ticket Booking System 🎟️");
        while (true) {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Show Queue");
            System.out.println("3. Serve Next");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    bookingQueue.offer(name);
                    System.out.println("✅ Ticket booked for " + name);
                    break;
                case 2:
                    System.out.println("🧾 Booking Queue: " + bookingQueue);
                    break;
                case 3:
                    if (!bookingQueue.isEmpty()) {
                        String next = bookingQueue.poll();
                        System.out.println("🎫 " + next + "'s ticket confirmed. Next!");
                    } else {
                        System.out.println("🚫 No bookings left.");
                    }
                    break;
                case 4:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice.");
            }
        }
    }
}
