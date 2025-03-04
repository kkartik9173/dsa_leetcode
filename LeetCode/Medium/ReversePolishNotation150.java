package main.java.LeetCode.Medium;

import main.java.LeetCode.Easy.IntersectedLinkedList160;

import java.util.Stack;

public class ReversePolishNotation150 {

    private static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-")
                || str.equals("*") || str.equals("/");
    }
    private static int evalRPN(String[] tokens) {
        Stack<String> stringStack = new Stack<>();
        for(String str: tokens){
            if(isOperator(str)){

                int element2 = Integer.parseInt(stringStack.pop());
                int element1 = Integer.parseInt(stringStack.pop());
                int result = 0;
                if (str.equals("+"))
                    result = element1 + element2;
                else if(str.equals("-"))
                    result = element1 - element2;
                else if(str.equals("*"))
                    result = element1 * element2;
                else
                    result = element1/element2;

                stringStack.push(result+"");
            }else
                stringStack.push(str);
        }
        return Integer.parseInt(stringStack.peek());
    }

    public static void main(String[] args) {

        String[] tokens = {"2","1","+","3","*"};
        int result = ReversePolishNotation150.evalRPN(tokens);
        System.out.println("result of reverse Polish Notation "+ result);
    }



}
