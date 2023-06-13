class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums)
            .distinct()
            .sorted()
            .boxed()
            .collect(Collectors.toList());
        
        return numsList.size() < 3
            ? numsList.get(numsList.size()-1) 
            : numsList.get(numsList.size()-3);
    }
}