import java.util.*;

public class ReverseArrayUsingRecursion
{
	public static void main(String[] args) {
	    int[] ans={4,5,7,8,1,2};
	    reverse(ans,0,ans.length-1);
	    for(int i=0;i<ans.length;i++){
	        System.out.print(ans[i]+" ");
	    }
	}
	
	private static void reverse(int[] nums,int start,int end){
	    if(start>end){
	        return;
	    }
	    swap(nums,start,end);
	    reverse(nums,start+1,end-1);
	}
	
	private static void swap(int[] arr, int i, int j){
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
}
