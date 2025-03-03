### Data Types in Java:
Java data types define the type and value range of the data for variables, constants, method parameters, and return types. There are two main categories of data types in Java:

1. **Primitive Data Types**
2. **Reference/Object Data Types**

### 1. Primitive Data Types:
Primitive data types are predefined by the Java language and are named by a keyword. There are eight primitive data types in Java:

1. **byte:**
   - **Description:** 8-bit signed two's complement integer.
   - **Range:** -128 to 127.
   - **Syntax:**
     ```java
     byte b = 100;
     ```

2. **short:**
   - **Description:** 16-bit signed two's complement integer.
   - **Range:** -32,768 to 32,767.
   - **Syntax:**
     ```java
     short s = 10000;
     ```

3. **int:**
   - **Description:** 32-bit signed two's complement integer.
   - **Range:** -2^31 to 2^31-1.
   - **Syntax:**
     ```java
     int i = 100000;
     ```

4. **long:**
   - **Description:** 64-bit signed two's complement integer.
   - **Range:** -2^63 to 2^63-1.
   - **Syntax:**
     ```java
     long l = 100000L;
     ```

5. **float:**
   - **Description:** Single-precision 32-bit IEEE 754 floating-point.
   - **Range:** Varies (approx. ±3.40282347E+38F).
   - **Syntax:**
     ```java
     float f = 234.5f;
     ```

6. **double:**
   - **Description:** Double-precision 64-bit IEEE 754 floating-point.
   - **Range:** Varies (approx. ±1.79769313486231570E+308).
   - **Syntax:**
     ```java
     double d = 123.4;
     ```

7. **boolean:**
   - **Description:** Represents one bit of information (true or false).
   - **Syntax:**
     ```java
     boolean bool = true;
     ```

8. **char:**
   - **Description:** Single 16-bit Unicode character.
   - **Range:** '\u0000' (0) to '\uffff' (65,535 inclusive).
   - **Syntax:**
     ```java
     char c = 'A';
     ```

### 2. Reference/Object Data Types:
Reference data types are created using defined constructors of the classes. These variables store the address of the object they refer to.

1. **String:**
   - **Description:** Represents sequences of characters.
   - **Syntax:**
     ```java
     String str = "Hello, World!";
     ```

2. **Arrays:**
   
   - **Description:** Store multiple values of the same type.
   - **Syntax:**
     ```java
     int[] arr = new int[5];
     ```
   
3. **Classes, Interfaces, etc.:**
   - **Description:** User-defined data types consisting of variables and methods.
   - **Syntax:**
     ```java
     class MyClass {
         // class members
     }
     
     MyClass obj = new MyClass();
     ```

