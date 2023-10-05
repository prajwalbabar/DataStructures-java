import java.util.*;

public class Queue_Array {
    public static class queue {
        static int arr[];
        public static int rear = -1;
        public static int size;

        public queue(int size){
           arr = new int[size];
           this.size = size;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public void add(int data){
            if(rear == arr.length-1){
                System.out.println("Queue is full");
            }else{
                rear++;
                arr[rear] = data;
            }
        }

        public void remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty...");
            }else{
                int front = 0;
                for(int i=0; i<rear; i++){
                    arr[i] = arr[i+1];
                }
                rear--;
            }
        }

        public void peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty...");
            }else{
                System.out.println(arr[0]);
            }
        }
    }

    public static void main(String args[]){
        queue q = new queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        while(! q.isEmpty()){
          q.peek();
          q.remove();
        }
    }
}