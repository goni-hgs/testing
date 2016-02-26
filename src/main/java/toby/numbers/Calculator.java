package toby.numbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/18/16
 */
public class Calculator {

	public int calcSum(String filepath) throws IOException {
		return lineReadTemplate(filepath, new LineCallback<Integer>() {
			@Override
			public Integer doSomethingWithLine(String line, Integer value) {
				return value + Integer.valueOf(line);
			}
		}, 0);
	}

	public int calcMultiply(String filepath) throws IOException {
		return lineReadTemplate(filepath, new LineCallback<Integer>() {
			@Override
			public Integer doSomethingWithLine(String line, Integer value) {
				return value * Integer.valueOf(line);
			}
		}, 1);
	}

	public String concatenate(String filepath) throws IOException {
		return lineReadTemplate(filepath, new LineCallback<String>(){
			@Override
			public String doSomethingWithLine(String line, String value) {
				return value + line;
			}
		}, "");
	}

	public <T> T lineReadTemplate(String filepath, LineCallback<T> callback, T initVal) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filepath));
			T res = initVal;
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
