package xiaomi;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String num;
        for(int i = 0;i < n;i++){
            num = sc.nextLine();
            String[] nums = num.split(" ");
            String[] res = help(nums);
            for(int j = 0;j < res.length;j++){
                System.out.print(res[j]);
                if(j != res.length - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static String[] help(String[] nums){
        if(nums.length == 0 || nums.length == 1){
            return nums;
        }
        int x = 1;
        int n = nums.length;
        for(int i = 1;i < n;){
            if(nums[i - 1].equals("0")){
                for(int j = i;j < n;j++){
                    nums[j - i] = nums[j];
                }
                nums[nums.length - x] = "0";
                x++;
                n--;
            }else if(nums[i - 1].equals(nums[i])){
                nums[i - 1] = (2 * Integer.parseInt(nums[i - 1])) + "";
                for(int j = i + 1;j < n;j++){
                    nums[j - i] = nums[j];
                }
                nums[nums.length - x] = "0";
                x++;
                n--;
            }else {
                i++;
            }
        }
        return nums;
    }
}