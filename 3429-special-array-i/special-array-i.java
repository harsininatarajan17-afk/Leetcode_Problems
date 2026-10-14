class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length;
        int a=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]%2==0 && nums[i+1]%2==0){
                a++;
            }
            else if(nums[i]%2!=0 && nums[i+1]%2!=0){
                a++;
            }
            if(a>0){
                return false;
            }
            }
        return true;
        }
    }