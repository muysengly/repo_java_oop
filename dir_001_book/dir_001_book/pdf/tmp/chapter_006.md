Objectives
■
■To define methods with formal parameters (§6.2).
■
■To invoke methods with actual parameters (i.e., arguments) (§6.2).
■
■To define methods with a return value (§6.3).
■
■To define methods without a return value and distinguish the differ-
ences between void methods and value-returning methods (§6.4).
■
■To pass arguments by value (§6.5).
■
■To develop reusable code that is modular, easy to read, easy to debug, 
and easy to maintain (§6.6).
■
■To write a method that converts hexadecimals to decimals (§6.7).
■
■To use method overloading and understand ambiguous overloading 
(§6.8).
■
■To determine the scope of variables (§6.9).
■
■To apply the concept of method abstraction in software development 
(§6.10).
■
■To design and implement methods using stepwise refinement (§6.11).
Methods
CHAPTER
6
228  Chapter 6    Methods
6.1  Introduction
Methods can be used to define reusable code and organize and simplify coding, and 
make code easy to maintain.
 Suppose you need to find the sum of integers from 1 to 10, 20 to 37, and 35 to 49, respec-
tively. You may write the code as follows:
int sum = 0;
for (int i = 1; i <= 10; i++)
  sum += i;
System.out.println("Sum from 1 to 10 is " + sum);
sum = 0;
for (int i = 20; i <= 37; i++)
  sum += i;
System.out.println("Sum from 20 to 37 is " + sum);
sum = 0;
for (int i = 35; i <= 49; i++)
  sum += i;
System.out.println("Sum from 35 to 49 is " + sum);
You may have observed that computing these sums from 1 to 10, 20 to 37, and 35 to 49 are very 
similar, except that the starting and ending integers are different. Wouldn’t it be nice if we could write 
the common code once and reuse it? We can do so by defining a method and invoking it.
The preceding code can be simplified as follows:
Listing   MethodDemo.java
 1  public static int sum(int i1, int i2) {
 2    int result = 0;
 3    for (int i = i1; i <= i2; i++)
 4      result += i;
 5
 6    return result;
 7  }
 8
 9  public static void main(String[] args) {
10    System.out.println("Sum from 1 to 10 is " + sum(1, 10));
11    System.out.println("Sum from 20 to 37 is " + sum(20, 37));
12    System.out.println("Sum from 35 to 49 is " + sum(35, 49));
13  }
Lines 1–7 define the method named sum with two parameters i1 and i2. The statements in 
the main method invoke sum(1, 10) to compute the sum from 1 to 10, sum(20, 37) to 
compute the sum from 20 to 37, and sum(35, 49) to compute the sum from 35 to 49.
A method is a collection of statements grouped together to perform an operation. In earlier chap-
ters you have used predefined methods such as System.out.println, System.exit, Math.
pow, and Math.random. These methods are defined in the Java library. In this chapter, you will 
learn how to define your own methods and apply method abstraction to solve complex problems.
6.1.1	 What are the benefits of using a method?
6.2  Defining a Method
A method definition consists of method name, parameters, return value type, and body.
The syntax for defining a method is as follows:
modifier returnValueType methodName(list of parameters) {
  // Method body;
}
Point
Key
problem
why methods?
define sum method
main method
invoke sum
method
Point
Check
Point
Key
6.2  Defining a Method  229
Let’s look at a method defined to find the larger between two integers. This method, named 
max, has two int parameters, num1 and num2, the larger of which is returned by the method. 
Figure 6.1 illustrates the components of this method.
Invoke a method
Define a method
int z = max(x, y);
actual parameters
(arguments)
public static int max(int num1, int num2) {
int result;
if (num1 > num2)
result = num1;
else
result = num2;
return result;
}
return value
modifier
type
method
name
formal
parameters
return value
method
body
method
header
parameter list
method
signature
Figure 6.1  A method definition consists of a method header and a method body.
The method header specifies the modifiers, return value type, method name, and parameters 
of the method. The static modifier is used for all the methods in this chapter. The reason for 
using it will be discussed in Chapter 9, Objects and Classes.
A method may return a value. The returnValueType is the data type of the value the 
method returns. Some methods perform desired operations without returning a value. In this case, 
the returnValueType is the keyword void. For example, the returnValueType is void in 
the main method, as well as in System.exit, and System.out.println. If a method returns 
a value, it is called a value-returning method; otherwise, it is called a void method.
The variables defined in the method header are known as formal parameters or simply pa-
rameters. A parameter is like a placeholder: when a method is invoked, you pass a value to the 
parameter. This value is referred to as an actual parameter or argument. The parameter list 
refers to the method’s type, order, and the number of parameters. The method name and the pa-
rameter list together constitute the method signature. Parameters are optional; that is, a method 
may contain no parameters. For example, the Math.random() method has no parameters.
The method body contains a collection of statements that implement the method. The method 
body of the max method uses an if statement to determine which number is larger and return the 
value of that number. In order for a value-returning method to return a result, a return statement 
using the keyword return is required. The method terminates when a return statement is executed.
Note
Some programming languages refer to methods as procedures and functions. In those lan-
guages, a value-returning method is called a function and a void method is called a procedure.
Caution
In the method header, you need to declare each parameter separately. For instance, 
max(int num1, int num2) is correct, but max(int num1, num2) is wrong.
Note
We say “define a method” and “declare a variable.” We are making a subtle distinction 
here. A definition defines what the defined item is, but a declaration usually involves 
allocating memory to store data for the declared item.
method header
modifier
value-returning method
void method
formal parameter
parameter
actual parameter
argument
parameter list
method signature
define vs. declare
230  Chapter 6    Methods
6.2.1	 How do you simplify the max method in Listing 6.1 using the conditional operator?
6.2.2	 Define the terms parameter, argument, and method signature.
6.3  Calling a Method
Calling a method executes the code in the method.
In a method definition, you define what the method is to do. To execute the method, you have 
to call or invoke it. The program that calls the function is called a caller. There are two ways 
to call a method, depending on whether the method returns a value or not.
If a method returns a value, a call to the method is usually treated as a value. For example,
int larger = max(3, 4);
calls max(3, 4) and assigns the result of the method to the variable larger. Another exam-
ple of a call that is treated as a value is
System.out.println(max(3, 4));
which prints the return value of the method call max(3, 4).
If a method returns void, a call to the method must be a statement. For example, the 
method println returns void. The following call is a statement:
System.out.println("Welcome to Java!");
Note
A value-returning method can also be invoked as a statement in Java. In this case, the 
caller simply ignores the return value. This is not often done, but it is permissible if the 
caller is not interested in the return value.
When a program calls a method, program control is transferred to the called method. A 
called method returns control to the caller when its return statement is executed or when its 
method-ending closing brace is reached.
Listing 6.1 presents a complete program that is used to test the max method.
Listing 6.1 
TestMax.java
 1  public class TestMax {
 2    /** Main method */
 3    public static void main(String[] args) {
 4      int i = 5;
 5      int j = 2;
 6      int k = max(i, j);
 7      System.out.println("The maximum of " + i +
 8        " and " + j + " is " + k);
 9    }
10
11    /** Return the max of two numbers */
12    public static int max(int num1, int num2) {
13      int result;
14
15      if (num1 > num2)
16        result = num1;
17      else
18        result = num2;
19
20      return result;
21    }
22  }
Point
Check
Point
Key
caller
VideoNote
Define/invoke max method
main method
invoke max
define method
6.3  Calling a Method  231
The maximum of 5 and 2 is 5
line#
i
j
k
num1
num2
result
  4
5
Invoking max c
  5
2
12
5
2
13
undefined
16
5
  6
