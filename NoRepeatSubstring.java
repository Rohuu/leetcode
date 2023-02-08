// Qus: https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;
import java.util.Set;

public class NoRepeatSubstring {
    public static void main(String[] args) {
        String s = "aabcdefghcbb";
        int ans = longestSubstringWithoutReapeatingCharacter(s);
        System.out.println(ans);
    }

    static int longestSubstringWithoutReapeatingCharacter(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int maxLength = 0;
        for (int j = 0; j < s.length(); j++) {
            if (set.add(s.charAt(j))) {
                maxLength = Math.max(maxLength, j - i + 1);
            } else {
                while (!set.add(s.charAt(j))) {
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return maxLength;
    }
}
