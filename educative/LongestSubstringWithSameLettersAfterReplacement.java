// Qus: https://leetcode.com/problems/longest-repeating-character-replacement/

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithSameLettersAfterReplacement {
    public static void main(String[] args) {
        String s = "aabccbb";
        System.out.println(longestSubstringAfterReplacement(s, 2));
    }

    static int longestSubstringAfterReplacement(String s, int k) {
        int i = 0;
        int maxRepeatingLetterCount = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            maxRepeatingLetterCount = Math.max(maxRepeatingLetterCount, map.get(s.charAt(j)));

            if ((j - i + 1) - maxRepeatingLetterCount > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);

        }
        return maxLength;
    }
}
