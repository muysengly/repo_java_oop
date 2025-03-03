### Types of Operators in Java:
1. **Arithmetic Operators**
2. **Relational Operators**
3. **Bitwise Operators**
4. **Logical Operators**
5. **Assignment Operators**
6. **Miscellaneous Operators**

### 1. Arithmetic Operators:
Perform basic mathematical operations.

**Syntax:**
```java
int a = 10;
int b = 20;
int sum = a + b;    // Addition
int diff = a - b;   // Subtraction
int prod = a * b;   // Multiplication
int quotient = b / a; // Division
int remainder = b % a; // Modulus
a++;   // Increment
b--;   // Decrement
```

### 2. Relational Operators:
Compare two values and return a boolean result.

**Syntax:**
```java
int a = 10;
int b = 20;
boolean result;
result = (a == b);  // Equal to
result = (a != b);  // Not equal to
result = (a > b);   // Greater than
result = (a < b);   // Less than
result = (a >= b);  // Greater than or equal to
result = (a <= b);  // Less than or equal to
```

### 3. Bitwise Operators:
Perform bit-level operations on integral types.

**Syntax:**
```java
int a = 60; // 0011 1100 in binary
int b = 13; // 0000 1101 in binary
int result;
result = a & b; // Bitwise AND
result = a | b; // Bitwise OR
result = a ^ b; // Bitwise XOR
result = ~a;    // Bitwise complement
result = a << 2; // Left shift
result = a >> 2; // Right shift
result = a >>> 2; // Zero fill right shift
```

### 4. Logical Operators:
Used to form compound boolean expressions.

**Syntax:**
```java
boolean a = true;
boolean b = false;
boolean result;
result = a && b; // Logical AND
result = a || b; // Logical OR
result = !a;     // Logical NOT
```

### 5. Assignment Operators:
Assign values to variables.

**Syntax:**
```java
int a = 10;
int b = 20;
a += b;  // a = a + b
a -= b;  // a = a - b
a *= b;  // a = a * b
a /= b;  // a = a / b
a %= b;  // a = a % b
a <<= 2; // a = a << 2
a >>= 2; // a = a >> 2
a &= b;  // a = a & b
a ^= b;  // a = a ^ b
a |= b;  // a = a | b
```

### 6. Miscellaneous Operators:
Include conditional (ternary) and instanceof operators.

**Syntax:**
- **Ternary Operator:**
  ```java
  int a = 10;
  int b = (a == 10) ? 20 : 30; // If a is 10, b is 20; else b is 30
  ```

- **instanceof Operator:**
  ```java
  String name = "Java";
  boolean result = name instanceof String; // returns true
  ```

