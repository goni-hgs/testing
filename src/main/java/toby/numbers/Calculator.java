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
		return lineReadTemplate(path, new LineCallback() {
			@Override
			public Integer doSomethingWithLine(String line, Integer value) {
				return value + Integer.valueOf(line);
			}
		}, 0);
	}

	public Integer calcMultiply(String filePath) throws IOException {
		return lineReadTemplate(filePath, new LineCallback() {
			@Override
			public Integer doSomethingWithLine(String line, Integer value) {
				return value * Integer.valueOf(line);

			}
		}, 1);
	}

	public ＜Ｔ＞　Ｔ lineReadTemplate(String filepath, LineCallback＜Ｔ＞ callback, Ｔ initVal) throws IOException{
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filepath));
			Ｔ res = initVal;
			String line = null;
			while ((line = br.readLine()) != null) {
				res = callback.doSomethingWithLine(line, res);
			}
			return res;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw e;
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
