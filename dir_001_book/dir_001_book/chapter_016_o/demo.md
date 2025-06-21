**1. Always Chain Exceptions Properly**:

**Basic chaining:**

```java
try {
    // code that may throw IOException
} catch (IOException e) {
    throw new ServiceException("Failed to process request", e); // e is the cause
}
```

**2. Preserve the Full Stack Trace**:

**Good (preserves stack trace):**

```java
try {
    parseFile(configFile);
} catch (FileParseException e) {
    throw new ConfigurationException("Invalid config file: " + configFile.getName(), e);
}
```

**Bad (loses original stack trace):**

```java
try {
    parseFile(configFile);
} catch (FileParseException e) {
    // DON'T DO THIS - loses original stack trace
    throw new ConfigurationException("Invalid config file: " + e.getMessage());
}
```

**3. Use Meaningful Exception Types**:

```java
public void processPayment(Payment payment) throws PaymentException {
    try {
        paymentGateway.process(payment);
    } catch (NetworkException e) {
        throw new PaymentException("Network error processing payment", e);
    } catch (DatabaseException e) {
        throw new PaymentException("Failed to record payment", e);
    }
}
```

**4. Add Contextual Information**:

```java
try {
    db.executeUpdate(query);
} catch (SQLException e) {
    throw new DataAccessException(
        "Failed to execute query: " + query + ". Error code: " + e.getErrorCode(),
        e
    );
}
```

**5. Implement Custom Exceptions Properly**:

```java
public class ApplicationException extends Exception {
    // Constructors that support chaining
    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    // Additional useful methods
    public String getRootCauseMessage() {
        Throwable root = this;
        while (root.getCause() != null) {
            root = root.getCause();
        }
        return root.getMessage();
    }
}
```

**6. Log Appropriately**:

```java
try {
    processOrder(order);
} catch (ProcessingException e) {
    logger.error("Failed to process order {}: {}", order.getId(), e.getMessage(), e);
    throw new OrderException("Order processing failed", e);
}
```

**7. Handle Multiple Levels of Chaining**:

```java
try {
    // business logic
} catch (BusinessException e) {
    if (e.getCause() instanceof IOException) {
        // Special handling for IO-related business failures
        handleIOFailure((IOException)e.getCause());
    }
    throw new PresentationLayerException("Operation failed", e);
}
```

**8. Avoid Over-Chaining**:

**Bad (too many layers):**

```java
try {
    // ...
} catch (LowLevelException e) {
    throw new MidLevelException(e); // Just adds noise
}
```

**Better:**

```java
try {
    // ...
} catch (LowLevelException e) {
    throw new HighLevelException("Meaningful message", e); // Skip unnecessary layers
}
```

**9. Use Java's Built-in Chaining Support**:

```java
// The cause can be accessed later
try {
    // ...
} catch (Exception e) {
    Exception wrapped = new ApplicationException("Context", e);
    System.out.println("Root cause: " + wrapped.getCause());
}
```

**10. Document Chained Exceptions**:

```java
/**
 * Processes the data file
 * @throws DataProcessingException when processing fails, with these common causes:
 *   - IOException: When file cannot be read
 *   - ParseException: When file contains invalid data
 */
public void processData(File file) throws DataProcessingException {
    // ...
}
```
