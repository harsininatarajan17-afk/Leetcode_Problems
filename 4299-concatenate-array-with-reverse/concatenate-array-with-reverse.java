class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        int j=0;
        for(int i=(2*n)-1;i>=n;i--){
            ans[i]=nums[j];
            j++;
        }
        return ans;
    }
}