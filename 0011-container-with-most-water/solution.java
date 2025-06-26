class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = Math.min(height[left], height[right]) * (right - left);
        while (left < right){
            int res = Math.min(height[left], height[right]) * (right - left);
            area = (res > area)? res : area;
            if (height[left] < height[right]) left++; 
            else right--;
        }
        return area;
    }
}
