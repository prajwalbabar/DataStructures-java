import java.util.Scanner;

public class stack_linkedlist {
    public static class node {
        int data;
        node next = null;

        public node(int data) {
            this.data = data;
        }
    }

    public static class stack {

        static node head = null;

        public void push(int data) {
            node n = new node(data);
            if (head == null) {
                head = n;
            } else {
                n.next = head;
                head = n;
            }
        }

        public void pop() {
            if (head == null) {
                System.out.println("stack is empty.");
            } else {
                head = head.next;
            }
        }

        public void peek() {
            if (head == null) {
                System.out.println("stack is empty.");
            } else {
                System.out.println(head.data);
            }
        }
    }

    public static void main(String args[]) {
        stack sk = new stack();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1. push ");
            System.out.println("2. peek.");
            System.out.println("3. pop");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("enter element to push: ");
                    int e = sc.nextInt();
                    sk.push(e);
                    break;
                case 2:
                    sk.peek();
                    break;
                case 3:
                    sk.pop();
                    break;
                case 0:
                    System.exit(0);

            }
        } while (ch != 0);
    }
}
