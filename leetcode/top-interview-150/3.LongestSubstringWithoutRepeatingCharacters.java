
/**
  Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

  **/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();
        if(len<=1){
            return len;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        int start =0;
        int maxLen =0;

        for(int end=0; end <len;end++){

            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                    start = Math.max(start,map.get(ch) +1);
            }
            map.put(ch,end);
            maxLen = Math.max(maxLen, end-start+1);

        }

        return maxLen;


    }
}
