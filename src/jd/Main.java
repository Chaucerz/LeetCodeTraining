package jd;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-08-24 19:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        int i = 0;
        int j = i + 1;
        while (i < j) {
            if (arr[i] > arr[j]){
                if (arr[j] > arr[j + 1] && j + 1 < arr.length) {
                    count++;
                    i++;
                    j++;
                }
                if (arr[j] <= arr[j + 1] && j + 1 < arr.length) {
                    i++;
                    j++;
                }
            }
            if (arr[i] <= arr[j]) {

                if (arr[j] < arr[j + 1] && j + 1 < arr.length) {
                    count++;
                    i++;
                    j++;
                }
                if (arr[j] >= arr[j + 1] && j + 1 < arr.length) {
                    i++;
                    j++;
                }
            }
        }

        System.out.println(count);

    }
}
