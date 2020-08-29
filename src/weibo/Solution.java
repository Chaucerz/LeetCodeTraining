package weibo;


/**
 * @author Chaucer
 * @date 2019-08-31 16:33
 */
public class Solution {
    public String getMinVersion(String[] list) {
        // 在这里编写代码
        return merge(list, 0, list.length - 1);
    }

    private String merge(String[] list, int start, int end) {
        if (start >= end) {
            return list[start];
        }
        int mid = start + (end - start) / 2;
        String l = merge(list, start, mid);
        String r = merge(list, mid + 1, end);
        return compare(l,r);
    }

    private String compare(String l, String r) {

        String[] lArr = l.split(".");
        String[] rArr = r.split(".");

        int i = 0;
        int j = 0;
        String min = l;
        while (i < lArr.length && j < rArr.length) {
            if (Integer.parseInt(lArr[i]) < Integer.parseInt(rArr[i])) {
                min = l;
            } else if(Integer.parseInt(lArr[i]) == Integer.parseInt(rArr[j])) {
                i++;
                j++;
            }else {
                min = r;
            }
        }
        return min;
    }

}
