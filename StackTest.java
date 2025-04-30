import java.util.Scanner;

// Stack Interface
interface Stack {
    int size = 5; // Fixed size
    void push(int value);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// IntegerStack class implementing Stack
class IntegerStack implements Stack {
    int[] stack = new int[size];
    int top = -1;

    public void push(int value) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int poppedValue = stack[top--];
            System.out.println(poppedValue + " popped from stack.");
            return poppedValue;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// Test class with User Input
public class StackTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerStack myStack = new IntegerStack();
        int choice;

        do {
            System.out.println("\nStack Operations Menu");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    myStack.push(value);
                    break;
                case 2:
                    myStack.pop();
                    break;
                case 3:
                    myStack.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        } while (choice != 4);

        sc.close();
    }
}
