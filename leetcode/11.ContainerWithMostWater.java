/* 
11. Container With Most Water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container. */

class Solution {
    public int maxArea(int[] arr) {

        int n = arr.length;
        int l = 0;
        int r = n-1;
        int maxArea =0;

        while(l<r){
            int area = 0;
            int xlen = r-l;
            if(arr[l] < arr[r]){
                area = arr[l] * xlen;
                l++;
            }else{
                area = arr[r] * xlen;
                r--;
            }
            maxArea = Math.max(area,maxArea);

        }

        return maxArea;

        
    }
}
