class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = nums.clone();
        Arrays.sort(res);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<res.length;i++){
            map.putIfAbsent(res[i], i);
        }
        
        for(int i=0;i<nums.length;i++){
            res[i] = map.get(nums[i]);
        }
        
        return res; 
        
//         int[] res = new int[nums.length];
        
//         for(int i=0;i<nums.length;i++){
//             int count =0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i] > nums[j])
//                     count++;
//             }
//             res[i] = count;
//         }
        
//         return res; 
    }
}