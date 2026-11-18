
class Solution {
    public String longestCommonPrefix(String[] strs) {

        String ans = "";

        for (int i = 0; i < strs[0].length(); i++) {

            boolean match = true;

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length()) {
                    match = false;
                    break;
                }

                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    match = false;
                    break;
                }
            }

            if (!match) {
                break;
            }

            ans += strs[0].charAt(i);
        }

        return ans;
    }
}
