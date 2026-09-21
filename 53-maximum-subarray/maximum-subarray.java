class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
//            step1: Iterate over the array
            sum += nums[i];
//            step2: Find the max element
            maxi = Math.max(sum,maxi);
//            step3: check the sum is not less than 0
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}