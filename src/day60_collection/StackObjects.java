package day60_collection;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("Top of my stack: " + stack.peek());

        stack.pop();
        System.out.println(stack);
        System.out.println("Top of my stack: " + stack.peek());
        System.out.println(stack);

        System.out.println(stack.remove(0));
        System.out.println(stack);

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(40);
        stack1.push(20);
        stack1.push(100);
        System.out.println(stack);
        System.out.println(stack1.peek());

        System.out.println(stack1.pop());

        System.out.println(stack1.pop());
        System.out.println(stack1);

        System.out.println(stack1.peek());

    }



    }

