//Qus: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

package leetcode;

public class BestTimeToBuySellStock {

    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int ans=maxProfit(arr);
        System.out.println(ans);
    }
    static int maxProfit(int[] prices) {
        int min=prices[0];
        int maxPro=0;
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            maxPro=Math.max(maxPro, prices[i]-min);
        }
        return maxPro;
    }
}
