class KthLargest {

    int k;
    PriorityQueue<Integer> heap;
    
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<>();
        this.k = k;
        for(int num:nums){
            heap.offer(num);
            if(heap.size() >k)
                heap.remove();
        }
        
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size() >k)
            heap.remove();
        
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */