package thread;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/16/16
 */
public class ThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(System.currentTimeMillis());

		Thread.sleep(1000L);

		System.out.println(System.currentTimeMillis());
	}
}
