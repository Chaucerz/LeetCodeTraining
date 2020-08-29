package youzan;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-10 21:31
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int[] arrays = new int[length];
        String arr = sc.nextLine();
        String[] arrs = arr.split(",");
        for (int i = 0; i < arrs.length; i++) {
            arrays[i] = Integer.parseInt(arrs[i]);
        }

        int res = help(length, arrays);
        System.out.println(res);
    }

    private static int help(int n, int[] dian) {
        if (n <= 1) {
            return 0;
        }
        if (n == 2) {
            return Math.abs(dian[1] - dian[0]);
        }
        int distance = 0;
        for (int i = 0; i <= n - 2; i++) {
            int temp = 0;
            for (int j = 0; j < n - 1; j++) {
                if(j + 1 == i) {
                    temp += Math.abs(dian[j + 2] - dian[j]);
                    j++;
                } else {
                    temp += Math.abs(dian[j + 1] - dian[j]);
                }
            }
            if (i == 1) {
                distance = temp;
            } else {
                if (temp < distance) {
                    distance = temp;
                }
            }
        }
        return distance;
    }
}
