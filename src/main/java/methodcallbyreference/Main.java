package methodcallbyreference;

import java.util.Date;

/**
 * @Author : Goni of Berlin 
 * @Date   : 1/5/16
 */
public class Main {
	public static void main(String[] args) {
		String a = "kkk";
		Date b = new Date();
		System.out.println(a);
		System.out.println(b);

		changeValue(a, b);

		System.out.println(a);
		System.out.println(b);
	}

	private static void changeValue(String a, Date b) {
		a = "sss";
		b.setTime(234242424);
	}
}
