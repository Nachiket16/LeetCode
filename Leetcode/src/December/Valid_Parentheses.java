package December;

import java.util.Stack;

/*
 * 
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 * 
 */
public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
        char temp=')';
        if(s.length()%2 != 0){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                temp=s.charAt(i);
                if(stack.size() == 0){
                    return false;
                }
                if(stack.peek() == '(' && temp == ')'){
                stack.pop();
                }else if(stack.peek() == '{' && temp == '}'){
                    stack.pop();
                }else if(stack.peek() == '[' && temp == ']'){
                    stack.pop();
                }else{
                    return false;
                }
            }
            
        }
        if(stack.size()!=0){
            return false;
        }else{
            return true;
        }
	}
}
