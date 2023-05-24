package revision;


public class Rev_PairTargetSumSortedArray {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6,7};
        int sum=88;
        int ans=Countpair(a,sum);
        System.out.println(ans);
    }

    static int Countpair(int a[], int sum)
    {
        int first=0;
        int last=a.length-1;
        int count=0;
        while(first<last){
            if(sum<a[first]+a[last]){
                last--;
            }
            else if(sum>a[first]+a[last]){
                first++;
            }
            else{
                count++;
                first++;
                last--;
            }
        }
        if(count==0){
            return -1;
        }
        return count;
    }
}
