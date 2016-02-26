package toby.numbers;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/18/16
 */
public class CalcSumTest {
	private Calculator calculator;
	private String numFilePath;

	@Before
	public void setUp() {
		this.calculator = new Calculator();
		this.numFilePath = getClass().getResource("numbers.txt").getPath();
	}

	@Test
	public void sumOfNumbers() throws IOException {
		assertThat(calculator.calcSum(numFilePath), is(10));
	}

	@Test
	public void multiplyOfNumbers() throws IOException {
		assertThat(calculator.calcMultiply(numFilePath), is(24));
	}

	@Test
	public void concatenateStrings() throws IOException {
		assertThat(calculator.concatenate(this.numFilePath), is("1234"));
	}
}
