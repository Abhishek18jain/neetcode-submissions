class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> target = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            target.put(ch, target.getOrDefault(ch, 0) + 1);
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            // Add right character
            char ch = s2.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // If window becomes bigger than s1
            if (right - left + 1 > s1.length()) {

                char leftChar = s2.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }

                left++;
            }

            // Check current window
            if (right - left + 1 == s1.length()) {
                if (window.equals(target)) {
                    return true;
                }
            }
        }

        return false;
    }
}