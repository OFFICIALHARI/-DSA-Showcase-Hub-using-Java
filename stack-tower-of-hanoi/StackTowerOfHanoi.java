import java.util.*;

public class StackTowerOfHanoi {
    static Stack<Integer> source = new Stack<>();
    static Stack<Integer> auxiliary = new Stack<>();
    static Stack<Integer> destination = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        // Initialize source tower with disks (largest at bottom)
        for (int i = n; i >= 1; i--) {
            source.push(i);
        }

        System.out.println("\n🏗️ Tower of Hanoi Solver using Stacks");
        printTowers();

        solveHanoi(n, source, destination, auxiliary);

        System.out.println("\n✅ Solved!");
        printTowers();
        sc.close();
    }

    static void solveHanoi(int n, Stack<Integer> src, Stack<Integer> dest, Stack<Integer> aux) {
        if (n == 1) {
            moveDisk(src, dest);
            printTowers();
            return;
        }

        solveHanoi(n - 1, src, aux, dest);
        moveDisk(src, dest);
        printTowers();
        solveHanoi(n - 1, aux, dest, src);
    }

    static void moveDisk(Stack<Integer> from, Stack<Integer> to) {
        int disk = from.pop();
        to.push(disk);
        System.out.println("Move disk " + disk + " from Tower " + getTowerName(from) + " to Tower " + getTowerName(to));
    }

    static String getTowerName(Stack<Integer> stack) {
        if (stack == source) return "A";
        if (stack == auxiliary) return "B";
        if (stack == destination) return "C";
        return "?";
    }

    static void printTowers() {
        System.out.println("Tower A: " + source);
        System.out.println("Tower B: " + auxiliary);
        System.out.println("Tower C: " + destination);
        System.out.println("-------------");
    }
}
