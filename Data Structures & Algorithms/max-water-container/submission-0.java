class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
int left = 0;
int right = height.length - 1;

while (left < right) {
    // calculate width
    int width = right - left;
    // calculate limiting height
    int limitingHeight = Math.min(height[left], height[right]);
    // calculate current area
    int currArea = width * limitingHeight;
    // update maxArea

maxArea = Math.max(maxArea, currArea);
    // move shorter pointer
    if(height[left] < height[right]){
left++;}
else{right--;}
}
        return maxArea;
        
    }
}
