package mkdir;

import java.io.File;

/**
 * @Author : Goni of Berlin 
 * @Date   : 1/29/16
 */
public class DirectoryMaker {
	public static void main(String[] args) {
		File file = new File("/Users/coupang/a/b/c/");

		if (!file.exists()) {
			file.mkdirs();
		}

	}
}
