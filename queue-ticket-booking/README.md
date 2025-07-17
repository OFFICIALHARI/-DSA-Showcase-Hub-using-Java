# 🎟️ Queue – Ticket Booking System

## 💡 What is a Queue?
A **Queue** is a linear data structure that follows the **FIFO** (First In, First Out) principle. Elements are added at the rear and removed from the front.

## 🧩 Use Case
This project simulates a **ticket booking system** where users book tickets and are served in the order they arrive—just like in a real-world queue.

## ✅ Why Queue is the Perfect Choice?
- In real-life scenarios like ticket counters, customers are served in the order they arrive.
- Queue handles such scenarios efficiently by ensuring no one jumps ahead.
- Maintains fairness and order in processing.

## 🧪 Inputs and Outputs
| Action           | Input            | Output                            |
|------------------|------------------|-----------------------------------|
| Book Ticket      | Name (e.g., Ravi)| Adds to queue                     |
| Show Queue       | —                | Displays current queue order      |
| Serve Next       | —                | Removes and confirms next booking |
| Exit             | —                | Ends the program                  |

## 🛠️ How to Run
1. Make sure Java is installed.
2. Save the code in a file: `QueueTicketBooking.java`
3. Open terminal/command prompt:
```bash
javac QueueTicketBooking.java
java QueueTicketBooking
