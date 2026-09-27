class Solution {

     static int BS(int[] arr, int target, int st, int end){
        if(st>end){
            return -1;
        }
        int mid = st+(end-st)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target) {
            end = mid - 1;
        }else {
            st = mid+1;
        }
        return BS(arr,target,st,end);
    }


    public int search(int[] arr, int target) {
        int st = 0;
        int end = arr.length-1;
        int res = BS(arr,target,st,end);
        return res;
    }
}