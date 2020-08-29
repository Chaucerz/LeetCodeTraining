package qianxin;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 * @author Chaucer
 * @date 2019-09-09 19:32
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pid = sc.nextLine();
        String ppid = sc.nextLine();
        int num = sc.nextInt();

        String[] pids = pid.split(" ");
        String[] ppids = ppid.split(" ");


        int help = help(pids, ppids, num);
        System.out.println(help);

    }

    private static int help(String[] pids, String[] ppids, int num) {
        Set<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < pids.length; i++) {
            if (Integer.valueOf(pids[i]) == num) {
                set.add(Integer.valueOf(pids[i]));
                stack.add(Integer.valueOf(pids[i]));
            }
        }
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            for (int i = 0; i < ppids.length; i++) {
                if (Integer.valueOf(ppids[i]) == curr){
                    set.add(Integer.valueOf(pids[i]));
                    stack.add(Integer.valueOf(pids[i]));
                }
            }
        }
        return set.size();
    }
}
