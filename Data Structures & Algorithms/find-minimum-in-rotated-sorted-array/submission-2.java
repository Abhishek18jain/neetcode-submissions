class Solution {
    public int findMin(int[] array) {
    
        int start = 0; int end =  array.length-1; 
        while(start<end){
            int mid = start + (end - start)/2;
            if(array[mid] > array[end]){
                start = mid +1;
            }else{
                
                end = mid;
            }
        }
        return array[start];


    }
}
