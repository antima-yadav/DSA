import java.util.*;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                ans.add(nums1[i]);
                i++;
            } else {
                ans.add(nums2[j]);
                j++;
            }
        }

        while (i < m) {
            ans.add(nums1[i]);
            i++;
        }

        while (j < n) {
            ans.add(nums2[j]);
            j++;
        }

        for (int k = 0; k < ans.size(); k++) {
            nums1[k] = ans.get(k);
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array:");

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
} 