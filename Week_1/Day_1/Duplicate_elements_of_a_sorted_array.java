package Week_1.Day_1;

public class Duplicate_elements_of_a_sorted_array {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }    
    return k;       
    }
}