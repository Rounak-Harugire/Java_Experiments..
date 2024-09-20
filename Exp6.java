import java.util.Scanner;

interface Stack {
    void push(int element);
    void pop();
    void display1();
}

interface Queue {
    void enque(int element);
    void dequeue();
    void display2();
}

class Operati implements Stack, Queue {
    int arr[];
    int top;
    int front;
    int rear;
    int size = 5;

    public Operati() {
        arr = new int[size];
        top = -1;
        front = -1;  
        rear = -1;
    }

    // Stack methods
    public void push(int element) {
        if (top >= size - 1) {
            System.out.println("Stack overflow");
        } else {
            arr[++top] = element;
            System.out.println(element + " pushed to stack");
        }
    }

    public void pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
        } else {
            System.out.println(arr[top--] + " popped from stack");
        }
    }

    public void display1() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    // Queue methods
    public void enque(int element) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            arr[++rear] = element;
            System.out.println(element + " pushed to Queue");
            if (front == -1) { 
                front = 0;
            }
        }
    }

    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print(arr[front++] + " popped from Queue");
            System.out.println();
        }
    }

    public void display2() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}

public class Exp6 {
    public static void main(String[] args) {
        int choice, operation;
        Scanner sc = new Scanner(System.in);
        Operati obj = new Operati();

        do {
            System.out.println("Enter your Choice");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Stack Operations");
                    System.out.println("Enter your choice");
                    System.out.println("1. Push");
                    System.out.println("2. Pop");
                    System.out.println("3. Display");
                    operation = sc.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.println("Enter element to insert ");
                            int stackElement = sc.nextInt();
                            obj.push(stackElement);
                            break;
                        case 2:
                            obj.pop();
                            break;
                        case 3:
                            obj.display1();
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Queue Operations");
                    System.out.println("Enter your choice");
                    System.out.println("1. Enqueue");
                    System.out.println("2. Dequeue");
                    System.out.println("3. Display");
                    operation = sc.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.println("Enter element to insert ");
                            int queueElement = sc.nextInt();
                            obj.enque(queueElement);
                            break;
                        case 2:
                            obj.dequeue();
                            break;
                        case 3:
                            obj.display2();
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, try again!");
            }
        } while (choice != 3);

        sc.close();
    }
}
