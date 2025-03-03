### Types of Type Casting:
1. **Widening Type Casting (Implicit)**
2. **Narrowing Type Casting (Explicit)**

### 1. Widening Type Casting (Implicit):
- Converting a smaller type to a larger type.
- Performed automatically by the compiler.
- Example: `byte -> short -> char -> int -> long -> float -> double`

**Syntax:**
```java
int num1 = 5004;
double num2 = num1; // implicit casting
```

### Example Code:
```java
public class Tester {
    public static void main(String[] args) {
        int num1 = 5004;
        double num2 = 2.5;
        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
```

**Output:**
```
The sum of 5004 and 2.5 is 5006.5
```

### 2. Narrowing Type Casting (Explicit):
- Converting a larger type to a smaller type.
- Must be done manually by the programmer.
- Example: `double -> float -> long -> int -> char -> short -> byte`

**Syntax:**
```java
double doubleNum = 5004.0;
int intNum = (int) doubleNum; // explicit casting
```

### Example Code:
```java
public class Tester {
    public static void main(String[] args) {
        double doubleNum = 5004.0;
        int intNum = (int) doubleNum;
        System.out.println("The value of " + doubleNum + " after converting to int is " + intNum);
    }
}
```

**Output:**
```
The value of 5004.0 after converting to int is 5004
```
