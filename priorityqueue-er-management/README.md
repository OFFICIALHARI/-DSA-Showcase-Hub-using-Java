# 🏥 Emergency Room Management – Priority Queue Mini Project

## 📚 Data Structure Used: Priority Queue

### 🔹 What is a Priority Queue?
A **priority queue** is a special type of queue where each element has a priority. Higher priority elements are served before lower priority ones, regardless of the insertion order.

### 🎯 Use Case
This system simulates how an emergency room treats patients based on their medical priority — not who came first, but who needs help urgently.

### ✅ Why Priority Queue is Perfect Here
- Real-life emergencies are not **first-come-first-serve**.
- Patients with **critical condition (priority = 1)** must be treated **before** those with **minor injuries (priority = 5)**.
- Priority Queue allows us to manage such logic efficiently.

### 🔢 Input
- `Patient name` (String)
- `Priority` (Integer; lower number = higher priority)

### 📤 Output
- Adds patient to queue
- Treats the highest-priority patient first
- Displays next patient to be treated

### ▶️ How to Run
```bash
javac EmergencyRoomManagement.java
java EmergencyRoomManagement
