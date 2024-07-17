package Stocks;
//Best time to buy and sell to make max profit = Bruteforce

public class Stock_1 {
    public static int maxProfit(int arr[]){
        int maxProfit = 0;
        for (int i =0 ; i <arr.length ; i++){
            for(int j = i+1 ; j < arr.length;j++){
                if(arr[j]>arr[i]){
                    maxProfit = Math.max( arr[j]-arr[i],maxProfit);
                }
            }
        }return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 8, 4};
        int maximumPro =  maxProfit(arr);
        System.out.println("The maximum profit is : " + maximumPro);
    }
    
}
