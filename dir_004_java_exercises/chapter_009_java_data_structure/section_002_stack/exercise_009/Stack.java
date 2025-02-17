import java.util.Scanner;
import java.util.HashSet;

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

  // Method to remove duplicates
  public void remove_Duplicates() {
    HashSet<Integer> set = new HashSet<Integer>();
    Stack tempStack = new Stack(arr.length);

    while (!isEmpty()) {
      int current = pop();
      if (!set.contains(current)) {
        set.add(current);
        tempStack.push(current);
      }
    }

    while (!tempStack.isEmpty()) {
      push(tempStack.pop());
    }
  }

  // Method to remove duplicates
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
    stack.push(3);
    stack.push(-1);
    stack.display();
    stack.remove_Duplicates();
    System.out.print("\nStack after removing duplicates:\n");
    stack.display();
  }
}
