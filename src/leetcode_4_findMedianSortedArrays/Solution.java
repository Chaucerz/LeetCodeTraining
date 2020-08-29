package leetcode_4_findMedianSortedArrays;

/**
 * @author Chaucer
 * @date 2019-09-07 12:40
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int t = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                arr[t++] = nums1[i++];
            } else {
                arr[t++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            arr[t++] = nums1[i++];
        }
        while (j < nums2.length) {
            arr[t++] = nums2[j++];
        }
        double res = 0;
        int mid = arr.length / 2;
        if ((arr.length & 1) == 0) {
            res = (arr[mid] + arr[mid - 1])/ 2.;
        } else {
            res = arr[mid];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        new Solution().findMedianSortedArrays(a, b);
    }
}
