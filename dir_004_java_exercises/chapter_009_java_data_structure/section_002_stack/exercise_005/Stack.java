import java.util.Scanner;

public class Stack {
  private int[] arr;
  private int top;

  // Constructor to initialize the stack
  public Stack(int size) {
    arr = new int[size];
    top = -1;
  }

  // Method to push an element onto the stack
  public void push(int num) {
    if (top == arr.length - 1) {
      System.out.println("Stack is full");
    } else {
      top++;
      arr[top] = num;
    }
  }

  // Method to pop an element from the stack
  public int pop() {
    if (top == -1) {
      System.out.println("Stack Underflow");
      return -1;
    } else {
      int poppedElement = arr[top];
      top--;
      return poppedElement;
    }
  }

  // Method to get the top element of the stack
  public int peek() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    } else {
      return arr[top];
    }
  }

  // Method to check if the stack is empty
  public boolean isEmpty() {
    return top == -1;
  }

  // Method to get the maximum value
  public int get_Max() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    }

    int max = arr[0];

    for (int i = 1; i <= top; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }

  // Method to get the minimum value
  public int get_Min() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    }

    int min = arr[0];

    for (int i = 1; i <= top; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }

    return min;
  }

  public void display() {
    if (top == -1) {
      System.out.println("Stack is empty");
    } else {
      System.out.print("Stack elements: ");
      for (int i = top; i >= 0; i--) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.println("Initialize a stack:");
    Stack stack = new Stack(10);
    System.out.println("\nInput some elements on the stack:");
    stack.push(1);
    stack.push(3);
    stack.push(2);
    stack.push(0);
    stack.push(7);
    stack.push(5);
    stack.push(-1);
    stack.display();
    int max_val = stack.get_Max();
    System.out.println("\nMaximum value in stack: " + max_val);
    int min_val = stack.get_Min();
    System.out.println("\nMinimum value in stack: " + min_val);
  }
}
