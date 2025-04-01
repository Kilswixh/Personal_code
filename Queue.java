//  Written By Dr Govindha Ramaiah Yeluripati
// Editied by Calvin Mac Phillips

import java.util.Scanner;

public class Queue {  
    private int[] A;
    private int size, front, rear;
    
    public Queue() {
        A = new int[10];
        size = 0;
        front = 0;
        rear = -1;
        System.out.println("An Empty Queue is created successfully..\n");
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int queueSize() {
        return size;
    }
    
    public void enqueue(int item) {
        if (rear == 9 || size == 10) {
            System.out.println("\n\n The Queue is Full..Can't insert a new item\n");
        } else {
            rear++;
            A[rear] = item;
            size++;
        }
        displayQueue();
    }
    
    public void dequeue() {
        if (size == 0 || rear == -1) {
            System.out.println("\n\n The Queue is Empty..Can't delete an Item");
        } else if (size == 1 || front == rear) {
            A[front] = 0;
            front = 0;
            rear = -1;
            size--;
        } else {
            A[front] = 0;
            front++;
            size--;
        }
        displayQueue();
    }
    
    public void displayQueue() {
        System.out.println("\n-------------------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            if (A[i] == 0)
                System.out.print("|     |");
            else
                System.out.print("| " + A[i] + " |");
        }
        System.out.println("\n-------------------------------------------------------------------------");
    }
    
    public static void main(String[] args) {  // Ensure this method is public and static
        Queue q = new Queue();
        Scanner scanner = new Scanner(System.in);
        int op = 1;
        System.out.println("This is a program for Simple Queue implementation using Arrays..\n");

        while (op >= 1) {
            System.out.println("\n\nChoose an option from below:");
            System.out.println("Enter 0 to exit..");
            System.out.println("1. Size of the Queue");
            System.out.println("2. Dequeue an item");
            System.out.println("3. Enqueue an item");
            System.out.print(":: ");

            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    op = 0;
                    break;
                case 1:
                    System.out.println("\nThe size of the Queue is: " + q.queueSize());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    System.out.println("\nEnter the item to be inserted into the Queue:");
                    int k = scanner.nextInt();
                    q.enqueue(k);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
        scanner.close();
    }
}
