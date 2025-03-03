### Types of Variables in Java:
1. **Local Variables**
2. **Instance Variables**
3. **Class/Static Variables**

### 1. Local Variables:
- Declared inside methods, constructors, or blocks.
- Created when the method, constructor, or block is entered, and destroyed when it exits.
- No default value is assigned; must be initialized before use.
- Access modifiers cannot be used.

**Syntax:**
```java
public void method() {
    int localVar = 10; // Local variable
}
```

### 2. Instance Variables:
- Declared in a class, but outside methods, constructors, or blocks.
- Created when an object is instantiated; destroyed when the object is destroyed.
- Default values: 0 for numbers, false for booleans, null for object references.
- Can use access modifiers.

**Syntax:**
```java
public class Example {
    public String instanceVar; // Instance variable
}
```

### 3. Class/Static Variables:
- Declared with the `static` keyword inside a class, but outside methods, constructors, or blocks.
- Only one copy per class, shared among all instances.
- Default values: 0 for numbers, false for booleans, null for object references.
- Typically used for constants (public, static, final).

**Syntax:**
```java
public class Example {
    public static String staticVar; // Static variable
}
```

