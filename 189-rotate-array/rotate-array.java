class Solution {
    static void reverse(int[] arr, int i, int j) {
        while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++; j--;
        }
    }

    static void rotate(int[] arr, int r) {
        int n = arr.length-1;
        r = r%arr.length;
//        reverse entire array
        reverse(arr, 0, n);
//        reverse k element
        reverse(arr, 0, r-1);
//        reverse n-k element
        reverse(arr,r, n);
    }
}