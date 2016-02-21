package maptostring;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : Goni of Berlin 
 * @Date   : 1/6/16
 */
public class MapToString {
	public static void main(String[] argw) {
		Map<String, String> map = new HashMap<>();

		map.put("a", "a");
		map.put("b", "b");

		System.out.print(map);
	}
}
