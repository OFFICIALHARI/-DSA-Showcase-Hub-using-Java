package util;

import java.util.*;

public class GraphRouteFinder {
    private Map<String, List<String>> graph;

    public GraphRouteFinder() {
        graph = new HashMap<>();
    }

    public void addCity(String city) {
        graph.putIfAbsent(city, new ArrayList<>());
    }

    public void addRoute(String city1, String city2) {
        graph.get(city1).add(city2);
        graph.get(city2).add(city1); // assuming it's an undirected graph
    }

    public boolean hasRouteDFS(String start, String end) {
        Set<String> visited = new HashSet<>();
        return dfs(start, end, visited);
    }

    private boolean dfs(String current, String end, Set<String> visited) {
        if (current.equals(end)) return true;
        visited.add(current);
        for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
            if (!visited.contains(neighbor) && dfs(neighbor, end, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GraphRouteFinder finder = new GraphRouteFinder();

        finder.addCity("Chennai");
        finder.addCity("Bangalore");
        finder.addCity("Hyderabad");
        finder.addCity("Mumbai");

        finder.addRoute("Chennai", "Bangalore");
        finder.addRoute("Bangalore", "Hyderabad");
        finder.addRoute("Hyderabad", "Mumbai");

        System.out.print("Enter start city: ");
        String start = sc.nextLine();

        System.out.print("Enter destination city: ");
        String end = sc.nextLine();

        if (finder.hasRouteDFS(start, end)) {
            System.out.println("Route exists between " + start + " and " + end);
        } else {
            System.out.println("No route found between " + start + " and " + end);
        }
    }
}
