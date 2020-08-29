package kuaishou;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-08-25 18:15
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);

        String res = "";
        int j = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(i / 8 == 0 && i != 0) {
                res += str2.charAt(j);
                j = j + 2;
            }
            res += str1.charAt(i);
        }
    }
}
