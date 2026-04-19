/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
    public int kthSmallest(TreeNode root, int k) {
        if(maxHeap.size() > k){
            maxHeap.poll();
        }
        if(root != null){
           maxHeap.offer(root.val);
        }
        else{
            return -1;
        }

        kthSmallest(root.left, k);
        kthSmallest(root.right, k);

        return maxHeap.peek();
    }
}
