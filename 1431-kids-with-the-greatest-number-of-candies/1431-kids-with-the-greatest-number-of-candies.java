class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0;
        for(int count:candies)
            max = Math.max(max, count);
        
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            res.add(i, max <= candies[i] + extraCandies);
        }
        
        return res;
    }
}