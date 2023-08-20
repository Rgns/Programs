/*

347. Top K Frequent Elements

  Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
  Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());
        int[] res = new int[k];
        int i=0;
      
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            heap.add(entry);
            if(heap.size()>k){
                heap.poll();
            }
        }

        while(!heap.isEmpty()){
            res[i++] = heap.poll().getKey();
        }

        return res;
    }
}
