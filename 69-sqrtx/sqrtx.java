class Solution {
    public int mySqrt(int x) {
         long i=0;
         while((i+1)*(i+1)<=x){
            i++;
         }
         int r=(int)i;
         return r;
    }
}