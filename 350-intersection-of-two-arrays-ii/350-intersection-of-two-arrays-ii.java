class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums1){
            map.compute(num, (k,v)-> v == null ? 1:v+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num:nums2){
            if(map.containsKey(num)){
                if(map.get(num) > 0)
                    list.add(num);
                map.put(num, map.get(num) -1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}