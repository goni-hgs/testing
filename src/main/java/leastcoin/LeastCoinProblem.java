package leastcoin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/3/16
 */
public class LeastCoinProblem {
	public static void main(String[] args) {
		int price = 27;

		List<Integer> coins = new ArrayList<>();
		coins.add(10);
		coins.add(9);
		coins.add(1);
		Collections.sort(coins);
		Collections.reverse(coins);

		int numberOfCoin = 0;

		int result = calculate(price, coins, numberOfCoin);
		System.out.print(result + "개");

	}

	private static int calculate(int price, List<Integer> coins, int numberOfCoin) {
		if (price == 0) {
			return numberOfCoin;
		}

		for (int i = 0; i < coins.size(); i++) {
			if (price >= coins.get(i)) {
				int[] coinByCases = new int[coins.size() - i];
				for (int j = 0; j < coinByCases.length; j++) {
					coinByCases[j] = calculate(price - coins.get(coins.size() - 1 - j), coins, numberOfCoin + 1);
				}
				return getLeast(coinByCases);
			}
		}

		return calculate(price - coins.get(coins.size() - 1), coins, numberOfCoin + 1);

	}

	private static int getLeast(int... numbersOfCoin) {
		int least = numbersOfCoin[0];
		for (int numberOfCoin : numbersOfCoin) {
			if (least > numberOfCoin) {
				least = numberOfCoin;
			}
		}

		return least;
	}
}
