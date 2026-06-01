package Week_1.Day_1;

class Two_sum {
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){  // if sum of 2 no.s is equal to target no. then return the numbers
                    return new int[]{i,j};
                }    
            }
        }
    return new int[]{-1,-1}; // if no number is found it returns -1,-1
    }
}
