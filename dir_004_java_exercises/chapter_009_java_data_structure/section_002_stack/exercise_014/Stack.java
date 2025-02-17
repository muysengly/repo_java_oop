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

  public void swapTopTwo() {
    if (top < 1) {
      System.out.println("Stack has less than two elements");
    } else {
      int temp = arr[top];
      arr[top] = arr[top - 1];
      arr[top - 1] = temp;
    }
  }

  // Method to display the elements of the stack
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
    Stack stack = new Stack(5);
    System.out.println("Input some elements on the stack:");
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.display();
    stack.swapTopTwo();
    System.out.println("\nAfter swapping top two elements:");
    stack.display();
    System.out.println("\nAgain swapping top two elements:");
    stack.swapTopTwo();
    stack.display();
  }
}
