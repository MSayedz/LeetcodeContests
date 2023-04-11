class Solution {
    public boolean canJump(int[] nums) {
       int max=0;
       for(int i=0;i<nums.length;i++){
           if(max<i) {
               return false;
           }
           if(nums[i]+i > max){
               max = nums[i]+i;
           }
       }
       return true;
        // return canJump(nums,0, new int[nums.length]);
    }
    
    private boolean canJump(int[] nums, int i,int[] memo){
        if(i == nums.length -1)
            return true;
        
        if (memo[i] != 0) {
            return memo[i] == 1 ? true : false;
        }
        
        int max = Math.min(i + nums[i], nums.length - 1);
        
        for (int j = i + 1; j <= max; j++) {
            if (canJump(nums, j, memo)) {
                memo[i] = 1;
                return true;
            }
        }
        memo[i] = -1;
        return false;
    }
}