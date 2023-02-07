// Qus: https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctCharacters {
    public static void main(String[] args) {
        int ans = longestSubstring("aabacebebebe", 1);
        System.out.println(ans);
    }

    static int longestSubstring(String s, int k) {
        int i = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            while (map.size() > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}
