import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagramsInAList(str));
    }

    static ArrayList<ArrayList<String>> groupAnagramsInAList(String[] str) {
        Map<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();
        for (String s : str) {
            HashMap<Character, Integer> fmap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (fmap.containsKey(s.charAt(i))) {
                    fmap.put(s.charAt(i), fmap.get(s.charAt(i)) + 1);
                } else {
                    fmap.put(s.charAt(i), 1);
                }
            }
            if (bmap.containsKey(fmap) == false) {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                bmap.put(fmap, list);
            } else {
                ArrayList<String> list = bmap.get(fmap); // getting value of fmap(which is list in which we have to add
                                                         // that new string) from bmap and then adding string to that
                                                         // found list.
                list.add(s);
            }
        }

        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (ArrayList<String> val : bmap.values()) {
            res.add(val);
        }
        return res;
    }
}
