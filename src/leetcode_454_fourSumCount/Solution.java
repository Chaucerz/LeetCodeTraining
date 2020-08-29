package leetcode_454_fourSumCount;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chaucer
 * @date 2019-08-26 13:21
 */
public class Solution {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                    count += map.getOrDefault(-sum, 0);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        int i = new Solution().fourSumCount(c,d,a,b);
        System.out.println(i);
    }
}
