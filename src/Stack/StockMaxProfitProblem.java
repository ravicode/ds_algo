package Stack;

/*
 Stock problem/ Given an array �arr� find maximum difference 

 between two elements (max(arr[i]-arr[j]) where i>=j).*/

// Given stock prices in an array. Find the buying and selling time so that profit earned is maximum.

public class StockMaxProfitProblem {

	public static void main(String[] args) {
		int price[] = { 100, 80, 120, 130, 70, 60, 100, 125 };
		TotalProfitwithManyTransactions(price);
		MaximumProfitwithOnly1Transaction(price);
	}

	private static void MaximumProfitwithOnly1Transaction(int[] price) {

		int buy = 0;
		int sell = 0;
		int profit = 0;
		int maxProfit = 0;
		for (int i = 0; i < price.length - 1; i++) {
			for (int j = i + 1; j < price.length; j++) {
				if (price[j] > price[i]) {
					profit = price[j] - price[i];
					if (profit > maxProfit) {
						maxProfit = profit;
						sell = j;
						buy = i;
					}

				}

			}
		}
		System.out.println("buy with " + price[buy] + " and sell with "
				+ price[sell]);
	}

	private static void TotalProfitwithManyTransactions(int[] price) {
		int totalprofit = 0;
		for (int i = 1; i < price.length; i++) {
			int profit = price[i] - price[i - 1];
			if (profit > 0)
				totalprofit += profit;

		}

		System.out.println("Total profit by consecutive buy and sell="
				+ totalprofit);
	}
}