5
This program contains the main method and the max method. The main method is just like 
any other method, except that it is invoked by the JVM to start the program.
The main method’s header is always the same. Like the one in this example, it includes the 
modifiers public and static, return value type void, method name main, and a parameter 
of the String[] type. String[] indicates the parameter is an array of String, a subject 
addressed in Chapter 7.
The statements in main may invoke other methods that are defined in the class that con-
tains the main method or in other classes. In this example, the main method invokes max(i, 
j), which is defined in the same class with the main method.
When the max method is invoked (line 6), variable i’s value 5 is passed to num1 and vari-
able j’s value 2 is passed to num2 in the max method. The flow of control transfers to the max 
method and the max method is executed. When the return statement in the max method is 
executed, the max method returns the control to its caller (in this case, the caller is the main 
method). This process is illustrated in Figure 6.2.
main method
max method
public static int max
    (int num1, int num2) {
  int result;
  if (num1 > num2)
    result = num1;
  else
    result = num2;
  return result;
}
public static
    void main(String[] args) {
  int i = 5;
  int j = 2;
  int k = max(i, j);
  System.out.println("The " +
    "maximum between " + i +
    " and " + j + " is " + k);
}
The values of i and j are passed to num1 and num2.
Figure 6.2  When the max method is invoked, the flow of control transfers to it. Once the max method is finished, it re-
turns control back to the caller.
Caution
A return statement is required for a value-returning method. The method given in 
(a) is logically correct, but it has a compile error because the Java compiler thinks this 
method might not return a value.
232  Chapter 6    Methods
To fix this problem, delete if (n < 0) in (a), so the compiler will see a return 
statement to be reached regardless of how the if statement is evaluated, as shown in (b).
Note
Methods enable code sharing and reuse. The max method can be invoked from any 
class, not just TestMax. If you create a new class, you can invoke the max method 
using ClassName.methodName (i.e., TestMax.max).
Each time a method is invoked, the system creates an activation record that stores parameters and 
variables for the method and places the activation record in an area of memory known as a call 
stack. A call stack is also known as an execution stack, runtime stack, or machine stack and it is 
often shortened to just “the stack.” When a method calls another method, the caller’s activation re-
cord is kept intact and a new activation record is created for the new method called. When a method 
finishes its work and returns to its caller, its activation record is removed from the call stack.
A call stack stores the activation records in a last-in, first-out fashion: The activation re-
cord for the method that is invoked last is removed first from the stack. For example, suppose 
method m1 calls method m2, and m2 calls method m3. The runtime system pushes m1’s activa-
tion record into the stack, then m2’s, and then m3’s. After m3 is finished, its activation record 
is removed from the stack. After m2 is finished, its activation record is removed from the 
stack. After m1 is finished, its activation record is removed from the stack.
Understanding call stacks helps you to comprehend how methods are invoked. The vari-
ables defined in the main method in Listing 6.1 are i, j, and k. The variables defined in the 
max method are num1, num2, and result. The variables num1 and num2 are defined in the 
method signature and are parameters of the max method. Their values are passed through 
method invocation. Figure 6.3 illustrates the activation records for method calls in the stack.
reusing method
activation record
call stack
(a)
public static int sign(int n) { 
  if (n > 0)
    return 1;
  else if (n == 0)
    return 0;
  else if (n < 0)
    return 21;
}
public static int sign(int n) {
  if (n > 0)
    return 1;
  else if (n == 0)
    return 0;
  else
    return 21;
}
(b)
Should be 
Activation record
for the main method
Activation record
for the max method
k:
j: 2
i: 5
(1) The main
method is invoked.
Activation record
for the main method
k:
j: 2
i: 5
Stack is empty
(2) The max method is
invoked.
(5) The main
method is finished.
Activation record
for the main method
Activation record
for the max method
k:
j: 2
i: 5
result: 5
num2: 2
num1: 5
(3) The max method is
being executed.
Activation record
for the main method
k: 5
j: 2
i: 5
(4) The max method is
finished and the return
value is sent to k.
result:  
num2: 2
num1: 5
Figure 6.3  When the max method is invoked, the flow of control transfers to the max method. Once the max method is 
finished, it returns control back to the caller.
6.3.1	 How do you define a method? How do you invoke a method?
6.3.2	 Reformat the following program according to the programming style and documen-
tation guidelines proposed in Section 1.9, Programming Style and Documentation. 
Use the end-of-line brace style.
Point
Check
6.4  void vs. Value-Returning Methods
A void method does not return a value.
 The preceding section gives an example of a value-returning method. This section shows 
how to define and invoke a void method. Listing 6.2 gives a program that defines a method 
named printGrade and invokes it to print the grade for a given score.
Listing 6.2 
TestVoidMethod.java
 1  public class TestVoidMethod {
 2    public static void main(String[] args) {
 3      System.out.print("The grade is ");
 4      printGrade(78.5);
 5
 6      System.out.print("The grade is ");
 7      printGrade(59.5);
 8    }
 9
10    public static void printGrade(double score) {
11      if (score >= 90.0) {
12        System.out.println('A');
13      }
14      else if (score >= 80.0) {
15        System.out.println('B');
16      }
17      else if (score >= 70.0) {
18        System.out.println('C');
19      }
20      else if (score >= 60.0) {
21        System.out.println('D');
22      }
23      else {
24        System.out.println('F');
25      }
26    }
27  }
Point
Key
VideoNote
Use void method
main method
invoke printGrade
printGrade method
The grade is C
The grade is F
The printGrade method is a void method because it does not return any value. A call to a 
void method must be a statement. Therefore, it is invoked as a statement in line 4 in the main 
method. Like any Java statement, it is terminated with a semicolon.
To see the differences between a void and value-returning method, let’s redesign the 
printGrade method to return a value. The new method, which we call getGrade, returns 
the grade as given in Listing 6.3.
invoke void method
void vs. value-returned
6.4  void vs. Value-Returning Methods  233
1  public class Test {
2    public static double method(double i, double j)
3    {
4      while (i < j) {
5        j−−;
6      }
7      return j;
8    }
9  }
234  Chapter 6    Methods
Listing 6.3 
TestReturnGradeMethod.java
 1  public class TestReturnGradeMethod {
 2    public static void main(String[] args) {
 3      System.out.print("The grade is " + getGrade(78.5));
 4      System.out.print("\nThe grade is " + getGrade(59.5));
 5    }
 6
 7    public static char getGrade(double score) {
 8      if (score >= 90.0)
 9        return 'A';
10      else if (score >= 80.0)
11        return 'B';
12      else if (score >= 70.0)
13        return 'C';
14      else if (score >= 60.0)
15        return 'D';
16      else
17        return 'F';
18    }
19  }
invoke getGrade
main method
getGrade method
The grade is C
The grade is F
The getGrade method defined in lines 7–18 returns a character grade based on the numeric 
score value. The caller invokes this method in lines 3 and 4.
The getGrade method can be invoked by a caller wherever a character may appear. The 
printGrade method does not return any value, so it must be invoked as a statement.
Note
A return statement is not needed for a void method, but it can be used for termi-
nating the method and returning to the method’s caller. The syntax is simply
return;
This is not often done, but sometimes it is useful for circumventing the normal flow of 
control in a void method. For example, the following code has a return statement to 
terminate the method when the score is invalid:
public static void printGrade(double score) {
  if (score < 0 || score > 100) {
    System.out.println("Invalid score");
    return;
  }
  if (score >= 90.0) {
    System.out.println('A');
  }
  else if (score >= 80.0) {
    System.out.println('B');
  }
  else if (score >= 70.0) {
    System.out.println('C');
  }
  else if (score >= 60.0) {
    System.out.println('D');
  }
  else {
    System.out.println('F');
  }
}
return in void method
6.4.1	 True or false? A call to a method with a void return type is always a statement it-
self, but a call to a value-returning method cannot be a statement by itself.
6.4.2	 What is the return type of a main method?
6.4.3	 What would be wrong with not writing a return statement in a value-returning 
method? Can you have a return statement in a void method? Does the return 
statement in the following method cause syntax errors?
public static void xMethod(double x, double y) {
  System.out.println(x + y);
  return x + y;
}
6.4.4	 Write method headers (not the bodies) for the following methods:
a.	 Return a sales commission, given the sales amount and the commission rate.
b.	 Display the calendar for a month, given the month and year.
c.	 Return a square root of a number.
d.	 Test whether a number is even, and returning true if it is.
e.	 Display a message a specified number of times.
f.	 Return the monthly payment, given the loan amount, number of years, and 
annual interest rate.
g.	 Return the corresponding uppercase letter, given a lowercase letter.
6.4.5	 Identify and correct the errors in the following program:
 1  public class Test {
 2    public static method1(int n, m) {
 3      n += m;
 4      method2(3.4);
 5    }
 6
 7    public static int method2(int n) {
 8      if (n > 0) return 1;
 9      else if (n == 0) return 0;
10      else if (n < 0) return −1;
11    }
12  }
6.5  Passing Arguments by Values
The arguments are passed by value to parameters when invoking a method.
 The power of a method is its ability to work with parameters. You can use println to print 
any string, and max to find the maximum of any two int values. When calling a method, you 
need to provide arguments, which must be given in the same order as their respective parame-
ters in the method signature. This is known as parameter order association. For example, the 
following method prints a message n times:
public static void nPrintln(String message, int n) {
  for (int i = 0; i < n; i++)
    System.out.println(message);
}
You can use nPrintln("Hello", 3) to print Hello three times. The nPrintln("Hello", 
3) statement passes the actual string parameter Hello to the parameter message, passes 3 to 
n, and prints Hello three times. However, the statement nPrintln(3, "Hello") would be 
Point
Key
parameter order association
6.5  Passing Arguments by Values  235
236  Chapter 6    Methods
wrong. The data type of 3 does not match the data type for the first parameter, message, nor 
does the second argument, Hello, match the second parameter, n.
Caution
The arguments must match the parameters in order, number, and compatible type, as 
defined in the method signature. Compatible type means you can pass an argument 
to a parameter without explicit casting, such as passing an int value argument to a 
double value parameter.
When you invoke a method with an argument, the value of the argument is passed to the 
parameter. This is referred to as pass-by-value. If the argument is a variable rather than a 
literal value, the value of the variable is passed to the parameter. The variable is not affected, 
regardless of the changes made to the parameter inside the method. As given in Listing 6.4, 
the value of x (1) is passed to the parameter n to invoke the increment method (line 5). The 
parameter n is incremented by 1 in the method (line 10), but x is not changed no matter what 
the method does.
Listing 6.4 
Increment.java
 1  public class Increment {
 2    public static void main(String[] args) {
 3      int x = 1;
 4      System.out.println("Before the call, x is " + x);
 5      increment(x);
 6      System.out.println("After the call, x is " + x);
 7    }
 8
 9    public static void increment(int n) {
10      n++;
11      System.out.println("n inside the method is " + n);
12    }
13  }
pass-by-value
invoke increment
increment n
Before the call, x is 1
n inside the method is 2
After the call, x is 1
Listing 6.5 gives another program that demonstrates the effect of passing by value. The pro-
gram creates a method for swapping two variables. The swap method is invoked by passing 
two arguments. Interestingly, the values of the arguments are not changed after the method 
is invoked.
Listing 6.5 
TestPassByValue.java
 1  public class TestPassByValue {
 2    /** Main method */
 3    public static void main(String[] args) {
 4      // Declare and initialize variables
 5      int num1 = 1;
 6      int num2 = 2;
 7
 8      System.out.println("Before invoking the swap method, num1 is " +
 9        num1 + " and num2 is " + num2);
6.5  Passing Arguments by Values  237
10
11      // Invoke the swap method to attempt to swap two variables
12      swap(num1, num2);
13
14      System.out.println("After invoking the swap method, num1 is " +
15        num1 + " and num2 is " + num2);
16    }
17
18    /** Swap two variables */
19    public static void swap(int n1, int n2) {
20      System.out.println("\tInside the swap method");
21      System.out.println("\t\tBefore swapping, n1 is " + n1
22        + " and n2 is " + n2);
23
24      // Swap n1 with n2
25      int temp = n1;
26      n1 = n2;
27      n2 = temp;
28
29      System.out.println("\t\tAfter swapping, n1 is " + n1
30        + " and n2 is " + n2);
31    }
32  }
false swap
Before invoking the swap method, num1 is 1 and num2 is 2
  Inside the swap method
    Before swapping, n1 is 1 and n2 is 2
    After swapping, n1 is 2 and n2 is 1
