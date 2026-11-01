# COS 201 — Computer Programming I

Coursework repository for **COS 201 — Computer Programming I** (Java). This repository maintains practical programming assignments, source code, and documentation for Weeks 1 through 3.

---

## Student Information

- **Full Name**: AKINTOLA DAVID OLUWATOBILOBA
- **Matriculation Number**: 25/17078
- **Programme of Study**: COMPUER SCIENCE
- **Department**: COCIS
- **Course**: COS 201 — Computer Programming I
- **Repository URL**: `https://github.com/akintoladavid739-prog/COS201-Computer-Programming-I`

---

## Course Learning Objectives (Weeks 1–3)

- **Week 1**: Understand computer programming and structured problem-solving, the Input-Processing-Output (IPO) model, algorithm design, pseudocode, flowcharts, and the basic structure of a Java program.
- **Week 2**: Configure and verify the Java Development Kit (JDK), compiler (`javac`), and Java Virtual Machine (JVM); understand compilation to bytecode (`.class`); distinguish output methods (`print` vs `println`); handle syntax errors; and manage Git version control.
- **Week 3**: Master variables, constants, primitive and reference data types; apply arithmetic operators and understand type casting / integer division; read keyboard input using `Scanner`; format console output with `printf()`; and implement defensive input validation.

---

## Project Structure

```
COS201-Computer-Programming-I/
├── README.md                      # Project documentation and guide
├── .gitignore                     # Ignores compiled bytecode (.class) and IDE artifacts
├── week01/
│   └── FirstProgram.java          # Week 1: Discipline importance and learning goals
├── week02/
│   ├── HelloWorld.java            # Week 2: Course metadata and environment test
│   └── StudentProfile.java        # Week 2: Interactive student profile generator
├── week03/
│   ├── SimpleCalculator.java      # Week 3: Arithmetic calculator with zero-division check
│   ├── AverageCalculator.java     # Week 3: Course score average calculator with 0-100 range validation
│   └── ItemCost.java              # Week 3: Inventory cost calculator with quantity/price validation
└── docs/
    └── assignment-guide.md        # Comprehensive study guide and lecture note activities
```

---

## Practical Java Programs Overview

| Directory | Java File | Public Class | Description |
|---|---|---|---|
| `week01/` | `FirstProgram.java` | `FirstProgram` | Displays course details, programme placeholder, 3 reasons programming is essential to computing/cybersecurity, and personal learning goals. |
| `week02/` | `HelloWorld.java` | `HelloWorld` | Verifies execution environment, printing course name, week, topic, and objective. |
| `week02/` | `StudentProfile.java` | `StudentProfile` | Interactive console app that reads student name, programme, and course code, then displays a structured profile card. |
| `week03/` | `SimpleCalculator.java` | `SimpleCalculator` | Reads two floating-point numbers, computes sum, difference, product, and safely handles zero divisors before quotient calculation. |
| `week03/` | `AverageCalculator.java` | `AverageCalculator` | Reads student name and 3 course scores, validates scores within $0 \le score \le 100$, and computes total and average using floating-point math. |
| `week03/` | `ItemCost.java` | `ItemCost` | Reads item name, integer quantity ($> 0$), and unit price ($\ge 0.0$), calculating total cost with two-decimal formatted currency output. |

---

## Prerequisites & Environment Setup

To compile and run these Java programs on your computer:

1. **Install Java Development Kit (JDK 21 or higher)**:
   - Official OpenJDK from Eclipse Adoptium: [https://adoptium.net](https://adoptium.net)
   - Official Oracle JDK: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
2. **Verify Installation in your Terminal / Command Prompt**:
   ```bash
   java -version
   javac -version
   ```
   Both commands must output version information (e.g., `openjdk version "21.0.x"` and `javac 21.0.x`).
   *Troubleshooting Note*: If `javac` is not recognized, ensure that the JDK `bin` directory (e.g., `C:\Program Files\Eclipse Adoptium\jdk-21...\bin`) is added to your Windows system `PATH` environment variable.

---

## How to Compile and Run Each Program

Execute each command from within the respective week folder:

### Week 1
```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

### Week 2
```bash
cd week02
javac HelloWorld.java
java HelloWorld

javac StudentProfile.java
java StudentProfile
```

### Week 3
```bash
cd week03
javac SimpleCalculator.java
java SimpleCalculator

javac AverageCalculator.java
java AverageCalculator

javac ItemCost.java
java ItemCost
```

---

## Test Cases and Expected Results

### 1. `SimpleCalculator.java`
- **Test Case 1 (Standard Operations)**:
  - Input: `20`, `4`
  - Output: `Sum: 24.00`, `Difference: 16.00`, `Product: 80.00`, `Quotient: 5.00`
- **Test Case 2 (Zero Divisor Guard)**:
  - Input: `50`, `0`
  - Output: `Sum: 50.00`, `Difference: 50.00`, `Product: 0.00`, `Quotient: Division is undefined for a zero divisor.`

### 2. `AverageCalculator.java`
- **Test Case 1 (Standard Calculation)**:
  - Input: Name: `Amina Bello`, Scores: `70`, `80`, `90`
  - Output: `Total: 240.00`, `Average: 80.00`
- **Test Case 2 (Validation Loop)**:
  - Input: Score 1: `-10` $\to$ rejected with prompt, re-enter `75`
  - Output: Accepts only valid values between 0 and 100.

### 3. `ItemCost.java`
- **Test Case 1 (Standard Purchase)**:
  - Input: Item: `Notebook`, Quantity: `3`, Unit Price: `1500.00`
  - Output: `Total Cost: 4500.00`
- **Test Case 2 (Validation Check)**:
  - Input: Quantity: `0` $\to$ rejected, re-enter `2`; Price: `-50` $\to$ rejected, re-enter `250.00`
  - Output: `Total Cost: 500.00`

---

