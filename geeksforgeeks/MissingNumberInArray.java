/*
Missing number in array
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

*/



// User function Template for Java

class Solution {
    int missingNumber(int arr[], int n) {
       
     int sum = 0;
     int total = (n*(n+1))/2;
     for(int data : arr){
         
         sum += data;
     }
     

        return total-sum;
     
       
       
    }
}
