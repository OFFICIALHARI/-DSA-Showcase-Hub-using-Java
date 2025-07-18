package util;
import java.util.*;

public class LoginSystem {
    HashMap<String, String> users;

    public LoginSystem() {
        users = new HashMap<>();
    }

    public void register(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Username already taken!");
        } else {
            users.put(username, password);
            System.out.println("User registered successfully.");
        }
    }

    public void login(String username, String password) {
        if (users.containsKey(username)) {
            if (users.get(username).equals(password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password!");
            }
        } else {
            System.out.println("User not found!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginSystem ls = new LoginSystem();

        while (true) {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Username: ");
            String username = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            switch (choice) {
                case 1:
                    ls.register(username, password);
                    break;
                case 2:
                    ls.login(username, password);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
