class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int l = 0;  // left pointer
        int r = n - 1; // right pointer
        int h = n - 1;
        
        while(l <= r){
            int leftSquare = nums[l] * nums[l];
            int rightSquare = nums[r] * nums[r];
            
            if(leftSquare > rightSquare) {
                result[h] = leftSquare;
                l++; // Moves left pointer inwards
            } 
            else{
                result[h] = rightSquare;
                r--; // Moves right pointer inwards
            }
            p--;
        }
        return result;
    }
}
