package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleUsingNCR {
    public static void main(String[] args) {
        List<List<Long>> res = generate(2);
        System.out.println(res);
    }

    public static List<List<Long>> generate(int numRows) {
        System.out.println(factorial(13));
        List<List<Long>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Long> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                long val= (factorial(i)/(factorial(i-j)*factorial(j)));
                list.add(val);
            }
            ans.add(list);
        }
        return ans;
    }

    private static long factorial(int n) {
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
