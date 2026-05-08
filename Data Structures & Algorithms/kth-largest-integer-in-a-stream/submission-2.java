class KthLargest {
    PriorityQueue<Integer> pq;
    int capacity;

    public KthLargest(int k, int[] nums) {
        this.capacity = k;
        this.pq = new PriorityQueue();

        for(int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        pq.offer(val);

        if(pq.size() > capacity) pq.poll();

        return pq.peek();
    }
}
