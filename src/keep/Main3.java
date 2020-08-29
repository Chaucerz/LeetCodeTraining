package keep;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Chaucer
 * @date 2019-09-07 16:28
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ns = sc.nextLine();
        int n = Integer.parseInt(ns);
        List<String> password = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ss = sc.nextLine();
            password.add(ss);
        }
        String[] upWord = {"A","B","C","D","E","F","G",
                           "H","I","J","K","L","M","N",
                           "O","P","Q","R","S","T","U",
                           "V","W","X","Y","Z"};
        List<String> upList = Arrays.asList(upWord);
        String[] downWord = {"a","b","c","d","e","f","g",
                             "h","i","j","k","l","m","n",
                             "o","p","q","r","s","t","u",
                             "v","w","x","y","z"};
        List<String> downList = Arrays.asList(downWord);

        String[] num = {"1","2","3","4","5","6","7","8","9","0"};
        List<String> numList = Arrays.asList(num);

        for (int i = 0; i < n; i++) {
            if (help(password.get(i), upList, downList, numList)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean help(String str, List<String> upList, List<String> downList, List<String> num) {
        if (str == null || (str != null && str.length() < 8)) {
            return false;
        }
        if (num.contains(str.charAt(0) + "")) {
            return false;
        }
        int fup = 0;
        int fdown = 0;
        int fnum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (upList.contains(str.charAt(i) + "")) {
                fup = 1;
            } else if (downList.contains(str.charAt(i) + "")) {
                fdown = 1;
            } else if (num.contains(str.charAt(i) + "")) {
                fnum = 1;
            } else {
                return false;
            }
        }
        int res = 0;
        if (fup != 0) {
            res++;
        }
        if (fdown != 0) {
            res++;
        }
        if (fnum != 0) {
            res++;
        }
        if (res < 2) {
            return false;
        }
        return true;
    }

}
