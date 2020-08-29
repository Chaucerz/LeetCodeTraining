package weibo;

/**
 * @author Chaucer
 * @date 2019-08-31 16:56
 */
public class Solution1 {

    public String getMinVersion(String[] list) {
        // 在这里编写代码
        if (list != null && list.length == 1) {
            return list[0];
        }

        if (list != null && list.length == 2) {
            if (comapreIosVersion(list[0],list[1])) {
                return list[1];
            } else {
                return list[0];
            }
        }

        if(list != null && list.length != 0) {
            String res = list[0];
            for (int i = 1; i < list.length - 1; i++) {
                if(comapreIosVersion(res,list[i+1])){
                    res = list[i+1];
                }
            }
            return res;
        } else {
            return null;
        }
    }

    private boolean comapreIosVersion(String s1, String s2) {
        if (s1.compareTo(s2) >= 0) {
            return true;
        }
        return false;
    }

}
