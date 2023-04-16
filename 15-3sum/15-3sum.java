class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int l = i+1;
            int r = nums.length-1;
            
            while(l<r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    res.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                } else if(nums[i] + nums[l] + nums[r] > 0)
                    r--;
                else
                    l++;
            }
        }
        
        return res.stream().collect(Collectors.toList());
    }
}