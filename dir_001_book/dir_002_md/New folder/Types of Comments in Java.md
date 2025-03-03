### Types of Comments in Java:
1. **Single-line Comments**
2. **Multi-line Comments**
3. **Documentation Comments**

### 1. Single-line Comments:
- Used to add a comment on only one line.
- Starts with two forward slashes (`//`).

**Syntax:**
```java
// This is a single-line comment
int a = 10; // This is also a single-line comment
```

### 2. Multi-line Comments:
- Used to add comments spanning multiple lines.
- Starts with a forward slash followed by an asterisk (`/*`) and ends with an asterisk followed by a forward slash (`*/`).

**Syntax:**
```java
/* This is a multi-line comment
   It can span multiple lines */
int b = 20;
```

### 3. Documentation Comments:
- Used for writing documentation for the code.
- Starts with a forward slash followed by two asterisks (`/**`) and ends with an asterisk followed by a forward slash (`*/`).
- Understood by the Javadoc tool to create HTML-based documentation.

**Syntax:**

```java
/**
 * This is a documentation comment.
 * It describes the method below.
 *
 * @param dividend the number to be divided
 * @param divisor the number to divide by
 * @return the result of the division
 * @throws IllegalArgumentException if divisor is zero
 */
public double divide(int dividend, int divisor) throws IllegalArgumentException {
    if (divisor == 0) {
        throw new IllegalArgumentException("divisor cannot be zero");
    }
    return (double) dividend / divisor;
}
```
