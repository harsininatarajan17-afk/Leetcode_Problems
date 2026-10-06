class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int a=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            a=a*10+(x%10);
            x/=10;
        }
        if(n==a){
            return true;
        }
        else{
            return false;
        }
    }
}