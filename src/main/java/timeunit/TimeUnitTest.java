package timeunit;

import java.util.concurrent.TimeUnit;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/15/16
 */
public class TimeUnitTest {
	public static void main(String[] args) {
		long timeWait = TimeUnit.SECONDS.toMillis(12L);
		long timeWait2 = 12L;

		System.out.println(String.valueOf(timeWait));
		System.out.println(String.valueOf(timeWait2));
	}
}
