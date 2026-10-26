class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double ms=0,ws=0;
        for(int i=0;i<k;i++){
            ws+=nums[i];
        }
        ms=ws;
        for(int i=k;i<n;i++){
            ws+=nums[i]-nums[i-k];
            ms=Math.max(ms,ws);
        }
        return ms/k;
    }
}