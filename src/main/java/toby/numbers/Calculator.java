package toby.numbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/18/16
 */
public class Calculator {

	public int calcSum(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		Integer sum = 0;
		String line = null;
		while ((line = br.readLine()) != null) {
			sum += Integer.valueOf(line);
		}

		return 0;
	}
}
