package com.coding.practice.recursion.reverse_stack;

import java.util.Stack;

public class ReverseStackApp {

    private static Stack<Integer> reverse(Stack<Integer> s) {

        if (!s.isEmpty()) {
            int temp = s.pop();
            reverse(s);
            reverseInsert(s, temp);
        }

        return s;
    }

    private static void reverseInsert(Stack<Integer> s, int curr) {
        if (s.isEmpty()) {
            s.push(curr);
        } else {
            int temp = s.pop();
            reverseInsert(s, curr);
            s.push(temp);
        }
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        System.out.println(s.toString());

        Stack<Integer> r = reverse(s);

        System.out.println(r.toString());

    }

}