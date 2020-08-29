package zhaoyin;

import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-15 21:55
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input == null || input.length() < 2) {
            return;
        }
        help(input);
    }

    private static void help(String input) {
        if (input.equals("RL")) {
            System.out.println("1 1");
            return;
        }
        int[] res = new int[input.length()];
        for (int i = 0; i < res.length; i++) {
            res[i] = 1;
        }
        for (int i = 0; i < input.length();i++) {
            if (input.charAt(i) == 'R') {
                helpR(input, i, res);
            } else {
                helpL(input, i, res);
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i != res.length - 1) {
                System.out.print(" ");
            }
        }
    }

    private static void helpR(String input, int i, int[] res) {
        int length = 1;
        for(int j = i + 1; j < input.length();j++) {
            if (input.charAt(j) == 'R') {
                length++;
            } else {
                if (length != 1 && length % 2 == 1) {
                    res[i]--;
                    res[j - 1]++;
                } else if (length % 2 == 0) {
                    res[i]--;
                    res[j]++;
                }
                break;
            }
        }
    }

    private static void helpL(String input, int i, int[] res) {
        int length = 1;
        for(int j = i - 1; j >= 0;j--) {
            if (input.charAt(j) == 'L') {
                length++;
            } else {
                if (length != 1 && length % 2 == 1) {
                    res[i]--;
                    res[j + 1]++;
                } else if (length % 2 == 0) {
                    res[i]--;
                    res[j]++;
                }
                break;
            }
        }
    }
}
