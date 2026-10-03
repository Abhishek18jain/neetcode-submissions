class Solution {
    public int characterReplacement(String s, int k) {
        int[] frequency = new int[26];

int left = 0;
int maxFrequency = 0;
int maxLength = 0;

for (int right = 0; right < s.length(); right++) {

    // Character enters window
    frequency[s.charAt(right) - 'A']++;

    // Track highest frequency
    maxFrequency = Math.max(
        maxFrequency,
        frequency[s.charAt(right) - 'A']
    );

    // Shrink while invalid
    while (right - left + 1 - maxFrequency > k) {

        frequency[s.charAt(left) - 'A']--;
        left++;
    }

    // Current window is valid
    maxLength = Math.max(
        maxLength,
        right - left + 1
    );
}

return maxLength;
    }
}
