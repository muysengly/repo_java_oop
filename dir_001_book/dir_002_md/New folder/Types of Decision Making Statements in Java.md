### Types of Decision Making Statements in Java:
1. **if statement**
2. **if...else statement**
3. **nested if statement**
4. **switch statement**
5. **The ? : Operator (Ternary Operator)**

### Syntax:

1. **if statement:**
```java
if (condition) {
    // code to be executed if condition is true
}
```
*Evaluates a boolean expression and executes a block of code if the expression is true.*

2. **if...else statement:**
```java
if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}
```
*Provides an alternative block of code to execute when the condition is false.*

3. **nested if statement:**
```java
if (condition1) {
    // code to be executed if condition1 is true
    if (condition2) {
        // code to be executed if condition2 is true
    }
}
```
*Allows you to check multiple conditions by placing one if or else if statement inside another.*

4. **switch statement:**
```java
switch (expression) {
    case value1:
        // code to be executed if expression equals value1
        break;
    case value2:
        // code to be executed if expression equals value2
        break;
    // more cases
    default:
        // code to be executed if expression doesn't match any case
}
```
*Tests a variable for equality against a list of values and executes corresponding block of code.*

5. **The ? : Operator (Ternary Operator):**
```java
variable = (condition) ? expressionTrue : expressionFalse;
```
