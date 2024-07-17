package Stocks;
//Best time to buy and sell to make max profit = OptimalSolution

public class Stock__1 {
    public static int maximumProfit (int arr[]){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i =0 ;i<arr.length ;i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int maximumPro =  maximumProfit(arr);
        System.out.println("The maximum profit is : " + maximumPro);
    }
}
