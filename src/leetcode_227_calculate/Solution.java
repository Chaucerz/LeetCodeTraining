package leetcode_227_calculate;


import java.util.Stack;

/**
 * @author Chaucer
 * @date 2019-08-26 19:21
 */
public class Solution {
    public int calculate(String s) {

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){   //判断是否为数字
                num = num * 10 + c - '0';  //可能有多位数字
            }

            //当i为最后一位时，一定为数字，该数字也需要入栈
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                switch (sign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                }
                sign = c;
                num = 0;
            }
        }

        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int calculate = new Solution().calculate("42");
        System.out.println(calculate);
    }
}
