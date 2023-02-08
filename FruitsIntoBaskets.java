// Qus: https://leetcode.com/problems/fruit-into-baskets/description/

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {
    public static void main(String[] args) {
        char[] ch = { 'A', 'B', 'C', 'B', 'B', 'C' };
        int ans = maximumFruitsInBaskets(ch);
        System.out.println(ans);
    }

    static int maximumFruitsInBaskets(char[] ch) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int maxLength = 0;
        for (int j = 0; j < ch.length; j++) {
            map.put(ch[j], map.getOrDefault(ch[j], 0) + 1); // increasing window size
            while (map.size() > 2) {
                map.put(ch[i], map.get(ch[i]) - 1);
                if (map.get(ch[i]) == 0) {
                    map.remove(ch[i]);
                }
                i++; // shrinking window until only 2 chars are their in window
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    }
}
