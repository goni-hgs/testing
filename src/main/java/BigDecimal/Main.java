package BigDecimal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author : Goni of Berlin 
 * @Date   : 12/31/15
 */
public class Main {
	public static void main(String[] args) {
		//이런거 있다 치고
		List<DTO> dtoList = new ArrayList<DTO>();

		Set<String> set = new HashSet<>();
		List<DTO> duplicated = new ArrayList<>();
		for (DTO dto : dtoList) {
			String key = dto.a + dto.b;

			if (set.contains(key)) {
				duplicated.add(dto);
			}

			set.add(key);
		}

		// 중복건은 duplicated에 있음.
	}

	public class DTO{
		private String a;
		private String b;
	}
}
