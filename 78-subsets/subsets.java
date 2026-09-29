class Solution {
    public void solve(int[] nums, int idx, List<Integer>output, List<List<Integer>>ans){
        // Base case
        if(idx>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        int currentValue = nums[idx];
        // include
        output.add(currentValue);
        solve(nums,idx+1,output,ans);
        // Backtrack
        output.remove(output.size()-1);

        // exclude
        solve(nums,idx+1,output,ans);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int idx = 0;
        solve(nums,idx,output,ans);
        return ans;
    }
}