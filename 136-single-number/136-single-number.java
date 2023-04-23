class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int num:nums){
            if(!set.add(num))
                set.remove(num);
        }
        if(set.size() == 1)
            for(int num:set)
                return num;
        
        return -1; 
    }
}