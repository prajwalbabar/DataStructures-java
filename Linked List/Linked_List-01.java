import java.util.*;

class LL {

    class node {
        int data;
        node next = null;

        public node(int data) {
            this.data = data;
        }
    }

    node head = null;

    public void addFirst(int data) {
        node n1 = new node(data);
        if (head == null) {
            head = n1;
        } else {
            n1.next = head;
            head = n1;
        }
    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addLast(int data) {
        node n1 = new node(data);
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List Is Empty");
        } else {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked List Is Empty");
        } else {
            if (head.next == null) {
                head = null;
            } else {
                node sendLast = head; // 1 2 3 4 5 6 7
                node last = head.next;
                while (last.next != null) {
                    sendLast = sendLast.next;
                    last = last.next;
                }
                sendLast.next = null;
            }

        }
    }

    public void size() {
        node temp = head;
        if (head == null) {
            System.out.println(0);
        } else {
            int size = 0;
            while (temp != null) {
                temp = temp.next;
                size++;

            }
            System.out.println("size of Linked list is : " + size);
        }

    }

    public static void main(String args[]) {
        LL obj = new LL();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1. add Element at first");
            System.out.println("2. add Element at last");
            System.out.println("3. delete Element at first");
            System.out.println("4. delete Element at last");
            System.out.println("5. Print LinkedList");
            System.out.println("0. exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter element to add: ");
                    int e = sc.nextInt();
                    obj.addFirst(e);
                    break;
                case 2:
                    System.out.println("Enter element to add: ");
                    e = sc.nextInt();
                    obj.addLast(e);
                    break;
                case 3:
                    obj.deleteFirst();
                    break;
                case 4:
                    obj.deleteLast();
                    break;
                case 5:
                    obj.print();
                    break;
                case 6:
                    obj.size();
                    break;

            }
        } while (ch != 0);
    }
}