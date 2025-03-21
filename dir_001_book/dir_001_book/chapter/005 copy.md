---
marp: false
theme: default # gaia, default, uncover,
class: middle # lead, center, middle
size: 4:3 # 4:3, 16:9, 16:10, 2.35:1, 1.85:1
header: "Institute of Technology of Cambodia"
footer: "Object-Oriented Programming with Java"
paginate: true
math: mathjax
typora-copy-images-to: ./images
---

# Chapter 5: Loops

---

## 5.1. Introduction

Here's a suggested slide for Section 5.1 Introduction:

---

**Chapter 5: Loops**

**5.1 Introduction**

• A loop allows a program to execute statements repeatedly

• Useful for tasks that require repetition, such as:
  - Displaying a string multiple times
  - Performing calculations iteratively
  - Processing large datasets

• Example use case:
  Display "Welcome to Java!" 100 times

• Key benefits of loops:
  - Avoids repetitive code
  - Makes programs more concise and efficient  
  - Enables handling of unknown or variable repetitions

• Main types of loops covered in this chapter:
  - while loop
  - do-while loop 
  - for loop
  - Nested loops

• Loops provide fundamental control structures for programming logic and automation

---

This slide captures the key points about loops introduced in section 5.1, including their purpose, benefits, and basic use cases. It also previews some of the specific loop types that will be covered in more detail later in the chapter. The bullet point format makes it easy to follow on a slide presentation.

## 5.2. The `while` Loop


### Slide 1: Title Slide
**The `while` Loop**  
*Section 5.2*  
*Chapter 5: Loops*  

---

### Slide 2: Introduction to the `while` Loop
**What is a `while` Loop?**  
- Executes statements repeatedly while a condition is true.
- Known as a **pretest loop** because the continuation condition is checked *before* the loop body executes.

**Syntax:**  
```java
while (loop-continuation-condition) {
    // Loop body
}
```

---

### Slide 3: Key Components of a `while` Loop
**1. Loop-Continuation-Condition**  
- Boolean expression determining if the loop body will execute.
- If `true`, the loop body runs; if `false`, the loop terminates.

**2. Loop Body**  
- Block of code repeated during each iteration.

**Example:**  
```java
int count = 0;
while (count < 100) {
    System.out.println("Welcome to Java!");
    count++;
}
```

---

### Slide 4: Flowchart of a `while` Loop
**Visual Representation**  
*(Insert flowchart from Figure 5.1b or similar)*  

1. Check the **loop-continuation-condition**.
2. If `true`: Execute the **loop body** and repeat.
3. If `false`: Exit the loop and proceed to the next statement.

---

### Slide 5: Example Walkthrough
**Step-by-Step Execution**  
Code:
```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}
```

**Execution Steps:**  
1. Initialize `count = 0`.
2. Check `count < 5` → `true`. Print `Count: 0`. Increment `count` to `1`.
3. Repeat until `count = 5`.
4. When `count = 5`, `count < 5` → `false`. Exit loop.

**Output:**  
```
Count: 0
Count: 1
Count: 2
Count: 3
Count: 4
```

---

### Slide 6: Key Terms
**Definitions to Remember**  
- **Iteration**: One execution of the loop body.
- **Infinite Loop**: A loop that never terminates because the continuation condition is always `true`.
- **Counter-Controlled Loop**: Uses a control variable (e.g., `count`) to track iterations.

---

### Slide 7: Common Mistakes to Avoid
**1. Missing Initialization**  
- Forgetting to initialize the control variable can lead to errors.

**2. Off-by-One Errors**  
- Incorrectly setting the continuation condition can cause loops to run one time too many or too few.

**3. Omitting Braces**  
- If the loop body contains multiple statements, braces `{}` are required.

**Incorrect Example:**  
```java
int i = 0;
while (i < 5); // Semicolon ends the loop prematurely
System.out.println(i++);
```

---

### Slide 8: Practical Example
**Use Case: Doubling Tuition**  
Problem: Determine how many years it takes for tuition to double at a 7% annual increase.

Code:
```java
double tuition = 10000; // Initial tuition
int year = 0;
while (tuition < 20000) {
    tuition *= 1.07; // Increase by 7%
    year++;          // Increment year
}
System.out.println("Tuition will double in " + year + " years.");
```

**Output:**  
```
Tuition will double in 11 years.
``` 

---

## 5.3. Case Study: Guessing Numbers

## 5.4. Loop Design Strategies

### Slide 1: Title Slide  
**Loop Design Strategies**  
*Section 5.4*  
*Chapter 5: Loops*  

---

