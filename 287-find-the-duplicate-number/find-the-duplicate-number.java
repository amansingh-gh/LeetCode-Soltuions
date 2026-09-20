class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i: nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int x: freq.keySet()){
            if(freq.get(x)>1){
            return x;
            }
        }
        return -1;
    }
}