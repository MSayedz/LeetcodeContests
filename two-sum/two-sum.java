class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {i, map.get(target-nums[i])};
            }
            map.putIfAbsent(nums[i], i);
        }

        return new int[2];

        // Map<Integer, Integer> map = new HashMap<>();
        // return IntStream.range(0, nums.length)
        //     .filter(i -> {
        //         if(map.containsKey(nums[i])) return true;
        //         map.put(target - nums[i], i);
        //         return false;
        //     })
        //     .mapToObj(i -> new int[] {map.get(nums[i]), i})
        //     .findFirst()
        //     .orElse(new int[2]);

    }
}