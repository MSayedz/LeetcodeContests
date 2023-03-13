class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
//         Set<Integer> uniqueNumbers  = new HashSet<>();
//         for(int num:nums){
//             if(!uniqueNumbers.add(num)){
//                 return true;
//             }
//         }
        
//         return false;
    }
}