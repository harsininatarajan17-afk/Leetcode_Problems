class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        int start=0;
        for(int e=0;e<n;e++){
            if(e-start>k){
                set.remove(nums[start]);
                start++;
            }
            if(set.contains(nums[e])){
                return true;
            }
            set.add(nums[e]);
        }
        return false;
    }
}