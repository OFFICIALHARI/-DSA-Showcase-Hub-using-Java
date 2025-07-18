# 📘 Sorted Student List using TreeSet in Java

This mini-project demonstrates the use of **TreeSet** from Java's Collection Framework to store and manage student names in **sorted order automatically**.

---

## 🧠 What is TreeSet?

A `TreeSet` is a class in Java that:
- Stores unique elements only (no duplicates).
- Maintains elements in **sorted ascending order**.
- Uses **Red-Black Tree** internally for performance (O(log n) time for add, remove, search).

---

## 🎯 Project Objective

- Accept a list of student names from the user.
- Store names **without duplicates**.
- Automatically display them in **alphabetical order**.

---

## 💡 Why TreeSet is the Perfect Choice?

| Feature                     | Reason                                                                 |
|----------------------------|------------------------------------------------------------------------|
| ❌ No duplicates allowed    | Avoids storing the same student name multiple times                    |
| 🔤 Sorted output            | Automatically sorts names alphabetically                               |
| ⚙️ Efficient operations     | Fast insertion and retrieval (O(log n) time complexity)                |
| 📦 Built-in functionality  | No need to manually sort or check for duplicates                       |

Compared to `ArrayList` or `HashSet`, `TreeSet` combines both **sorting** and **uniqueness**, making it ideal for this use case.

---

## 🛠️ How to Run the Program

### Requirements:
- Java 8 or later
- Any Java compiler (e.g., `javac`)

### Steps:

1. Clone this repo or copy the files into your system.
2. Open terminal in the project folder.
3. Compile the code:

```bash
javac SortedStudentList.java
