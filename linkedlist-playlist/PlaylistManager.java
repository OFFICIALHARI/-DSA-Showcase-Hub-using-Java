package linkedlist.playlist;

import java.util.LinkedList;
import java.util.Scanner;

public class PlaylistManager {
    LinkedList<String> playlist;

    public PlaylistManager() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.addLast(song);
        System.out.println(song + " added to playlist.");
    }

    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println(song + " removed from playlist.");
        } else {
            System.out.println(song + " not found in playlist.");
        }
    }

    public void playNext() {
        if (!playlist.isEmpty()) {
            String song = playlist.removeFirst();
            System.out.println("Now playing: " + song);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void viewPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist:");
            for (String song : playlist) {
                System.out.println("- " + song);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlaylistManager manager = new PlaylistManager();

        while (true) {
            System.out.println("\n1. Add Song\n2. Remove Song\n3. Play Next\n4. View Playlist\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    manager.addSong(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    manager.removeSong(sc.nextLine());
                    break;
                case 3:
                    manager.playNext();
                    break;
                case 4:
                    manager.viewPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting playlist manager...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
