package xiaomi;

/**
 * @author Chaucer
 * @date 2019-09-11 19:47
 */
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        statisticSubStr(input);
    }

    public static void statisticSubStr(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chs = s.toCharArray();
        int i = 0;
        int j = 1;
        int count = 0;
        while (i < chs.length && j < chs.length) {
            if (chs[i] == chs[j]) {
                j++;
            } else if (chs[i] != chs[j] && j - i == 1) {
                i = j;
                j = i + 1;
            } else {
                count = j - i;
                map.put(chs[i], count);
                i = j;
                j = i + 1;
                count = 0;
            }
        }
        if (j - i > 1) {
            map.put(chs[i], map.getOrDefault(chs[i],0) + j - i);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.size());
        list.addAll(map.entrySet());

        // 对value进行排序
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();        // 降序
            }
        });
        for (Map.Entry<Character, Integer> entry : list) {
            // 得到value排序后对应的key
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
    }
}
