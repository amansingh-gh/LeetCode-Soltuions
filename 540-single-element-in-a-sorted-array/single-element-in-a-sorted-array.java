class Solution {
    public int singleNonDuplicate(int[] arr) {
     int st=0;
        int n = arr.length;
        int end = n-1;

        while(st<=end){
            int mid = st+(end-st)/2;
//            handle single element in array case
            if(st==end){
                return arr[st];
            }
            int currentValue = arr[mid];
            int prevValue = -1;

            if(mid-1>=0){
                prevValue = arr[mid-1];
            }

            int nextValue=-1;
            if(mid+1<n){
                nextValue=arr[mid+1];
            }

            if(currentValue != prevValue && currentValue !=nextValue){
                return currentValue;
            }

            if(currentValue != prevValue && currentValue == nextValue){
                int startingIndexPair = mid;
                if((startingIndexPair & 1)==1){
                    end = mid-1;
                }else {
                    st = mid+1;
                }
            } else if (currentValue == prevValue && currentValue!=nextValue) {
                int endingIndexPair = mid;
                if((endingIndexPair & 1)==1){
                    st = mid+1;
                }else {
                    end= mid-1;
                }
            }
        }
        return -1;
    }
}