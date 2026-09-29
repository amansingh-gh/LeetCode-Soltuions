class Solution {
    static void solve(int[] candidate, int target, int index, List<List<Integer>> ans, List<Integer> output, int count, int k){
        // Base base;
        if(count>k){
            return;
        }

        if(count==k && target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(target<0) return;
        if(index>=candidate.length) return;

        // Solve 1st case from here
        output.add(candidate[index]);
        // include
        solve(candidate, target-candidate[index], index+1, ans, output, count+1, k);

        // before excluding code we have to remove the last element which i have been added in line number 11.
        output.remove(output.size()-1);
        
        while(index<candidate.length-1 && candidate[index]==candidate[index+1]){
            index++;
        }
        // exclude
        solve(candidate, target, index+1, ans, output, count, k);



    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        
        int index = 0;
        int target = n;
        int count = 0;
        int[] candidates = {1,2,3,4,5,6,7,8,9};
        solve(candidates,target,index,ans,output, count, k);
        return ans;
    }
}