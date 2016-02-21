package testPolimorphism;

/**
 * @Author : Goni in Rothschild 
 * @Date   : 4/29/15
 */
public class Main {
	public static void main(String[] args) {

		BaseDTO baseDTO = new BaseDTO();
		ADTO adto = new ADTO();
		BDTO bdto = new BDTO();
		CDTO cdto = new CDTO();

		test(baseDTO);
		test(adto);
		test(bdto);
		test(cdto);
	}

	private static void test(BaseDTO baseDTO) {
		if (baseDTO instanceof ADTO) {
			objectTest((ADTO)baseDTO);
			return;
		}
		objectTest(baseDTO);
	}

	private static void objectTest(BaseDTO baseDTO) {
		System.out.println("base dto");
	}

	private static void objectTest(ADTO baseDTO) {
		System.out.println("a dto");
	}

	private static void objectTest(BDTO baseDTO) {
		System.out.println("b dto");
	}

	private static void objectTest(CDTO baseDTO) {
		System.out.println("c dto");
	}
}
