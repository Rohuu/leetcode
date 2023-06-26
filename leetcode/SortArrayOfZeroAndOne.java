package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfZeroAndOne {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int num=sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }
        int[] result= sortArray(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] sortArray(int[] arr){
        int[] ans=new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                ans[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    ans[j] = arr[i];
                    j++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==2){
                ans[j]=arr[i];
                j++;
            }
        }
        return ans;
    }
}
