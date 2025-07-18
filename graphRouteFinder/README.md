# Graph Route Finder

## 📌 What is the Data Structure Used?
**Graph (Adjacency List using HashMap and ArrayList)**  
Each city is a node, and the connection (route) between cities is an edge. The graph is stored using a `HashMap` where the key is the city name, and the value is a list of connected cities.

---

## ✅ Use Case

- Find if a route exists between two cities (e.g., Chennai to Mumbai).
- Useful in route navigation, maps, delivery path checks, and network design.

---

## 🤔 Why is Graph a Perfect Choice for this Project?

- **Real-world Representation**: Cities and roads naturally form a graph.
- **Efficient Lookups**: HashMap provides fast access to neighboring cities.
- **Dynamic Connections**: New cities or routes can be added easily.
- **DFS/BFS Traversal**: Enables checking paths between cities.

---