import java.util.Stack;

public class stack_collections {
    public static void pushAtBottom(int data, Stack<Integer> stk) {
        if (stk.isEmpty()) {
            stk.push(data);
        } else {
            int top = stk.pop();
            pushAtBottom(data, stk);
            stk.push(top);
        }
    }

    public static void main(String args[]) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        System.out.println(stk.peek());
        pushAtBottom(30, stk);
        stk.pop();
        stk.pop();
        System.out.println(stk.peek());

    }
}
