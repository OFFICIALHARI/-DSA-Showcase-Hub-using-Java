# 🧠 LRU Cache Simulator (Java)

This mini project simulates an **LRU (Least Recently Used) Cache** using Java's `LinkedHashMap`.

---

## 📌 What is LRU Cache?

An **LRU Cache** is a memory-efficient cache system that keeps track of recently used items and automatically evicts the **least recently used** item when it reaches its capacity.

---

## ✅ Why This Project?

- Demonstrates how to use **LinkedHashMap** with access-order to implement LRU behavior.
- Helps understand real-time cache logic used in browsers, databases, mobile apps, etc.
- Easy to test and run via console.

---

## 🛠️ Data Structure Used: `LinkedHashMap`

### Why LinkedHashMap?

- Maintains **insertion/access order**.
- Easy to override `removeEldestEntry()` method.
- Efficient for cache lookups and updates.

---

## 📂 Use Case

- Simulates storing items in cache with limited size.
- Whenever a new item is added and the cache is full, it removes the least recently used item.
- Provides options to put, get, and view current cache.

---

## 🚀 How to Run

1. Compile:
    ```
    javac LRUCacheSimulator.java
    ```

2. Run:
    ```
    java LRUCacheSimulator
    ```

3. Follow console instructions:
    - Choose to put key-value pairs
    - Access values
    - Display current cache state

---


