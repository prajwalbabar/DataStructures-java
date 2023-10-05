import java.util.ArrayList;
import java.util.Scanner;

public class Stack_arrayList {
    public static class Stack{
        ArrayList <Integer> stk = new ArrayList<>();
        public boolean isEmpty(){
            boolean ans = stk.isEmpty();
            return ans;
        }
        int top = -1;
        public void push(int data){
            if(isEmpty()){
                stk.add(data);
                top = 0;
            }else{
                stk.add(data);
                top++;
            }
        }

        public void pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }else{
                stk.remove(top);
                top--;
            }
        }

        public void peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
            }else{
                System.out.println(stk.get(top));
            }
        }
        
    }

    public static void main(String args[]){
        Stack a = new Stack();
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
                    a.push(e);
                    break;
                case 2:
                    a.peek();
                    break;
                case 3:
                    a.pop();
                    break;
                case 0:
                    System.exit(0);

            }
        } while (ch != 0);
        
    }
}
