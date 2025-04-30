import java.util.Scanner;
class Queue {
private int arr[];
private int front, rear, capacity;
public Queue(int size) {
arr = new int[size];
capacity = size;
front = 0;
rear = -1;
}
public void enqueue(int item) {
if (rear == capacity - 1) {
System.out.println("Queue Overflow! Cannot enqueue " + item);
return;
}
arr[++rear] = item;
System.out.println(item + " enqueued into queue.");
}
public int dequeue() {
if (front > rear) {
System.out.println("Queue Underflow! Cannot dequeue");
return -1;
}
return arr[front++];
}

public void display() {
if (front > rear) {
System.out.println("Queue is empty!");
return;
}
System.out.print("Queue elements: ");
for (int i = front; i <= rear; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
}
}
public class QueueImplementation {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter queue size: ");
int size = scanner.nextInt();
Queue queue = new Queue(size);

while (true) {
System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.print("Enter value to enqueue: ");
int value = scanner.nextInt();
queue.enqueue(value);
break;
case 2:
System.out.println("Dequeued: " + queue.dequeue());
break;
case 3:
queue.display();
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
