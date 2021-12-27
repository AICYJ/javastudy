import java.util.Stack;
public class B_01_stack {
    public static void main(String[] args) {
                Stack<String> s = new Stack();
                //push top
                s.push("apple");
                s.push("banana");
                s.push("cherry");
                System.out.println(s);
                //pop top
                System.out.println("pop:"+s.pop());
                System.out.println(s);
                //peek top
                System.out.println("peek:"+s.peek());
                //int search 
                System.out.println(s.search("apple"));
                System.out.println(s.search("banana"));
            }
        }
        