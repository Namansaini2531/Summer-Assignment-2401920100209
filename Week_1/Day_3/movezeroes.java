class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;     // l left pointer
        for(int r = 0; r<nums.length; r++) // r is right pointer
        {
            if(nums[r] != 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;  // increament the left pointer
            }
        }
    return;
    }
}
