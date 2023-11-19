/**
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the

**/

class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        
        String[] arr = s.split(" ");

        for(int i = arr.length-1;i>=0;i--){

            if(!arr[i].trim().isEmpty()){

                    sb.append(arr[i]);
                    sb.append(" ");

            }
        }


        return sb.toString().trim();



    }
}
