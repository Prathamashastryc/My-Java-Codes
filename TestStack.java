class Stack {
    int maxSize = 10;
    int arr[] = new int[maxSize];
    int top;

    Stack() {
        top = -1;
    }

    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            arr[++top] = value;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            return arr[top--];
        }
    }
}

public class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}
