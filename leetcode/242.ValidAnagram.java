/*
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

*/

class Solution {
    public boolean isAnagram(String s, String t) {
        
       if(s.length()!=t.length()) return false;

        int[] response = new int[26];

        for(int i =0;i< s.length();i++){

                response[s.charAt(i) -'a' ]++;
                response[t.charAt(i) -'a' ]--;

        }

        for(int i=0;i< response.length;i++){

            if(response[i] != 0){
                return false;
            }
        }

        return true;

    }
}
