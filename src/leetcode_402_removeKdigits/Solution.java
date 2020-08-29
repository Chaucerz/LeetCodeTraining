package leetcode_402_removeKdigits;

import java.util.Collections;
import java.util.Stack;

/**
 * @author Chaucer
 * @date 2019-08-30 21:44
 */
public class Solution {
    public String removeKdigits(String num, int k) {

        if(num.length() == k) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int curr = num.charAt(i) - '0';
            while (!stack.isEmpty() && stack.peek() > curr && k > 0) {
                stack.pop();
                k--;
            }
            if (!stack.isEmpty()|| curr != 0){
                stack.push(curr);
            }
        }
        while(k > 0){
            stack.pop();
            k--;
        }
        while (!stack.isEmpty()) {
            sb.insert(0,stack.pop());
        }
        System.out.println(sb.toString());
        return sb.toString();

    }

    public static void main(String[] args) {
        String num = "112";
        new Solution().removeKdigits(num, 1);
    }
}
