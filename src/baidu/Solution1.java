package baidu;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-24 19:39
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int temp = lcm(i,j) - gcd(i,j);
                if (temp > res) {
                    res = temp;
                }
            }
        }
        System.out.println(res);
    }

    private static int lcm(int i, int j) {
        return i * j / gcd(i, j);
    }


    private static int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
