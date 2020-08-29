package vivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-22 16:25
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int tmp = 1;
        int x = 0;
        int index = 0;
        while (list.size() > 0) {
            if (index < list.size() && tmp % m == 0) {
                System.out.print(list.get(index));
                x++;
                if (x != 0) {
                    System.out.print(" ");
                }
                list.remove(index);
                tmp++;
            } else if (index < list.size() && tmp % m != 0) {
                tmp++;
                index++;
            } else if (index >= list.size()) {
                index = 0;
            }
        }
    }
}
