class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length)
        {
            return nums;
        }
        Map<Integer, Integer> ans= new HashMap<>();
        for(int n:nums)
        {
            ans.put(n, ans.getOrDefault(n,0) +1);
        }
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> ans.get(a)-ans.get(b));
            for(int n:ans.keySet())
            {
                heap.add(n);
                if(heap.size()>k)
                {
                    heap.poll();
                }
            }
            int[] count = new int[k];
            for(int i=0;i<k;i++)
            {
                count[i]=heap.poll();
            }
            return count;
    }
}
