/*
Smallest Positive missing number.
You are given an array arr[] of N integers. The task is to find the smallest positive number missing from the array.

Note: Positive number starts from 1.


*/


class Solution
{
  
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        for(int i=0;i<n;i++){       
            int correctIndex = arr[i]-1;
            while(correctIndex >= 0 && correctIndex < n && arr[correctIndex] != arr[i]){
                swap(arr, correctIndex, i);
                correctIndex = arr[i]-1;
            }
        }
        
         for(int i=0;i<n;i++){
             if(arr[i]-1 != i) return i+1;
         }
        return n+1;
        
    }
  
    
    static void swap(int[] arr, int i, int j){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
