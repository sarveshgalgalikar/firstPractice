package challenges.classics;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args){
        int[] nums1 = {4,4,6,3,2};
        int m = 5;
        int[] nums2 = {2,9};
        int n = 2;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m == 0)  {
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
            Arrays.sort(nums1);
            System.out.println(Arrays.toString(nums2));
        }
        else {
            int[] final_arr = new int[m+n];
            System.out.println("Length of final_array: " + final_arr.length);

            for(int i = 0; i < m; i++){
                final_arr[i] = nums1[i];
            }
            for(int i = 0; i < n; i++){
                final_arr[final_arr.length - n + i] = nums2[i];
            }
            Arrays.sort(final_arr);

            System.out.println(Arrays.toString(final_arr));
        }
    }
}
