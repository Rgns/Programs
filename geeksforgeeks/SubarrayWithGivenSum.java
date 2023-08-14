/*
Subarray with given sum
Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.

Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.

*/



class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
       
       ArrayList<Integer> res = new ArrayList<Integer>();
       
       if(s==0){
           res.add(-1);
           return res;
       }
       
       int start=0;
       int end =0;
       int sum = 0;
       
       while(end < n){
           
           if(sum + arr[end] <= s){
               
               sum += arr[end++];
           }else{
               
              sum -= arr[start++];
               
           }    
           if(sum==s){
               res.add(start+1);
               res.add(end);
               return res;   
           }   
       }     
        res.add(-1);
        return res;
    }
}
