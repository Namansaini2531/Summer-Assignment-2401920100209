class Solution {
    public int maxArea(int[] height) {
        int l = 0; // left pointer
        int r = height.length - 1;
        int maxWater = 0;

        while(l<r){
            int minHeight = Math.min(height[l], height[r]);
            int width = r - l;
            int area = minHeight*width;

            maxWater = Math.max(maxWater, area);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            } 
        }
        return maxWater;
    }
}
