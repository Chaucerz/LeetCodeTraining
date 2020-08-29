package liantong;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Chaucer
 * @date 2019-09-29 21:01
 */
public class Solution1 {
    static int word = 0;
    static int alpha = 0;
    static int num = 0;
    static int ch = 0;
    static String text = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = help(str);
        System.out.println(res);
    }

    private static String help(String str) {



        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            }
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                alpha++;
            }
        }

        String reg = "[\\u4e00-\\u9fa5]";
        text = matchResult(Pattern.compile(reg),str);
        ch = str.length() - word - alpha - num;
        String result = "汉字个数:" + word + "," + "字母个数:" + alpha + "," + "数字个数:" + num + ","
                + "其它字符个数:" + ch + "," + "数据中纯文本为:" + text;
        return result;
    }

    private static String matchResult(Pattern p, String str) {
        StringBuilder sb = new StringBuilder();
        Matcher m = p.matcher(str);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount();i++) {
                sb.append(m.group());
                word++;
            }

        }
        return sb.toString();
    }
}
