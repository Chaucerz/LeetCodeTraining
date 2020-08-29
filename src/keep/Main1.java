package keep;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-07 15:55
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i)]++;
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > arr1[i]) {
                System.out.println((char)i);
            }
        }
    }
}
