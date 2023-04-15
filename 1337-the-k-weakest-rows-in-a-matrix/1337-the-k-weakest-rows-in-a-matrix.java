class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    j = mat[0].length;
                } else{
                    count++;
                }
            }
            System.out.println(i +" "+ count);
            map.put(i,count);
        }
        
        map.values().stream().forEach(System.out::println);
        
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue()==a.getValue() ? b.getKey()-a.getKey(): b.getValue()-a.getValue());
        
        maxHeap.addAll(map.entrySet());
        
        System.out.println("---------" + maxHeap.size());
        
        maxHeap.stream().map(c->c.getValue()).forEach(System.out::println);
        
        while(maxHeap.size()>k)
            maxHeap.poll();
        System.out.println("---------" + maxHeap.size());
        
        
        maxHeap.stream().map(c->c.getValue()).forEach(System.out::println);
        int[] res = new int[k];
        for(int i=k-1;i>-1;i--)
            res[i] = maxHeap.poll().getKey();
        
        return res;
    }
}