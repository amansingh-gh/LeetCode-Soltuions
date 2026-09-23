class Solution {
    public int mySqrt(int n) {
        if(n<2) return n;
        int ans =-1;
        int st =1, end = n/2;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(mid<=n/mid){
                 st=mid+1; ans =mid;
            }
            else{
             end = mid-1;
            }                
        }
        return ans;
    }
}