After invoking the swap method, num1 is 1 and num2 is 2
Before the swap method is invoked (line 12), num1 is 1 and num2 is 2. After the swap method 
is invoked, num1 is still 1 and num2 is still 2. Their values have not been swapped. As shown 
in Figure 6.4, the values of the arguments num1 and num2 are passed to n1 and n2, but n1 and 
n2 have their own memory locations independent of num1 and num2. Therefore, changes in 
n1 and n2 do not affect the contents of num1 and num2.
Space required for the
main method
Space required for the
swap method
The main method
is invoked.
Space required for the
main method
Space required for the
main method
num2: 2
num1: 1
num2: 2
num1: 1
Space required for the
swap method
num2: 2
num1: 1
The swap method
is invoked.
The swap method
is executed.
is finished.
is finished.
Space required for the
main method
num2: 2
num1: 1
The swap method
Stack is empty
The main method
The values of num1 and num2 are
passed to n1 and n2.
The values for n1 and n2 are
swapped, but it does not affect
num1 and num2.
n2: 2
n1: 1
temp:
n2: 1
n1: 2
temp:
Figure 6.4  The values of the variables are passed to the method’s parameters.
238  Chapter 6    Methods
Another twist is to change the parameter name n1 in swap to num1. What effect does 
this have? No change occurs, because it makes no difference whether the parameter and the 
argument have the same name. The parameter is a variable in the method with its own mem-
ory space. The variable is allocated when the method is invoked, and it disappears when the 
method is returned to its caller.
Note
For simplicity, Java programmers often say passing x to y, which actually means pass-
ing the value of argument x to parameter y.
6.5.1	 How is an argument passed to a method? Can the argument have the same name as 
its parameter?
6.5.2	 Identify and correct the errors in the following program:
 1  public class Test {
 2    public static void main(String[] args) {
 3      nPrintln(5, "Welcome to Java!");
 4    }
 5
 6    public static void nPrintln(String message, int n) {
 7      int n = 1;
 8      for (int i = 0; i < n; i++)
 9        System.out.println(message);
10    }
11  }
6.5.3	 What is pass-by-value? Show the result of the following programs.
6.5.4	 For (a) in the preceding question, show the contents of the activation records in the 
call stack just before the method max is invoked, just as max is entered, just before 
max is returned, and right after max is returned.
Point
Check
public class Test {
public static void main(String[] args) {
int max = 0;
max(1, 2, max);
System.out.println(max);
}
public static void max(
int value1, int value2, int max) {
if (value1 > value2)
max = value1;
else
max = value2;
}
}
(a)
public class Test {
public static void main(String[] args) {
int i = 1;
while (i <= 6) {
method1(i, 2);
i++;
}
}
public static void method1(
int i, int num) {
for (int j = 1; j <= i; j++) {
System.out.print(num + " ");
num *= 2;
}
System.out.println();
}
}
(b)
6.6  Modularizing Code  239
6.6  Modularizing Code
Modularizing makes the code easy to maintain and debug and enables the code to be 
reused.
Methods can be used to reduce redundant code and enable code reuse. Methods can also be 
used to modularize code and improve the quality of the program.
Listing 5.9 gives a program that prompts the user to enter two integers and displays 
their greatest common divisor. You can rewrite the program using a method, as given in 
Listing 6.6.
Listing 6.6 
GreatestCommonDivisorMethod.java
 1  import java.util.Scanner;
 2
 3  public class GreatestCommonDivisorMethod {
 4    /** Main method */
 5    public static void main(String[] args) {
 6      // Create a Scanner
 7      Scanner input = new Scanner(System.in);
 8
 9      // Prompt the user to enter two integers
10      System.out.print("Enter first integer: ");
11      int n1 = input.nextInt();
12      System.out.print("Enter second integer: ");
13      int n2 = input.nextInt();
14
15      System.out.println("The greatest common divisor for " + n1 +
16        " and " + n2 + " is " + gcd(n1, n2));
17    }
Point
Key
VideoNote
Modularize code
invoke gcd
public class Test {
public static void main(String[] args) {
    // Initialize times
int times = 3;
    System.out.println("Before the call,"
      + " variable times is " + times);
    // Invoke nPrintln and display times 
    nPrintln("Welcome to Java!", times);
    System.out.println("After the call,"
      + " variable times is " + times);
}
  // Print the message n times 
public static void nPrintln(
String message, int n) {
while (n > 0) {
System.out.println("n = " + n);
System.out.println(message);
n––;
}
}
}
(c)
public class Test {
public static void main(String[] args) {
int i = 0;
while (i <= 4) {
      method1(i);
      i++;
}
System.out.println("i is " + i);
}
public static void method1(int i) {
do {
if (i % 3 != 0)
System.out.print(i + " ");
i––;
}
while (i >= 1);
System.out.println();
}
}
(d)
240  Chapter 6    Methods
18
19    /** Return the gcd of two integers */
20    public static int gcd(int n1,int n2) {
21      int gcd = 1; // Initial gcd is 1
22      int k = 2; // Possible gcd
23
24      while (k <= n1 && k <= n2) {
25        if (n1 % k == 0 && n2 % k == 0)
26          gcd = k; // Update gcd
27        k++;
28      }
29
30      return gcd; // Return gcd
31    }
32  }
compute gcd
return gcd
Enter first integer: 45 
Enter second integer: 75 
The greatest common divisor for 45 and 75 is 15
By encapsulating the code for obtaining the gcd in a method, this program has several 
advantages:
1.	 It isolates the problem for computing the gcd from the rest of the code in the main 
method. Thus, the logic becomes clear, and the program is easier to read.
2.	 The errors on computing the gcd are confined in the gcd method, which narrows the 
scope of debugging.
3.	 The gcd method now can be reused by other programs.
Listing 6.7 applies the concept of code modularization to improve Listing 5.15, 
PrimeNumber.java.
Listing 6.7 
PrimeNumberMethod.java
 1  public class PrimeNumberMethod {
 2    public static void main(String[] args) {
 3      System.out.println("The first 50 prime numbers are \n");
 4      printPrimeNumbers(50);
 5    }
 6
 7    public static void printPrimeNumbers(int numberOfPrimes) {
 8      final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
 9      int count = 0; // Count the number of prime numbers
10      int number = 2; // A number to be tested for primeness
11
12      // Repeatedly find prime numbers
13      while (count < numberOfPrimes) {
14        // Print the prime number and increase the count
15        if (isPrime(number)) {
16          count++; // Increase the count
17
18          if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
19            // Print the number and advance to the new line
invoke printPrimeNumbers
printPrimeNumbers 
method
invoke isPrime
6.7  Case Study: Converting Hexadecimals to Decimals  241
20            System.out.printf("%−5d\n", number);
21          }
22          else
23            System.out.printf("%−5d", number);
24        }
25
26        // Check whether the next number is prime
27        number++;
28      }
29    }
30
31    /** Check whether number is prime */
32    public static boolean isPrime(int number) {
33      for (int divisor = 2; divisor <= number / 2; divisor++) {
34        if (number % divisor == 0) { // If true, number is not prime
35          return false; // Number is not a prime
36        }
37      }
38
39      return true; // Number is prime
40    }
41  }
isPrime method
The first 50 prime numbers are
2    3    5    7    11   13   17   19   23   29
31   37   41   43   47   53   59   61   67   71
73   79   83   89   97   101  103  107  109  113
127  131  137  139  149  151  157  163  167  173
179  181  191  193  197  199  211  223  227  229
We divided a large problem into two subproblems: determining whether a number is a prime, 
and printing the prime numbers. As a result, the new program is easier to read and easier to 
debug. Moreover, the methods printPrimeNumbers and isPrime can be reused by other 
programs.
6.6.1	 Trace the gcd method to find the return value for gcd(4, 6).
6.6.2	 Trace the isPrime method to find the return value for isPrime(25).
6.7  Case Study: Converting Hexadecimals to Decimals
This section presents a program that converts a hexadecimal number into a decimal number.
Listing 5.11, Dec2Hex.java, gives a program that converts a decimal to a hexadecimal. How 
would you convert a hex number into a decimal?
Given a hexadecimal number hnhn-1hn-2 c h2h1h0, the equivalent decimal value is
hn * 16n + hn-1 * 16n-1 + hn-2 * 16n-2 + c
+ h2 * 162 + h1 * 161 + h0 * 160
For example, the hex number AB8C is
10 * 163 + 11 * 162 + 8 * 161 + 12 * 160 = 43916
Our program will prompt the user to enter a hex number as a string and convert it into a deci-
mal using the following method:
public static int hexToDecimal(String hex)
Point
Check
Point
Key
242  Chapter 6    Methods
A brute-force approach is to convert each hex character into a decimal number, multiply it by 
16i for a hex digit at the i’s position, and then add all the items together to obtain the equiva-
lent decimal value for the hex number.
Note that
hn * 16n + hn-1 * 16n-1 + hn-2 * 16n-2 + g + h1 * 161 + h0 * 160
= ( c ((hn * 16 + hn-1) * 16 + hn-2) * 16 + g + h1) * 16 + h0
This observation, known as the Horner’s algorithm, leads to the following efficient code for 
converting a hex string to a decimal number:
int decimalValue = 0;
for (int i = 0; i < hex.length(); i++) {
  char hexChar = hex.charAt(i);
  decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
}
Here is a trace of the algorithm for hex number AB8C:
i
hexChar
hexCharToDecimal  
(hexChar)
decimalValue
Before the loop
0
After the 1st iteration
0
A
10
10
After the 2nd iteration
1
B
11
10 * 16 + 11
After the 3rd iteration
2
8
8
(10 * 16 + 11) * 16 + 8
After the 4th iteration
3
C
12
((10 * 16 + 11)  
* 16 + 8) * 16 + 12
Listing 6.8 gives the complete program.
Listing 6.8 
Hex2Dec.java
 1  import java.util.Scanner;
 2
 3  public class Hex2Dec {
 4    /** Main method */
 5    public static void main(String[] args) {
 6      // Create a Scanner
 7      Scanner input = new Scanner(System.in);
 8
 9      // Prompt the user to enter a string
10      System.out.print("Enter a hex number: ");
11      String hex = input.nextLine();
12
13      System.out.println("The decimal value for hex number "
14        + hex + " is " + hexToDecimal(hex.toUpperCase()));
15    }
16
17    public static int hexToDecimal(String hex) {
18      int decimalValue = 0;
19      for (int i = 0; i < hex.length(); i++) {
20        char hexChar = hex.charAt(i);
21        decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
input string
hex to decimal
6.8  Overloading Methods  243
22      }
23
24      return decimalValue;
25    }
26
27    public static int hexCharToDecimal(char ch) {
28      if (ch >= 'A' && ch <= 'F')
29        return 10 + ch – 'A';
30      else // ch is '0', '1', ..., or '9'
31        return ch − '0';
32    }
33  }
hex char to decimal
check uppercase
Enter a hex number: AB8C 
The decimal value for hex number AB8C is 43916
Enter a hex number: af71 
The decimal value for hex number af71 is 44913
The program reads a string from the console (line 11) and invokes the hexToDecimal method 
to convert a hex string to decimal number (line 14). The characters can be in either lowercase or 
uppercase. They are converted to uppercase before invoking the hexToDecimal method.
The hexToDecimal method is defined in lines 17–25 to return an integer. The length of 
the string is determined by invoking hex.length() in line 19.
The hexCharToDecimal method is defined in lines 27–32 to return a decimal value for 
a hex character. The character can be in either lowercase or uppercase. Recall that to subtract 
two characters is to subtract their Unicodes. For example, '5' – '0' is 5.
6.7.1	
What is hexCharToDecimal('B'))?
	
	
What is hexCharToDecimal('7'))?
	
	
What is hexToDecimal("A9"))?
6.8  Overloading Methods
Overloading methods enable you to define the methods with the same name as long as 
their parameter lists are different.
 The max method used earlier works only with the int data type. But what if you need to 
