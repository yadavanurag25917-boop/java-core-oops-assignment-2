# 🎓 GNC SmartCampus - Student Enrollment System

A console-based **Campus Management System** built in Java, demonstrating core Java and OOP concepts including Classes, Collections, Exception Handling, and Multithreading.

---

## 📌 Project Overview

**GNC SmartCampus** is a menu-driven Java application that simulates a basic campus system where:
- Students can be registered
- Courses can be added with fee validation
- Students can be enrolled in courses
- Enrollment is processed asynchronously using Threads

---

## 🛠️ Java Concepts Used

| Concept | Used In |
|---|---|
| **OOP (Classes & Objects)** | `Student`, `Course`, `CampusSystem` |
| **Encapsulation** | Private fields with Getters in all model classes |
| **Custom Exception Handling** | `InvalidFeeException` for negative fee validation |
| **Collections - ArrayList** | Storing students and courses |
| **Collections - HashMap** | Mapping student ID → enrolled courses |
| **Multithreading (Runnable)** | `EnrollmentProcessor` runs in a separate thread |
| **Scanner (User Input)** | Menu-driven interface in `Main.java` |

---

## 📁 Project Structure

```
java-core-oops-assignment-2/
└── src/
    ├── Main.java                  # Entry point, menu-driven UI
    ├── CampusSystem.java          # Core logic - add/enroll/view
    ├── Student.java               # Student model class
    ├── Course.java                # Course model class
    ├── EnrollmentProcessor.java   # Runnable for async enrollment
    └── InvalidFeeException.java   # Custom checked exception
```

---

## ▶️ How to Run

### Prerequisites
- Java JDK 8 or above installed
- Any IDE (VS Code, IntelliJ) or terminal

### Steps

```bash
# Step 1: Navigate to src folder
cd java-core-oops-assignment-2/src

# Step 2: Compile all files
javac Main.java

# Step 3: Run the program
java Main
```

---

## 💻 Program Menu

```
=== GNC SmartCampus ===
1. Add Student
2. Add Course
3. Enroll Student
4. View Students
5. View Enrollments
6. Exit
Enter choice:
```

---

## 🔍 Sample Output

```
Student added: Rahul
Course added: JavaProgramming
Rahul enrolled in JavaProgramming
[Processing] Rahul -> JavaProgramming
[Done] Rahul enrolled in JavaProgramming

GNC | ID=1 | Rahul | rahul@email.com

Student ID: 1
   -> GNC | Course ID=101 | JavaProgramming | 5000.0
```

---

## ⚠️ Exception Handling

If a **negative fee** is entered while adding a course, the system throws a custom exception:

```
Error: Fee cannot be negative: -500.0
```

This is handled using `InvalidFeeException` — a custom checked exception extending `Exception`.

---

## 🧵 Multithreading

Each enrollment triggers a **new Thread** using the `EnrollmentProcessor` class (implements `Runnable`). This simulates asynchronous background processing with a 1-second delay — similar to real-world enrollment confirmation systems.

---

## 👨‍💻 Author

**GNC Java Training — Core Java & OOP Assignment**  
*Submitted as part of Java Training Program*
