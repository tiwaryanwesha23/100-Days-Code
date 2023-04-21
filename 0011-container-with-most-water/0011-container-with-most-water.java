class Solution {
    public int maxArea(int[] height) {
        int area = 0, i = 0, j = height.length - 1;
        
        while (i < j) {
            int temp = Math.min(height[i], height[j]) * (j - i);
            area = Math.max(area, temp);
            
            if (height[i] > height[j]) {
                j--;
            }
            else {
                i++;
            }
        }
        return area;
    }
}