determine which of the two floating-point numbers has the maximum value? The solution is 
to create another method with the same name but different parameters, as shown in the fol-
lowing code:
public static double max(double num1, double num2) {
  if (num1 > num2)
    return num1;
  else
    return num2;
}
If you call max with int parameters, the max method that expects int parameters will be 
invoked; and if you call max with double parameters, the max method that expects double 
parameters will be invoked. This is referred to as method overloading; that is, two methods 
have the same name but different parameter lists within one class. The Java compiler deter-
mines which method to use based on the method signature.
Point
Check
Point
Key
method overloading
244  Chapter 6    Methods
Listing 6.9 is a program that creates three methods. The first finds the maximum integer, 
the second finds the maximum double, and the third finds the maximum among three double 
values. All three methods are named max.
Listing 6.9 
TestMethodOverloading.java
 1  public class TestMethodOverloading {
 2    /** Main method */
 3    public static void main(String[] args) {
 4      // Invoke the max method with int parameters
 5      System.out.println("The maximum of 3 and 4 is "
 6        + max(3, 4));
 7
 8      // Invoke the max method with the double parameters
 9      System.out.println("The maximum of 3.0 and 5.4 is "
10        + max(3.0, 5.4));
11
12      // Invoke the max method with three double parameters
13      System.out.println("The maximum of 3.0, 5.4, and 10.14 is "
14        + max(3.0, 5.4, 10.14));
15    }
16
17    /** Return the max of two int values */
18    public static int max(int num1, int num2) {
19      if (num1 > num2)
20        return num1;
21      else
22        return num2;
23    }
24
25    /** Find the max of two double values */
26    public static double max(double num1, double num2) {
27      if (num1 > num2)
28        return num1;
29      else
30        return num2;
31    }
32
33    /** Return the max of three double values */
34    public static double max(double num1, double num2, double num3) {
35      return max(max(num1, num2), num3);
36    }
37  }
overloaded max
overloaded max
overloaded max
The maximum of 3 and 4 is 4
The maximum of 3.0 and 5.4 is 5.4
The maximum of 3.0, 5.4, and 10.14 is 10.14
When calling max(3, 4) (line 6), the max method for finding the maximum of two integers 
is invoked. When calling max(3.0, 5.4) (line 10), the max method for finding the maxi-
mum of two doubles is invoked. When calling max(3.0, 5.4, 10.14) (line 14), the max 
method for finding the maximum of three double values is invoked.
Can you invoke the max method with an int value and a double value, such as max(2, 
2.5)? If so, which of the max methods is invoked? The answer to the first question is yes. 
The answer to the second question is that the max method for finding the maximum of two 
double values is invoked. The argument value 2 is automatically converted into a double 
value and passed to this method.
6.8  Overloading Methods  245
You may be wondering why the method max(double, double) is not invoked for the 
call max(3, 4). Both max(double, double) and max(int, int) are possible matches 
for max(3, 4). The Java compiler finds the method that best matches a method invocation. 
Since the method max(int, int) is a better match for max(3, 4) than max(double, 
double), max(int, int) is used to invoke max(3, 4).
Tip
Overloading methods can make programs clearer and more readable. Methods that per-
form the same function with different types of parameters should be given the same 
name.
Note
Overloaded methods must have different parameter lists. You cannot overload methods 
based on different modifiers or return types.
Note
Sometimes there are two or more possible matches for the invocation of a method, but 
the compiler cannot determine the most specific match. This is referred to as ambigu-
ous invocation. Ambiguous invocation causes a compile error. Consider the following 
code:
public class AmbiguousOverloading {
  public static void main(String[] args) {
    System.out.println(max(1, 2));
  }
  public static double max(int num1, double num2) {
    if (num1 > num2)
      return num1;
    else
      return num2;
  }
  public static double max(double num1, int num2) {
    if (num1 > num2)
      return num1;
    else
      return num2;
  }
}
Both max(int, double) and max(double, int) are possible candidates to 
match max(1, 2). Because neither is more specific than the other, the invocation is 
ambiguous, resulting in a compile error.
6.8.1	 What is method overloading? Is it permissible to define two methods that have the 
same name but different parameter types? Is it permissible to define two methods 
in a class that have identical method names and parameter lists, but different return 
value types or different modifiers?
6.8.2	 What is wrong in the following program?
public class Test {
  public static void method(int x) {
  }
  public static int method(int y) {
ambiguous invocation
Point
Check
246  Chapter 6    Methods
    return y;
  }
}
6.8.3	 Given two method definitions,
public static double m(double x, double y)
public static double m(int x, double y)
	
	
tell which of the two methods is invoked for:
a.	 double z = m(4, 5);
b.	 double z = m(4, 5.4);
c.	 double z = m(4.5, 5.4);
6.9  The Scope of Variables
The scope of a variable is the part of the program where the variable can be referenced.
Section 2.5 introduced the scope of a variable. This section discusses the scope of variables 
in detail. A variable defined inside a method is referred to as a local variable. The scope of a 
local variable starts from its declaration and continues to the end of the block that contains the 
variable. A local variable must be declared and assigned a value before it can be used.
A parameter is actually a local variable. The scope of a method parameter covers the entire 
method. A variable declared in the initial-action part of a for-loop header has its scope in the 
entire loop. However, a variable declared inside a for-loop body has its scope limited in the loop 
body from its declaration to the end of the block that contains the variable, as shown in Figure 6.5.
Point
Key
scope of variables
local variable
The scope of j
The scope of i
public static void method() {
.
.
.
.
.
.
.
for (int i = 1; i < 10; i++) {
 
int j;
}
 }
Figure 6.5  A variable declared in the initial-action part of a for-loop header has its scope 
in the entire loop.
You can declare a local variable with the same name in different blocks in a method, but you 
cannot declare a local variable twice in the same block or in nested blocks, as shown in Figure 6.6.
Caution
A common mistake is to declare a variable in a for loop and then attempt to use it 
outside the loop. As shown in the following code, i is declared in the for loop, but it 
is accessed from the outside of the for loop, which causes a syntax error.
for (int i = 0; i < 10; i++) {
}
System.out.println(i); // Causes a syntax error on i
The last statement would cause a syntax error, because variable i is not defined outside 
of the for loop.
6.10  Case Study: Generating Random Characters  247
6.9.1	 What is a local variable?
6.9.2	 What is the scope of a local variable?
6.10  Case Study: Generating Random Characters
A character is coded using an integer. Generating a random character is to generate 
an integer.
 Computer programs process numerical data and characters. You have seen many examples 
