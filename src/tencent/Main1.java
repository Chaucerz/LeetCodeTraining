package tencent;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-01 20:47
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //宝箱的数量
        int n = sc.nextInt();

        //钥匙的数量
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        boolean[] flag = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        //for (int i = 0; i < arr.length;)

    }
}
