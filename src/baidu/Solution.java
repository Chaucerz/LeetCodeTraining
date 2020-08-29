package baidu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-24 19:34
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String str = sc.nextLine();

        String[] strs = str.split(" ");
        int[] nums = new int[strs.length];
        for(int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
            System.out.println(nums[i]);
        }


    }



}
