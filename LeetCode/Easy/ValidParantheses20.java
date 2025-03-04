package main.java.LeetCode.Easy;

import java.util.Stack;

public class ValidParantheses20 {
    public static boolean isValidParantheses(String s) {
        Stack<Character> paranStack = new Stack<>();

       for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           if (ch == '{' || ch == '(' || ch == '['){
               paranStack.push(ch);
               continue;
           }

           if (paranStack.isEmpty())
               return false;

           char check;
           switch(ch){
               case ')':
                   check = paranStack.pop();
                   if (check == '{' || check == '[')
                       return false;
                   break;

               case '}':
                   check = paranStack.pop();
                   if (check == '(' || check == '[')
                       return false;
                   break;

               case ']':
                   check = paranStack.pop();
                   if(check == '(' || check == '{')
                       return false;
                   break;
           }

        }

        return paranStack.isEmpty();
    }
    public static void main(String[] args) {

        System.out.println(ValidParantheses20.
                isValidParantheses("(){}[]"));
        System.out.println(ValidParantheses20.
                isValidParantheses("({[]})"));
    }
}
