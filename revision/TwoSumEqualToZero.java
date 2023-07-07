package revision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumEqualToZero {
    public static void main(String[] args) {
        List<Integer> list=List.of(-1,-1,0,1,2,0,-1,-4,0,-2);
        List<List<Integer>> result=findPairs(list);
        System.out.println(result);
    }

    static List<List<Integer>> findPairs(List<Integer> list){
        List<List<Integer>> res= new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)+list.get(j)==0){
                    List<Integer> ans=new ArrayList<>();
                    if(!set.contains(list.get(i))){
                        ans.add(list.get(i));
                        ans.add(list.get(j));
                        res.add(ans);
                    }
                    set.add(list.get(i));
                    set.add(list.get(j));
                }
            }
        }
        return res;
    }
}
