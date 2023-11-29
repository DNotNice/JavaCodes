package com.company.stacksEx;

public class StackMain {
    public static void main(String[] args) throws StackExceptions {
   DynamicStack stack = new DynamicStack(5);
     stack.push(2);
     stack.push(23);
     stack.push(43);
     stack.push(53);
     stack.push(11);
     stack.push(23);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
