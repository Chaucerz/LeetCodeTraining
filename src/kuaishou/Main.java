package kuaishou;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-08-25 17:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];


        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int res = arr[i];
            int a = 0;
            while (res != 0) {
               int b =  res % 10;
                a += b * b;
               res = res / 10;
               if(res == 0) {
                   res = a;
                   a = 0;
               }
                if (res == 1){
                    System.out.println(true);
                    break;
                } else {
                    System.out.println(false);
                    break;
                }
            }
        }


    }
}
