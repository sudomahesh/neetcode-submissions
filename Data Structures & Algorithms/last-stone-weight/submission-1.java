class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue(Collections.reverseOrder());

        for(int weight : stones){
            heap.offer(weight);
        }
        heap.offer(0);

        while(heap.size() > 1){
            int x = heap.poll();
            int y = heap.poll();

            if(x > y) heap.offer(x - y);
        }

        return heap.peek();
    }
}
