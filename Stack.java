import java.util.*;
public class Stack{
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Stack : "+s);
        System.out.println("Stack top element: "+s.peek());
        System.out.println("Stack  : "+s);
        System.out.println("Stack after popped : "+s.pop());
        System.out.println("Stack : "+s);
        System.out.println("Stack : "+s.size());
        System.out.println("Stack is empty : "+s.empty());


    }
}