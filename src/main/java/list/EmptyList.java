package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/18/16
 */
public class EmptyList {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();

		if (integers.get(0) == null) {
			System.out.print("빈 리스트에서 get(0)이 가능합니다. 리턴값은 null");
		}
	}

}