### Slide 2: Introduction to Loop Design Strategies  
**What Are Loop Design Strategies?**  
- Systematic approaches to designing loops that ensure correctness, efficiency, and clarity.  
- Help avoid common pitfalls such as infinite loops, off-by-one errors, and unnecessary complexity.  

**Key Considerations:**  
1. **Initialization**: Set up variables before the loop starts.  
2. **Condition**: Define a clear continuation condition.  
3. **Update**: Modify variables appropriately within the loop.  

---

### Slide 3: Step 1 – Initialization  
**Why Is Initialization Important?**  
- Ensures all variables used in the loop are properly set up before execution begins.  
- Prevents undefined behavior or runtime errors.  

**Examples of Initialization:**  
```java
int sum = 0;          // For summing numbers
int count = 1;        // For counting iterations
double product = 1.0; // For multiplying values
```

**Tip:** Always initialize variables with meaningful default values.

---

### Slide 4: Step 2 – Defining the Continuation Condition  
**What Makes a Good Continuation Condition?**  
- A Boolean expression that accurately reflects when the loop should continue.  
- Should eventually evaluate to `false` to prevent infinite loops.  

**Examples of Conditions:**  
```java
while (count <= 10)    // Fixed number of iterations
while (sum < target)   // Goal-based iteration
while (!found)         // Sentinel-controlled loop
```

**Common Mistake:**  
Using conditions that never change, leading to infinite loops.  
*(e.g., `while (true)` without an exit strategy)*

---

### Slide 5: Step 3 – Updating Variables  
**Why Update Variables Inside the Loop?**  
- Ensures progress toward the termination of the loop.  
- Prevents infinite loops and ensures the program behaves as expected.  

**Examples of Updates:**  
```java
sum += value;     // Accumulate values
count++;          // Increment counters
product *= factor; // Multiply values
```

**Tip:** Always verify that updates align with the continuation condition.

---

### Slide 6: Common Loop Design Strategies  
**1. Counter-Controlled Loops**  
- Use a counter to track iterations.  
- Example: Printing numbers from 1 to 10.  
```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}
```

**2. Sentinel-Controlled Loops**  
- Continue until a specific value (sentinel) is encountered.  
- Example: Reading user input until `-1` is entered.  
```java
int input;
while ((input = scanner.nextInt()) != -1) {
    System.out.println("You entered: " + input);
}
```

---

### Slide 7: Practical Example – Summing Numbers  
**Problem:** Write a program to sum integers from 1 to `n`.  

**Solution Using Loop Design Strategies:**  
1. **Initialization:** Start with `sum = 0` and `i = 1`.  
2. **Condition:** Continue while `i <= n`.  
3. **Update:** Add `i` to `sum` and increment `i`.  

Code:
```java
int n = 10, sum = 0, i = 1;
while (i <= n) {
    sum += i;
    i++;
}
System.out.println("Sum: " + sum);
```

**Output:**  
```
Sum: 55
```

---

### Slide 8: Debugging and Testing Loops  
**Tips for Debugging Loops:**  
1. **Trace Variables:** Print variable values during each iteration to ensure they change as expected.  
2. **Check Edge Cases:** Test with minimum, maximum, and typical inputs.  
3. **Avoid Infinite Loops:** Double-check the continuation condition and update logic.  

**Example Debugging Output:**  
```java
int i = 1;
while (i <= 5) {
    System.out.println("Iteration " + i + ": Value = " + i);
    i++;
}
```

**Output:**  
```
Iteration 1: Value = 1
Iteration 2: Value = 2
Iteration 3: Value = 3
Iteration 4: Value = 4
Iteration 5: Value = 5
```

---

### Slide 9: Best Practices for Loop Design  
**1. Keep It Simple:** Avoid overly complex conditions or updates.  
**2. Use Meaningful Variable Names:** Enhance readability and maintainability.  
**3. Document Logic:** Add comments to explain the purpose of the loop and its components.  

**Example of Good Practice:**  
```java
// Calculate factorial of a number
int number = 5, factorial = 1, i = 1;
while (i <= number) { // Multiply until i reaches number
    factorial *= i;
    i++;
}
System.out.println("Factorial: " + factorial);
```

---

This slide deck provides a structured approach to designing loops effectively, covering initialization, conditions, updates, and practical examples. Let me know if you'd like any adjustments!

## 5.5. Controlling a Loop with User Confirmation or a Sentinel Value

## 5.6. The `do-while` Loop

## 5.7. The `for` Loop

## 5.8. Which Loop to Use?

## 5.9. Nested Loops

## 5.10. Minimizing Numeric Errors

## 5.11. Case Studies

## 5.12. Keywords `break` and `continue`

## 5.13. Case Study:<br> Checking Palindromes

## 5.14. Case Study:<br> Displaying Prime Numbers
