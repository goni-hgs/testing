package toby.numbers;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/21/16
 */
public interface BufferedReaderCallback {
	Integer doSomethingWithReader(BufferedReader br) throws IOException;
}
