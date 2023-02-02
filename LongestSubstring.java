// Qus: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        int ans = lengthOfLongestSubstring("abcdbefef");
        System.out.println(ans);
    }

    static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.add(s.charAt(right))) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while (s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}