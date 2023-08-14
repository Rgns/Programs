/*

Count pairs with given sum

Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

  */



//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        
        for(int data : arr){
            
            if(map.containsKey(k-data)){
                count += map.get(k-data);
            }
            
            map.put(data, map.getOrDefault(data,0)+1);
            
        }
        
        return count;
        
    }
}
