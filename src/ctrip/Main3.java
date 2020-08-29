package ctrip;

import java.util.*;

/**
 * @author Chaucer
 * @date 2019-09-04 20:25
 */
public class Main3 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int size  = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        int res = schedule(m,array);
        System.out.println(String.valueOf(res));
    }

    private static int schedule(int m, int[] array) {
        int sum = 0;
        for (int i = 0 ; i < array.length; i++) {
            sum += array[i];
        }
        int a = sum / (m - 1);
        return  0;
    }
}
