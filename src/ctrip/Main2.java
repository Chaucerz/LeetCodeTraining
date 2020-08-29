package ctrip;

import java.util.Scanner;
import java.util.*;

/**
 * @author Chaucer
 * @date 2019-09-04 19:38
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String test = resolve(str);
        System.out.println(test);
    }

    private static String resolve(String str) {
        char[] strArr = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        List<Character> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == '(') {
                left++;
            }
            if (strArr[i] == ')') {
                right++;
            }
        }
        if (left != right) {
            return "";
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != ')') {
                stack.push(strArr[i]);
            } else {
                list.clear();
                while (stack.peek() != '(') {
                    list.add(stack.pop());
                }
                if (stack.peek() == '(') {
                    stack.pop();
                }
                for (int j = 0; j < list.size(); j++) {
                    stack.push(list.get(j));
                }
            }
        }
        list.clear();
        int len = stack.size();
        for (int i = 0; i < len; i++) {
            list.add(stack.pop());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
