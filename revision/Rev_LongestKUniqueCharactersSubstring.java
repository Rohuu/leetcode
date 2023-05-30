package revision;

import java.util.HashMap;
import java.util.Map;

public class Rev_LongestKUniqueCharactersSubstring {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k=3;
        int ans= longestKSubstring(s,k);
        System.out.println(ans);
    }

    static int longestKSubstring(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int winStart=0;
        int winEnd=0;
        int maxLength=0;
        int length=0;

        for(winEnd=0;winEnd<s.length();winEnd++){
            char rightChar=s.charAt(winEnd);

            if(map.containsKey(rightChar)){
                map.put(rightChar,map.get(rightChar)+1);
            }
            else{
                map.put(rightChar,1);
            }

            while(map.size()>k){
                char leftChar=s.charAt(winStart);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0){
                    map.remove(leftChar);
                }
                winStart++;
            }
            length=winEnd-winStart+1;
            maxLength=Math.max(length,maxLength);
        }
        if(map.size()<k){
            return -1;
        }
        return maxLength;
    }
}
