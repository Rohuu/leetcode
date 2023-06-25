//Qus: https://leetcode.com/problems/pascals-triangle/description/

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> res = generate(5);
        System.out.println(res);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.add(1);
                }
                else{
                    int val= ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    list.add(val);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
