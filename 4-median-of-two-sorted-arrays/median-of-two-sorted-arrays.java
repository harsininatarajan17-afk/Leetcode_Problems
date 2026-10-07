import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length+nums2.length];
        int i=0;
        for(int j=0;j<nums1.length;j++){
            a[i]=nums1[j];
            i++;
        }
        for(int k=0;k<nums2.length;k++){
            a[i]=nums2[k];
            i++;
        }
        Arrays.sort(a);
        int b=a.length;
        if(a.length%2==0){
            return (a[b/2-1]+a[b/2])/2.0;
        }
        else{
            return a[b/2];
        }
    }
}