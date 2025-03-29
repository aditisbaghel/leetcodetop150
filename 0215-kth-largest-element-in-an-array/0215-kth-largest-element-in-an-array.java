class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res = 0;
        for(int i: nums){
            pq.add(i);
            System.out.println(i);
        }
       for(int i=nums.length;i>k;i--){
        pq.remove();
       }
       res=pq.peek();
        return res;
    }
}