that involve numerical data. It is also important to understand characters and how to process 
them. This section presents an example of generating random characters.
As introduced in Section 4.3, every character has a unique Unicode between 0 and FFFF 
in hexadecimal (65535 in decimal). To generate a random character is to generate a random 
integer between 0 and 65535 using the following expression (note since 0 <= Math.ran-
dom() < 1.0, you have to add 1 to 65535):
(int)(Math.random() * (65535 + 1))
Now let’s consider how to generate a random lowercase letter. The Unicodes for lowercase 
letters are consecutive integers starting from the Unicode for a, then for b, c, . . ., and z. 
The Unicode for a is
(int)'a'
Thus, a random integer between (int)'a' and (int)'z' is
(int)((int)'a' + Math.random() * ((int)'z' – (int)'a' + 1))
Point
Check
Point
Key
public static void method1() {
int x = 1;
int y = 1;
for (int i = 1; i < 10; i++) {
x += i;
}
for (int i = 1; i < 10; i++) {
y += i;
}
}
public static void method2() {
int i = 1;
int sum = 0;
for (int i = 1; i < 10; i++) {
sum += i;
}
}
Scope
of i
(a) It is fine to declare i in two nonnested blocks
(b) It is wrong to declare i in two nested blocks
Scope
of i
Scope
of i
Scope
of i
Figure 6.6  A variable can be declared multiple times in nonnested blocks, but only once in 
nested blocks.
248  Chapter 6    Methods
As discussed in Section 4.3.3, all numeric operators can be applied to the char operands. The 
char operand is cast into a number if the other operand is a number or a character. Therefore, 
the preceding expression can be simplified as follows:
'a' + Math.random() * ('z' – 'a' + 1)
and a random lowercase letter is
(char)('a' + Math.random() * ('z' – 'a' + 1))
Hence, a random character between any two characters ch1 and ch2 with ch1 < ch2 can be 
generated as follows:
(char)(ch1 + Math.random() * (ch2 – ch1 + 1))
This is a simple but useful discovery. Listing 6.10 defines a class named RandomCharacter 
with overloaded methods to get a certain type of random character. You can use these meth-
ods in your future projects.
Listing 6.10 
RandomCharacter.java
 1  public class RandomCharacter {
 2    /** Generate a random character between ch1 and ch2 */
 3    public static char getRandomCharacter(char ch1, char ch2) {
 4      return (char)(ch1 + Math.random() * (ch2 – ch1 + 1));
 5    }
 6
 7    /** Generate a random lowercase letter */
 8    public static char getRandomLowerCaseLetter() {
 9      return getRandomCharacter('a', 'z');
10    }
11
12    /** Generate a random uppercase letter */
13    public static char getRandomUpperCaseLetter() {
14      return getRandomCharacter('A', 'Z');
15    }
16
17    /** Generate a random digit character */
18    public static char getRandomDigitCharacter() {
19      return getRandomCharacter('0', '9');
20    }
21
22    /** Generate a random character */
23    public static char getRandomCharacter() {
24      return getRandomCharacter('\u0000', '\uFFFF');
25    }
26  }
Listing 6.11 gives a test program that displays 175 random lowercase letters.
Listing 6.11 
TestRandomCharacter.java
 1  public class TestRandomCharacter {
 2    /** Main method */
 3    public static void main(String[] args) {
 4      final int NUMBER_OF_CHARS = 175;
 5      final int CHARS_PER_LINE = 25;
 6
 7      // Print random characters between 'a' and 'z', 25 chars per line
 8      for (int i = 0; i < NUMBER_OF_CHARS; i++) {
 9        char ch = RandomCharacter.getRandomLowerCaseLetter();
10        if ((i + 1) % CHARS_PER_LINE == 0)
11          System.out.println(ch);
getRandomCharacter
getRandomLower 
CaseLetter()
getRandomUpper 
CaseLetter()
getRandomDigit 
Character()
getRandomCharacter()
constants
lowercase letter
6.11  Method Abstraction and Stepwise Refinement  249
12        else
13          System.out.print(ch);
14      }
15    }
16  }
gmjsohezfkgtazqgmswfclrao
pnrunulnwmaztlfjedmpchcif
lalqdgivxkxpbzulrmqmbhikr
lbnrjlsopfxahssqhwuuljvbe
xbhdotzhpehbqmuwsfktwsoli
cbuwkzgxpmtzihgatdslvbwbz
bfesoklwbhnooygiigzdxuqni
Line 9 invokes getRandomLowerCaseLetter() defined in the RandomCharacter class. 
Note getRandomLowerCaseLetter() does not have any parameters, but you still have to 
use the parentheses when defining and invoking the method.
6.11  Method Abstraction and Stepwise Refinement
The key to developing software is to apply the concept of abstraction.
 You will learn many levels of abstraction from this book. Method abstraction is achieved by 
