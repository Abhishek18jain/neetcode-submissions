class Solution {
    public int search(int[] nums, int target) {
        int start =0; int end = nums.length-1;
       
        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {

                // Target lies inside left sorted half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } 
                // Target lies in right half
                else {
                    start = mid + 1;
                }

            }

            // Right half is sorted
            else {

                // Target lies inside right sorted half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } 
                // Target lies in left half
                else {
                    end = mid - 1;
                }
            }
        }
        return-1;
    }
}
