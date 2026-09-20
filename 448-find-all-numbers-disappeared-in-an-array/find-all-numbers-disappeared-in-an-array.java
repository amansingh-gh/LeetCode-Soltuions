class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;
        for(int i=0; i<n; i++){
            int value = Math.abs(arr[i]);

            if(arr[value-1]>0){
                arr[value-1] = -arr[value-1];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans.add(i+1);
            }
        }
            return ans;
    }
}