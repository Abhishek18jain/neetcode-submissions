class Solution {
    public int lengthOfLongestSubstring(String s) {

int start = 0;
int maxLength = 0;
 HashSet<Character> data = new HashSet<>();
// Hashset<Character> data  = new Hashset<>();
for(int end =0; end<s.length();end++){
    char ch = s.charAt(end);
    while(data.contains(ch)){
        data.remove(s.charAt(start));
        start++;
    }
    data.add(ch);
    maxLength = Math.max(maxLength, end-start+1);
}
return maxLength;
        
    }
}
