class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            if(count == 0){
                candidate = nums[i];
                count++;
            }
            else if(candidate == nums[i]){
                count++;
            }
            else if(count > nums.length/2){
                return candidate;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}