// ExampleClass.java

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExampleClass {

    private int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // Public method that calls the private method
    public int performAddition(int a, int b) {
        return addTwoNumbers(a, b);
    }

    // Testing private method using reflection
    public static int testPrivateMethod(ExampleClass instance, int a, int b)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Obtain the Class object for the class containing the private method
        Class<?> clazz = instance.getClass();

        // Specify the name and parameter types of the private method
        Class[] parameterTypes = { int.class, int.class };
        Method privateMethod = clazz.getDeclaredMethod("addTwoNumbers", parameterTypes);

        // Make the private method accessible for testing
        privateMethod.setAccessible(true);

        // Invoke the private method on the provided instance
        return (int) privateMethod.invoke(instance, a, b);
    }

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();

        // Test the public method that calls the private method
        int result = example.performAddition(3, 5);
        System.out.println("Result from public method: " + result);

        try {
            // Test the private method using reflection
            int privateMethodResult = testPrivateMethod(example, 3, 5);
            System.out.println("Result from private method: " + privateMethodResult);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
