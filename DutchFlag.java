import java.util.Arrays;

public class DutchFlag {
    public static void main(String[] args) {
    int[] arr={2, 2, 0, 1, 2, 0};
        int[] ans=sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sort(int[] arr){
        int low=0;
        int high=arr.length-1;
        int i=0;
        while(i<=high){
            if(arr[i]==0){
                swap(arr,i,low);
                    low++;
                    i++;
                }

            else if(arr[i]==1){
                i++;
            }
            else{
                swap(arr,i,high);
                    high--;

            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
