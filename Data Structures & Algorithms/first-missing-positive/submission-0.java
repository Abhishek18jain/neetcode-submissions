class Solution {
    public int firstMissingPositive(int[] arr) {
        // Arrays.sort(nums);
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] >0 && arr[i] <= arr.length && arr[i] != arr[correctIndex] ){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        for(int j =0;j<arr.length;j++){
          
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
}