package liantong;

import java.util.*;

/**
 * @author Chaucer
 * @date 2019-09-29 20:26
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = help(str);
        String r = res.substring(0, res.length() - 1);
        System.out.println(r);

    }

    private static String help(String str) {
        String[] nums = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length(); j++) {
                if (nums[i].charAt(j) == ':') {
                    int score = Integer.parseInt(nums[i].substring(j + 1));
                    map.put(nums[i], score);
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int compare = (o1.getValue()).compareTo(o2.getValue());
                return -compare;
            }
        });

        Map<String, Integer> res = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            res.put(entry.getKey(), entry.getValue());
        }
        String r = "";
        for (Map.Entry<String, Integer> entry : res.entrySet()) {
            r += entry.getKey() + " ";
        }
        return r;
    }

}
