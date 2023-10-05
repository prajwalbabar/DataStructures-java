import java.util.*;

public class Linked_List_collections{
   
 public static void main(String[] args) {
   LinkedList <Integer> list = new LinkedList<>();
    list.add(5);
    list.add(10);
    list.add(15);
    list.addLast(20);
    
    list.set(1,15);
    System.out.println(list);
 }

}