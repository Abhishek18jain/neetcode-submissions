

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        // Empty prefix before the array
        map.put(0, 1);

        for (int num : nums) {

            // 1. Update current prefix sum
            prefixSum += num;

            // 2. Find the previous prefix we need
            int needed = prefixSum - k;

            // 3. Count how many times that prefix appeared
            count += map.getOrDefault(needed, 0);

            // 4. Store/update current prefix frequency
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}