class Solution {
    public int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

for (int i = 0; i < array.length; i++) {
    min = Math.min(min, array[i]);
}

return min;
    }
}
