class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            while(i !=0 && i<nums.length && nums[i] == nums[i-1]){
                i++;
            }
            if(i<nums.length)
                nums[k++] = nums[i];
        }
        
        return k;
    }
}