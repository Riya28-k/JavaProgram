import java.util.Scanner;
class Stack {
private int arr[];
private int top;
private int capacity;
public Stack(int size) {
arr = new int[size];
capacity = size;
top = -1;
}
public void push(int item) {
if (top == capacity - 1) {
System.out.println("Stack Overflow! Cannot push " + item);
return;
}
arr[++top] = item;
System.out.println(item + " pushed into stack.");
}
public int pop() {
if (top == -1) {
System.out.println("Stack Underflow! Cannot pop");
return -1;
}
return arr[top--];
}
public void display() {
if (top == -1) {
System.out.println("Stack is empty!");
return;
}
System.out.print("Stack elements: ");
for (int i = 0; i <= top; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
}
}
public class StackImplementation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter stack size: ");
int size = scanner.nextInt();
Stack stack = new Stack(size);
while (true) {
System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.print("Enter value to push: ");
int value = scanner.nextInt();
stack.push(value);
break;
case 2:
System.out.println("Popped: " + stack.pop());
break;
case 3:
stack.display();
break;
case 4:
System.out.println("Exiting...");
scanner.close();
return;
default:
System.out.println("Invalid choice, try again.");
}
}
}
}
