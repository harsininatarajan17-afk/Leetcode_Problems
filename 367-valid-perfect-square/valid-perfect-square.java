class Solution {
    public boolean isPerfectSquare(int num) {
        int x=num;
        long i=0;
         while((i+1)*(i+1)<=x){
            i++;
         }
         if(i*i==x){
            return true;
         }
         else return false;
    }
}