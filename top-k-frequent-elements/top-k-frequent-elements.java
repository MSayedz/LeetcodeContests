class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0) +1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        
        heap.addAll(map.entrySet());
        
        while(heap.size() >k){
            heap.poll();
        }
        
        int[] res = new int[k];
        for(int i=0;i<res.length;i++){
            res[i] = heap.poll().getKey();
        }
        
        return res;
    }
}