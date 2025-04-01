//  Written By Dr Govindha Ramaiah Yeluripati
// Editied by Calvin Mac Phillips

// Taking input from the user
import java.util.Scanner;

// Implementing stack from scratch
class Stack{
    Integer A[] = new Integer[10];
    int size, i, top;
    boolean isEmpty(){
    if (size == 0)
        return true;
    else
        return false;
    }
void create(){
    for(i= 0; i < 10; i++)
        A[i] = null;
        size = 0;
        top = -1;
        System.out.println("An Empty Stack is created successfully..");
    }
    int stackSize(){
/*size=0;
for(i=0;i<n; i++)
if(A[i] != null)
size++;*/
    return size;
    }
    void pop(){
        if (top == -1)
            System.out.println("The stack is Empty..Can't pop an Item");
        else{
            System.out.println("The item " + A[top] + " from the top of the Stack is popped..");
        A[top] = null;
        top--;
        size--;
        }
    }
    void push(int item){
        if (top == 9 || size == 10)
            System.out.println("The Stack is Full..Can't push a new item\n");
        else {
            top++;
            A[top] = item;
            size++;
            System.out.println("Item " + item + " pushed on to the top of the Stack..");
            }
    }   
    void show(){
        if(isEmpty())
            System.out.println("The Stack is empty");
        else{
            System.out.println("The current Stack is:");
        for (i=top; i>=0; i--){
            System.out.println("| |");
            System.out.println("| " + A[i] + " |");
            System.out.println("| |");
            System.out.println(" ____");
            }
        }
    }
}


public class StackArrayMain{
public static void main(String[] args){
    Stack S = new Stack();
    int op = 1;
    Scanner ip = new Scanner(System.in);
    System.out.println(" This is a program for Stack implementation using Arrays..");
    S.create();
    while (op >= 1){
        System.out.println("Choose an option from below:");
        System.out.println("Enter 0 to exit..");
        System.out.println("1. Size of the Stack");
        System.out.println("2. Pop an item");
        System.out.println("3. Push an item");
        System.out.println("4. Show the Stack");
        int option = ip.nextInt();
    switch (option){
    case 0:
    {
        op=0;
        break;
    }
        case 1:
    {
        int k = S.stackSize();
        System.out.println("\nThe size of the Stack is:" + k);
        break;
        }
    case 2:
    {
        S.pop();
        break;
        }
    case 3:
{
System.out.println("\nEnter the item to be pushed onto the stack:");
int k = ip.nextInt();
S.push(k);
break;
}
    case 4:
    {
        S.show();
        break;
    }
    default:
        { System.out.println("Invalid Option...Try Again.");
        break;
        }
    }
    }
    }
}


