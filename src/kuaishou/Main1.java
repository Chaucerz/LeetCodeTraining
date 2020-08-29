package kuaishou;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-08-25 16:59
 */
public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        String[][] arr = new String[m][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.next();
            }
        }

        boolean flagA = false;
        boolean flagB = false;
        for (int i = 0; i < arr.length; i++) {
            String a = "";
            for (int j = 0; j < arr[i][0].length(); j++) {
                if(arr[i][0].charAt(j) != '.'){
                    a += arr[i][0].charAt(j);
                } else if (arr[i][0].charAt(j) == '.' && !flagA){
                    a += arr[i][0].charAt(j);
                    flagA = true;
                }
            }
            String b = "";
            for (int j = 0; j < arr[i][1].length(); j++) {
                if(arr[i][1].charAt(j) != '.'){
                    b += arr[i][1].charAt(j);
                } else if (arr[i][1].charAt(j) == '.' && !flagB){
                    b += arr[i][1].charAt(j);
                    flagB = true;
                }
            }
            flagA = false;
            flagB = false;
            float aa = Float.parseFloat(a);
            float bb = Float.parseFloat(b);
            if(aa < bb){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}