separating the use of a method from its implementation. The client can use a method without 
knowing how it is implemented. The details of the implementation are encapsulated in the 
method and hidden from the client who invokes the method. This is also known as informa-
tion hiding or encapsulation. If you decide to change the implementation, the client program 
will not be affected, provided that you do not change the method signature. The implementa-
tion of the method is hidden from the client in a “black box,” as shown in Figure 6.7.
parentheses required
Point
Key
VideoNote
Stepwise refinement
method abstraction
information hiding
Method Header
Black box
Optional argument
for input
Optional return
value
Method Body
Figure 6.7  The method body can be thought of as a black box that contains the detailed 
implementation for the method.
You have already used the System.out.print method to display a string and the max 
method to find the maximum number. You know how to write the code to invoke these meth-
ods in your program, but as a user of these methods, you are not required to know how they 
are implemented.
The concept of method abstraction can be applied to the process of developing programs. 
When writing a large program, you can use the divide-and-conquer strategy, also known as 
stepwise refinement, to decompose it into subproblems. The subproblems can be further de-
composed into smaller, more manageable problems.
Suppose that you write a program that displays the calendar for a given month of the year. 
The program prompts the user to enter the year and the month, and then displays the entire 
calendar for the month, as presented in the following sample run:
divide and conquer
stepwise refinement
250  Chapter 6    Methods
Enter full year (e.g., 2012):  2012 
Enter month as number between 1 and 12:  3 
        March 2012
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30
Let us use this example to demonstrate the divide-and-conquer approach.
6.11.1  Top-Down Design
How would you get started on such a program? Would you immediately start coding? 
Beginning programmers often start by trying to work out the solution to every detail. 
Although details are important in the final program, concern for detail in the early stages may 
block the problem-solving process. To make problem solving flow as smoothly as possible, 
this example begins by using method abstraction to isolate details from design and only later 
implements the details.
For this example, the problem is first broken into two subproblems: get input from the user, 
and print the calendar for the month. At this stage, you should be concerned with what the 
subproblems will achieve, not with how to get input and print the calendar for the month. You 
can draw a structure chart to help visualize the decomposition of the problem (see Figure 6.8a).
printCalendar
(main)
(a)
(b)
printMonthBody
printMonthTitle
readInput
printMonth
printMonth
Figure 6.8  The structure chart shows the printCalendar problem is divided into two subproblems, readInput and 
printMonth in (a), and printMonth is divided into two smaller subproblems, printMonthTitle and printMonth-
Body in (b).
You can use Scanner to read input for the year and the month. The problem of printing 
the calendar for a given month can be broken into two subproblems: print the month title, and 
print the month body, as shown in Figure 6.8b. The month title consists of three lines: month 
and year, a dashed line, and the names of the seven days of the week. You need to get the 
month name (e.g., January) from the numeric month (e.g., 1). This is accomplished in get-
MonthName (see Figure 6.9a).
In order to print the month body, you need to know which day of the week is the first day of 
the month (getStartDay) and how many days the month has (getNumberOfDaysInMonth), 
6.11  Method Abstraction and Stepwise Refinement  251
as shown in Figure 6.9b. For example, December 2013 has 31 days, and December 1, 2013 
is a Sunday.
How would you get the start day for the first date in a month? There are several ways to do 
so. Assume you know that the start day for January 1, 1800 was a Wednesday (START_DAY_
FOR_JAN_1_1800 = 3). You could compute the total number of days (totalNumberOf-
Days) between January 1, 1800 and the first date of the calendar month. The start day for the 
calendar month is (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7, since 
every week has seven days. Thus, the getStartDay problem can be further refined as get-
TotalNumberOfDays, as shown in Figure 6.10a.
(b)
(a)
getNumberOfDaysInMonth
getStartDay
getMonthName
printMonthTitle
printMonthBody
Figure 6.9  (a) To printMonthTitle, you need getMonthName. (b) The printMonth-
Body problem is refined into several smaller problems.
getTotalNumberOfDays
getStartDay
isLeapYear
(a)
(b)
getNumberOfDaysInMonth
getTotalNumberOfDays
Figure 6.10  (a) To getStartDay, you need getTotalNumberOfDays. (b) The getTo-
talNumberOfDays problem is refined into two smaller problems.
To get the total number of days, you need to know whether the year is a leap year and the 
number of days in each month. Thus, getTotalNumberOfDays can be further refined into 
two subproblems: isLeapYear and getNumberOfDaysInMonth, as shown in Figure 6.10b. 
The complete structure chart is shown in Figure 6.11.
6.11.2  Top-Down and/or Bottom-Up Implementation
Now we turn our attention to implementation. In general, a subproblem corresponds to a 
method in the implementation, although some are so simple that this is unnecessary. You 
would need to decide which modules to implement as methods and which to combine with 
other methods. Decisions of this kind should be based on whether the overall program will be 
easier to read as a result of your choice. In this example, the subproblem readInput can be 
simply implemented in the main method.
You can use either a “top-down” or a “bottom-up” approach. The top-down approach im-
plements one method in the structure chart at a time from the top to the bottom. Stubs—a 
simple but incomplete version of a method—can be used for the methods waiting to be im-
plemented. The use of stubs enables you to quickly build the framework of the program. 
Implement the main method first then use a stub for the printMonth method. For example, 
top-down approach
stub
252  Chapter 6    Methods
let printMonth display the year and the month in the stub. Thus, your program may begin 
as follows:
public class PrintCalendar {
  /** Main method */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Prompt the user to enter year
    System.out.print("Enter full year (e.g., 2012): ");
    int year = input.nextInt();
    // Prompt the user to enter month
    System.out.print("Enter month as a number between 1 and 12: ");
    int month = input.nextInt();
    // Print calendar for the month of the year
    printMonth(year, month);
  }
  /** A stub for printMonth may look like this */
  public static void printMonth(int year, int month) {
    System.out.print(month + " " + year);
  }
  /** A stub for printMonthTitle may look like this */
  public static void printMonthTitle(int year, int month) {
  }
  /** A stub for printMonthBody may look like this */
  public static void printMonthBody(int year, int month) {
  }
printCalendar
(main)
getTotalNumberOfDays
getNumberOfDaysInMonth
printMonth
readInput
printMonthTitle
getMonthName
getStartDay
printMonthBody
isLeapYear
Figure 6.11  The structure chart shows the hierarchical relationship of the subproblems in 
the program.
6.11  Method Abstraction and Stepwise Refinement  253
  /** A stub for getMonthName may look like this */
  public static String getMonthName(int month) {
    return "January"; // A dummy value
  }
  /** A stub for getStartDay may look like this */
  public static int getStartDay(int year, int month) {
    return 1; // A dummy value
  }
  /** A stub for getTotalNumberOfDays may look like this */
  public static int getTotalNumberOfDays(int year, int month) {
    return 10000; // A dummy value
  }
  /** A stub for getNumberOfDaysInMonth may look like this */
  public static int getNumberOfDaysInMonth(int year, int month) {
    return 31; // A dummy value
  }
  /** A stub for isLeapYear may look like this */
  public static boolean isLeapYear(int year) {
    return true; // A dummy value
  }
}
Compile and test the program, and fix any errors. You can now implement the printMonth 
method. For methods invoked from the printMonth method, you can again use stubs.
The bottom-up approach implements one method in the structure chart at a time from the 
bottom to the top. For each method implemented, write a test program, known as the driver, 
to test it. The top-down and bottom-up approaches are equally good: Both approaches imple-
ment methods incrementally, help to isolate programming errors, and make debugging easy. 
They can be used together.
6.11.3  Implementation Details
The isLeapYear(int year) method can be implemented using the following code from 
Section 3.11:
return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
Use the following facts to implement getTotalNumberOfDaysInMonth(int year, int 
month):
■
■January, March, May, July, August, October, and December have 31 days.
■
■April, June, September, and November have 30 days.
■
■February has 28 days during a regular year, and 29 days during a leap year. A regular 
year, therefore, has 365 days, and a leap year has 366 days.
To implement getTotalNumberOfDays(int year, int month), you need to compute 
the total number of days (totalNumberOfDays) between January 1, 1800 and the first day 
of the calendar month. You could find the total number of days between the year 1800 and 
the calendar year then figure out the total number of days prior to the calendar month in the 
calendar year. The sum of these two totals is totalNumberOfDays.
To print a body, first pad some space before the start day then print the lines for every 
week.
The complete program is given in Listing 6.12.
bottom-up approach
driver
254  Chapter 6    Methods
Listing 6.12 
PrintCalendar.java
  1  import java.util.Scanner;
  2
  3  public class PrintCalendar {
  4    /** Main method */
  5    public static void main(String[] args) {
  6      Scanner input = new Scanner(System.in);
  7
  8      // Prompt the user to enter year
  9      System.out.print("Enter full year (e.g., 2012): ");
 10      int year = input.nextInt();
 11
 12      // Prompt the user to enter month
 13      System.out.print("Enter month as a number between 1 and 12: ");
 14      int month = input.nextInt();
 15
 16      // Print calendar for the month of the year
 17      printMonth(year, month);
 18    }
 19
 20    /** Print the calendar for a month in a year */
 21    public static void printMonth(int year, int month) {
 22      // Print the headings of the calendar
 23      printMonthTitle(year, month);
 24
 25      // Print the body of the calendar
 26      printMonthBody(year, month);
 27    }
 28
 29    /** Print the month title, e.g., March 2012 */
 30    public static void printMonthTitle(int year, int month) {
 31      System.out.println("         " + getMonthName(month)
 32        + " " + year);
 33      System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
 34      System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
 35    }
 36
 37    /** Get the English name for the month */
 38    public static String getMonthName(int month) {
 39      String monthName = "";
 40      switch (month) {
 41        case 1: monthName = "January"; break;
 42        case 2: monthName = "February"; break;
 43        case 3: monthName = "March"; break;
 44        case 4: monthName = "April"; break;
 45        case 5: monthName = "May"; break;
 46        case 6: monthName = "June"; break;
 47        case 7: monthName = "July"; break;
 48        case 8: monthName = "August"; break;
 49        case 9: monthName = "September"; break;
 50        case 10: monthName = "October"; break;
 51        case 11: monthName = "November"; break;
 52        case 12: monthName = "December";
 53      }
 54
 55      return monthName;
 56    }
 57
 58    /** Print month body */
printMonth
printMonthTitle
getMonthName
6.11  Method Abstraction and Stepwise Refinement  255
 59    public static void printMonthBody(int year, int month) {
 60      // Get start day of the week for the first date in the month
 61      int startDay = getStartDay(year, month);
 62
 63      // Get number of days in the month
 64      int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
 65
 66      // Pad space before the first day of the month
 67      int i = 0;
 68      for (i = 0; i < startDay; i++)
 69        System.out.print("    ");
 70
 71      for (i = 1; i <= numberOfDaysInMonth; i++) {
 72        System.out.printf("%4d", i);
 73
 74        if ((i + startDay) % 7 == 0)
 75          System.out.println();
 76      }
 77
 78      System.out.println();
 79    }
 80
 81    /** Get the start day of month/1/year */
 82    public static int getStartDay(int year, int month) {
 83      final int START_DAY_FOR_JAN_1_1800 = 3;
 84      // Get total number of days from 1/1/1800 to month/1/year
 85      int totalNumberOfDays = getTotalNumberOfDays(year, month);
 86
 87      // Return the start day for month/1/year
 88      return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
 89    }
 90
 91    /** Get the total number of days since January 1, 1800 */
 92    public static int getTotalNumberOfDays(int year, int month) {
 93      int total = 0;
 94
 95      // Get the total days from 1800 to 1/1/year
 96      for (int i = 1800; i < year; i++)
 97        if (isLeapYear(i))
 98          total = total + 366;
 99        else
100          total = total + 365;
101
102      // Add days from Jan to the month prior to the calendar month 
103      for (int i = 1; i < month; i++)
104        total = total + getNumberOfDaysInMonth(year, i);
105
106      return total;
107    }
108
109    /** Get the number of days in a month */
110    public static int getNumberOfDaysInMonth(int year, int month) {
111      if (month == 1 || month == 3 || month == 5 || month == 7 ||
112        month == 8 || month == 10 || month == 12)
113        return 31;
114
115      if (month == 4 || month == 6 || month == 9 || month == 11)
116        return 30;
117
118      if (month == 2) return isLeapYear(year)? 29: 28;
printMonthBody
getStartDay
getTotalNumberOfDays
getNumberOfDaysInMonth
256  Chapter 6    Methods
119
120      return 0; // If month is incorrect
121    }
122
123    /** Determine if it is a leap year */
124    public static boolean isLeapYear(int year) {
125      return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
126    }
127  }
The program does not validate user input. For instance, if the user enters either a month not in 
the range between 1 and 12 or a year before 1800, the program displays an erroneous calen-
dar. To avoid this error, add an if statement to check the input before printing the calendar.
This program prints calendars for a month, but could easily be modified to print calendars 
for a whole year. Although it can print months only after January 1800, it could be modified 
to print months before 1800.
6.11.4  Benefits of Stepwise Refinement
Stepwise refinement breaks a large problem into smaller manageable subproblems. Each sub-
problem can be implemented using a method. This approach makes the program easier to 
write, reuse, debug, test, modify, and maintain.
Simpler Program
The print calendar program is long. Rather than writing a long sequence of statements in one 
method, stepwise refinement breaks it into smaller methods. This simplifies the program and 
makes the whole program easier to read and understand.
Reusing Methods
Stepwise refinement promotes code reuse within a program. The isLeapYear method is 
defined once and invoked from the getTotalNumberOfDays and getNumberOfDaysIn-
Month methods. This reduces redundant code.
Easier Developing, Debugging, and Testing
Since each subproblem is solved in a method, a method can be developed, debugged, and tested 
individually. This isolates the errors and makes developing, debugging, and testing easier.
When implementing a large program, use the top-down and/or bottom-up approach. Do 
not write the entire program at once. Using these approaches seems to take more development 
time (because you repeatedly compile and run the program), but it actually saves time and 
makes debugging easier.
Better Facilitating Teamwork
When a large problem is divided into subprograms, subproblems can be assigned to different 
programmers. This makes it easier for programmers to work in teams.
Key Terms
isLeapYear
incremental development and 
testing
actual parameter  229
ambiguous invocation  245
argument  229
divide and conquer  249
formal parameter (i.e., parameter)  229
information hiding  249
method  228
method abstraction  249
method overloading  243
method signature  229
modifier  229
parameter  229
pass-by-value  236
scope of a variable  246
stepwise refinement  249
stub  251
Chapter Summary  257
Chapter Summary
1.	 Making programs modular and reusable is one of the central goals in software engineer-
ing. Java provides many powerful constructs that help to achieve this goal. Methods are 
one such construct.
2.	 The method header specifies the modifiers, return value type, method name, and param-
eters of the method. The static modifier is used for all the methods in this chapter.
3.	 A method may return a value. The returnValueType is the data type of the value the 
method returns. If the method does not return a value, the returnValueType is the 
keyword void.
4.	 The parameter list refers to the type, order, and number of a method’s parameters. 
The method name and the parameter list together constitute the method signature. 
Parameters are optional; that is, a method doesn’t need to contain any parameters.
5.	 A return statement can also be used in a void method for terminating the method and 
returning to the method’s caller. This is useful occasionally for circumventing the nor-
mal flow of control in a method.
6.	 The arguments that are passed to a method should have the same number, type, and 
order as the parameters in the method signature.
7.	 When a program calls a method, program control is transferred to the called method. 
A called method returns control to the caller when its return statement is executed, or 
when its method-ending closing brace is reached.
8.	 A value-returning method can also be invoked as a statement in Java. In this case, the 
caller simply ignores the return value.
9.	 A method can be overloaded. This means that two methods can have the same name, as 
long as their method parameter lists differ.
10.	 A variable declared in a method is called a local variable. The scope of a local variable 
starts from its declaration and continues to the end of the block that contains the vari-
able. A local variable must be declared and initialized before it is used.
11.	 Method abstraction is achieved by separating the use of a method from its implementa-
tion. The client can use a method without knowing how it is implemented. The details 
of the implementation are encapsulated in the method and hidden from the client who 
invokes the method. This is known as information hiding or encapsulation.
12.	 Method abstraction modularizes programs in a neat, hierarchical manner. Programs 
written as collections of concise methods are easier to write, debug, maintain, and 
modify than would otherwise be the case. This writing style also promotes method 
reusability.
13.	 When implementing a large program, use the top-down and/or bottom-up coding ap-
proach. Do not write the entire program at once. This approach may seem to take more 
time for coding (because you are repeatedly compiling and running the program), but it 
actually saves time and makes debugging easier.
258  Chapter 6    Methods
Quiz
Answer the quiz for this chapter online at the Companion Website.
Programming Exercises
Note
A common error for the exercises in this chapter is that students don’t implement the 
methods to meet the requirements even though the output from the main program 
is correct. For an example of this type of error, see liveexample.pearsoncmg.com/etc/
CommonMethodErrorJava.pdf.
Sections 6.2–6.9
	
