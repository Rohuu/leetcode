package codeforces;

import java.util.Scanner;

public class LuoTianyiPalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 0; i <num ; i++) {
           String input=sc.next();
            int ans=findLongestSubsequence(input);
            System.out.println(ans);
        }
    }
    private static int findLongestSubsequence(String str){
        if(allCharEquals(str)){
            return -1;
        }
        else{
            return str.length()-1;
        }
    }

    private static boolean allCharEquals(String s) {
        char pivot=s.charAt(0);
        boolean flag=true;
        for (int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i)!=pivot){
                flag=false;
                break;
            }
        }
        if(flag==false){
            return false;
        }
        return true;
    }
}
