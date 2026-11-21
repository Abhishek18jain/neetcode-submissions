class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i =0;i<nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // Step 2: Check frequencies
        }
         for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                result.add(key);
            }
        }


        return result;
    }
}