6.1	
(Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2 for 
n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, ... . 
Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
For example, getPentagonalNumber(1) returns 1 and getPentagonalNum-
ber(2) returns 5. Write a test program that uses this method to display the first 
100 pentagonal numbers with 10 numbers on each line. Use the %7d format to 
display each number.
	
*6.2	
(Sum the digits in an integer) Write a method that computes the sum of the digits 
in an integer. Use the following method header:
public static int sumDigits(long n)
For example, sumDigits(234) returns 9 (= 2 + 3 + 4). (Hint: Use the % op-
erator to extract digits and the / operator to remove the extracted digit. For in-
stance, to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 
234 / 10 (= 23). Use a loop to repeatedly extract and remove the digit until 
all the digits are extracted. Write a test program that prompts the user to enter an 
integer then displays the sum of all its digits.
	 **6.3	
(Palindrome integer) Write the methods with the following headers:
// Return the reversal of an integer, e.g., reverse(456) re-
turns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palin-
drome if its reversal is the same as itself. Write a test program that prompts the 
user to enter an integer and reports whether the integer is a palindrome.
	
*6.4	
(Display an integer reversed) Write a method with the following header to dis-
play an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts 
the user to enter an integer then displays its reversal.
VideoNote
Reverse an integer
Programming Exercises  259
	
*6.5	
(Sort three numbers) Write a method with the following header to display three 
numbers in decreasing order:
public static void displaySortedNumbers(
  double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the 
method to display them in decreasing order.
	
*6.6	
(Display patterns) Write a method to display a pattern as follows:
              1
                             1 2
                         1 2 3          
...
n n–1 ... 3 2 1
The method header is
public static void displayPattern(int n)
	
*6.7	
(Financial application: compute the future investment value) Write a method that 
computes future investment value at a given interest rate for a specified number 
of years. The future investment is determined using the formula in Programming 
Exercise 2.21.
Use the following method header:
public static double futureInvestmentValue(
  double investmentAmount, double monthlyInterestRate,int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns 
12833.59.
Write a test program that prompts the user to enter the investment amount (e.g., 
1,000) and the interest rate (e.g., 9%) and prints a table that displays future value 
for the years from 1 to 30, as shown below:
The amount invested: 1000 
Annual interest rate: 9 
Years     Future Value
1             1093.80
2             1196.41
...
29           13467.25
30           14730.57
	
6.8	
(Conversions between mile and kilometer) Write a class that contains the follow-
ing two methods:
/** Convert from Mile to Kilometer */
public static double mileToKilometer(double mile)
/** Convert from Kilometer to Mile */
public static double kilometerToMile(double kilometer)
260  Chapter 6    Methods
The formula for the conversion is:
1 mile = 1.6 kilometers
Write a test program that invokes these methods to display the following tables:
Miles
Kilometers
|
Kilometers
Miles
1
1.609
|
20
12.430
2
3.218
|
25
15.538
. . .
9
14.481
|
60
37.290
10
16.090
|
65
40.398
	
6.9	
(Conversions between pounds and kilograms) Write a class that contains the fol-
lowing two methods:
/** Convert from pounds to kilograms */
public static double poundToKilogram(double pound)
/** Convert from kilograms to pounds */
public static double kilogramToPound(double kilogram)
The formula for the conversion is:
pound = 0.453 * kilogram
kilogram = 2.204 * pound
Write a test program that invokes these methods to display the following tables:
Kilograms
Pounds
|
Pounds
Kilograms
1
2.2
|
20
9.09
3
6.6
|
25
11.36
. . .
0
0
197
433.4
|
510
231.82
199
437.8
|
515
234.09
	
6.10	
(Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the 
isPrime(int number) method for testing whether a number is prime. Use 
this method to find the number of prime numbers less than 10000.
Programming Exercises  261
	
6.11	
(Financial application: compute commissions) Write a method that computes the 
commission, using the scheme in Programming Exercise 5.39. The header of the 
method is as follows:
public static double computeCommission(double salesAmount)
Write a test program that displays the following table:
Sales Amount
Commission
10000
900.0
15000
1500.0
20000
2100.0
25000
2700.0
30000
3300.0
35000
3900.0
40000
4500.0
45000
5100.0
50000
5700.0
55000
6300.0
60000
6900.0
65000
7500.0
70000
8100.0
75000
8700.0
80000
9300.0
85000
9900.0
90000
10500.0
95000
11100.0
100000
11700.0
	
6.12	
(Display numbers) Write a method that prints numbers using the following header:
public static void printNumbers(int num1, int num2, int
  number Per Line)
This method prints the characters between num1 and num2 with the specified 
numbers per line. Write a test program that prints ten characters per line from 1 
to 100. Numbers are separated by exactly one space.
	 *6.13	
(Sum series) Write a method to compute the following series:
m(i) = 1
3 + 2
4 + g +
i
i + 2
Write a test program that displays the following table:
I
m(i)
1
0.3333
2
0.8333
. . .
19
14.7093
20
15.6184
262  Chapter 6    Methods
	 *6.14	
(Estimate p) p can be computed using the following summation:
m(i) = 4a1 - 1
3 + 1
5 - 1
7 + 1
9 - 1
11 + g + (-1)i+1
2i - 1 b
Write a method that returns m(i) for a given i and write a test program that 
displays the following table:
i
m(i)
1
4.0000
101
3.1515
201
3.1466
301
3.1449
401
3.1441
501
3.1436
601
3.1433
701
3.1430
801
3.1428
901
3.1427
	 *6.15	
(Financial application: print a tax table) Listing 3.5 gives a program to compute 
tax. Write a method for computing tax using the following header:
public static double computeTax(int status, double
  taxable Income)
Use this method to write a program that prints a tax table for taxable income 
from $50,000 to $70,000 with intervals of $100 for all the following statuses:
Taxable 
Income
Single
Married Joint 
or Qualifying 
Widow(er)
Married 
Separate
Head of 
a House
50000
8688
6665
8688
7353
50100
8713
6680
8713
7378
. . .
69900
13663
9850
12328
9840
70000
13688
9875
12353
9853
Hint: round the tax into integers using Math.round (i.e., Math.round(compu-
teTax(status, taxable Income))).
VideoNote
Estimate p
Programming Exercises  263
	 *6.16	
(Number of days in a year) Write a method that returns the number of days in a 
year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in the years between 2014 
and 2034.
Sections 6.10 and 6.11
	 *6.17	
(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix 
using the following header: Here is a sample run:
public static int printMatrix(int year)
that prompts the user to enter n and displays an n-by-n matrix. Here is a sample 
run:
Enter n: 3 
0 1 0
0 0 0
1 1 1
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that 
prompts the user to enter n and displays an n-by-n matrix.
	**6.18	
(Check password) Some websites impose certain rules for passwords. Write a 
method that checks whether a string is a valid password. Suppose the password 
rules are as follows:
■
■A password must have at least ten characters.
■
■A password consists of only letters and digits.
■
■A password must contain at least three digits.
Write a program that prompts the user to enter a password and displays Valid 
Password if the rules are followed or Invalid Password otherwise.
264  Chapter 6    Methods
	 *6.19	
(Triangles) Implement the following two methods:
/** Return true if the sum of every two sides is
 * greater than the third side. */
public static boolean isValid(
  double side1, double side2, double side3)
/** Return the area of the triangle. */
public static double area(
  double side1, double side2, double side3)
Write a test program that reads three sides for a triangle and uses the isValid 
method to test if the input is valid and uses the area method to obtain the area. 
The program displays the area if the input is valid. Otherwise, it displays that 
the input is invalid. The formula for computing the area of a triangle is given in 
Programming Exercise 2.19.
	 *6.20	
(Count the letters in a string) Write a method that counts the number of letters in 
a string using the following header:
public static int countLetters(String s)
Write a test program that prompts the user to enter a string and displays the num-
ber of letters in the string.
	 *6.21	
(Phone keypads)  The international standard letter/number mapping for tele-
phones is given in Programming Exercise 4.15. Write a method that returns a 
number, given an uppercase letter, as follows:
public static int getNumber(char uppercaseLetter)
Write a test program that prompts the user to enter a phone number as a string. 
The input number may contain letters. The program translates a letter (uppercase 
or lowercase) to a digit and leaves all other characters intact. Here are sample 
runs of the program:
Enter a string: 1-800-Flowers 
1-800-3569377
Enter a string: 1800flowers 
18003569377
	**6.22	
(Math: approximate the square root) There are several techniques for imple-
menting the sqrt method in the Math class. One such technique is known as the 
Babylonian method. It approximates the square root of a number, n, by repeat-
edly performing the calculation using the following formula:
nextGuess = (lastGuess + n / lastGuess) / 2
When nextGuess and lastGuess are almost identical, nextGuess is the 
approximated square root. The initial guess can be any positive value (e.g., 1). 
This value will be the starting value for lastGuess. If the difference between 
nextGuess and lastGuess is less than a very small number, such as 0.0001, 
you can claim that nextGuess is the approximated square root of n. If not, 
nextGuess becomes lastGuess and the approximation process continues. 
Implement the following method that returns the square root of n:
public static double sqrt(long n)
Programming Exercises  265
Write a test program that prompts the user to enter a positive double value and 
displays its square root.
	 *6.23	
(Occurrences of a specified character) Write a method that finds the number of 
occurrences of a specified character in a string using the following header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that 
prompts the user to enter a string followed by a character then displays the 
number of occurrences of the character in the string.
Sections 6.10–6.12
	**6.24	
(Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the 
current time. Revise this example to display the current date and time. The calen-
dar example in Listing 6.12, PrintCalendar.java, should give you some ideas on 
how to find the year, month, and day.
	**6.25	
(Convert milliseconds to hours, minutes, and seconds) Write a method that con-
verts milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds. For example, con-
vertMillis(5500) returns a string 0:0:5, convertMillis(100000) 
returns a string 0:1:40, and convertMillis(555550000) returns a string 
154:19:10. Write a test program that prompts the user to enter a long integer 
for milliseconds and displays a string in the format of hours:minutes:seconds.
Comprehensive
	**6.26	
(Palindromic prime) A palindromic prime is a prime number and also palin-
dromic. For example, 131 is a prime and also a palindromic prime, as are 313 
and 757. Write a program that displays the first 120 palindromic prime numbers. 
Display 10 numbers per line, separated by exactly one space, as follows:
2   3   5   7   11  101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
	**6.27	
(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number 
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 
17 and 71 are emirps. Write a program that displays the first 120 emirps. Display 
10 numbers per line, separated by exactly one space, as follows:
13  17  31  37  71  73  79  97  107 113
149 157 167 179 199 311 337 347 359 389
...
	**6.28	
(Mersenne prime) A prime number is called a Mersenne prime if it can be written 
in the form 2p - 1 for some positive integer p. Write a program that finds all 
Mersenne primes with p … 31 and displays the output as follows:
p
2^p – 1
2
3
3
7
5
31
...
266  Chapter 6    Methods
	**6.29	
(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For 
example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are 
twin primes. Write a program to find all twin primes less than 1,200. Display the 
output as follows:
(3, 5)
(5, 7)
...
	**6.30	
(Game: craps) Craps is a popular dice game played in casinos. Write a program 
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respec-
tively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you 
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value 
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either 
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player. Here are some sample runs.
You rolled 5 + 6 = 11
You win
You rolled 1 + 2 = 3
You lose
You rolled 4 + 4 = 8
point is 8
You rolled 6 + 2 = 8
You win
You rolled 3 + 2 = 5
point is 5
You rolled 2 + 5 = 7
You lose
	**6.31	
(Financial: credit card number validation) Credit card numbers follow certain 
patterns. A credit card number must have between 13 and 16 digits. It must start 
with
■
■4 for Visa cards
■
■5 for Master cards
■
■37 for American Express cards
■
■6 for Discover cards
In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card 
numbers. The algorithm is useful to determine whether a card number is entered 
correctly, or whether a credit card is scanned correctly by a scanner. Credit card 
numbers are generated following this validity check, commonly known as the 
Programming Exercises  267
Luhn check or the Mod 10 check, which can be described as follows (for illustra-
tion, consider the card number 4388576018402626):
1.	 Double every second digit from right to left. If doubling of a digit results in a 
two-digit number, add up the two digits to get a single-digit number.
2.	 Now add all single-digit numbers from Step 1.
4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
3.	 Add all digits in the odd places from right to left in the card number.
6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
4.	 Sum the results from Step 2 and Step 3.
37 + 38 = 75
5.	 If the result from Step 4 is divisible by 10, the card number is valid; other-
wise, it is invalid. For example, the number 4388576018402626 is invalid, 
but the number 4388576018410707 is valid.
Write a program that prompts the user to enter a credit card number as a long 
integer. Display whether the number is valid or invalid. Design your program to 
use the following methods:
  /** Return true if the card number is valid */
  public static boolean isValid(long number)
  /** Get the result from Step 2 */
  public static int sumOfDoubleEvenPlace(long number)
  /** Return this number if it is a single digit, otherwise,
   * return the sum of the two digits */
  public static int getDigit(int number)
  /** Return sum of odd-place digits in number */
  public static int sumOfOddPlace(long number)
  /** Return true if the number d is a prefix for number */
  public static boolean prefixMatched(long number, int d)
  /** Return the number of digits in d */
  public static int getSize(long d)
  /** Return the first k number of digits from number. If the
   * number of digits in number is less than k, return number. */
  public static long getPrefix(long number, int k)
4388576018402626
2 ∗ 2 5 4
2 ∗ 2 5 4
4 ∗ 2 5 8
1 ∗ 2 5 2
6 ∗ 2 5 12  (1 1 2 5 3)
5 ∗ 2 5 10  (1 1 0 5 1)
8 ∗ 2 5 16  (1 1 6 5 7)
4 ∗ 2 5 8
268  Chapter 6    Methods
(You may also implement this program by reading the input as a string and pro-
cessing the string to validate the credit card.)
Enter a credit card number as a long integer:
  4388576018410707 
4388576018410707 is valid
Enter a credit card number as a long integer:
  4388576018402626 
4388576018402626 is invalid
	**6.32	
(Game: chance of winning at craps) Revise Exercise 6.30 to run it 15,000 times 
and display the number of winning games.
	**6.33	
(Current date and time) Invoking System.currentTimeMillis() returns the 
elapsed time in milliseconds since midnight of January 1, 1970. Write a program 
that displays the date and time. Here is a sample run:
Current date and time is May 16, 2012 10:34:23
	**6.34	
(Print calendar) Programming Exercise 3.21 uses Zeller’s congruence to calcu-
late the day of the week. Simplify Listing 6.12, PrintCalendar.java, using Zeller’s 
algorithm to get the start day of the month.
	
6.35	
(Geometry: area of a pentagon) The area of a pentagon can be computed using 
the following formula:
Area =
5 * s2
4 * tan ap
5 b
Write a method that returns the area of a pentagon using the following header:
public static double area(double side)
Write a main method that prompts the user to enter the side of a pentagon and 
displays its area. Here is a sample run:
Enter the side: 5.5 
The area of the pentagon is 52.04444136781625
	 *6.36	
(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon 
in which all sides are of the same length and all angles have the same degree (i.e., 
Programming Exercises  269
the polygon is both equilateral and equiangular). The formula for computing the 
area of a regular polygon is
Area =
n * s2
4 * tan ap
n b
Write a method that returns the area of a regular polygon using the following 
header:
public static double area(int n, double side)
Write a main method that prompts the user to enter the number of sides and the 
side of a regular polygon and displays its area. Here is a sample run:
Enter the number of sides: 5 
Enter the side: 6.5 
The area of the polygon is 72.69017017488385
	
6.37	
(Format an integer) Write a method with the following header to format the inte-
ger with the specified width.
public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s. The size 
of the string is the width. For example, format(34, 4) returns 0034 and for-
mat(34, 5) returns 00034. If the number is longer than the width, the method 
returns the string representation for the number. For example, format(34, 1) 
returns 34.
Write a test program that prompts the user to enter a number and its width, and 
displays a string returned by invoking format(number, width).
	 *6.38	
(Generate random characters) Use the methods in RandomCharacter in 
Listing 6.10 to print 200 uppercase letters and then 200 single digits, printing ten 
per line.
	
6.39	
(Geometry: point position)  Programming Exercise 3.32 shows how to test 
whether a point is on the left side of a directed line, on the right, or on the same 
line. Write the methods with the following headers:
/** Return true if point (x2, y2) is on the left side of the
 * directed line from (x0, y0) to (x1, y1) */
public static boolean leftOfTheLine(double x0, double y0,
  double x1, double y1, double x2, double y2)
/** Return true if point (x2, y2) is on the same
 * line from (x0, y0) to (x1, y1) */
public static boolean onTheSameLine(double x0, double y0,
  double x1, double y1, double x2, double y2)
/** Return true if point (x2, y2) is on the
 * line segment from (x0, y0) to (x1, y1) */
public static boolean onTheLineSegment(double x0, double y0,
  double x1, double y1, double x2, double y2)
270  Chapter 6    Methods
Write a program that prompts the user to enter the three points for p0, p1, and p2 
and displays whether p2 is on the left side of the line from p0 to p1, right side, 
the same line, or on the line segment. Here are some sample runs:
Enter three points for p0, p1, and p2: 1 1 2 2 1.5 1.5 
(1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.0, 2.0)
Enter three points for p0, p1, and p2: 1 1 2 2 3 3 
(3.0, 3.0) is on the same line from (1.0, 1.0) to (2.0, 2.0)
Enter three points for p0, p1, and p2: 1 1 2 2 1 1.5 
(1.0, 1.5) is on the left side of the line
  from (1.0, 1.0) to (2.0, 2.0)
Enter three points for p0, p1, and p2: 1 1 2 2 1 –1 
(1.0, −1.0) is on the right side of the line
  from (1.0, 1.0) to (2.0, 2.0)
