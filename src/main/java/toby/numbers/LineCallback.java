package toby.numbers;

/**
 * @Author : Goni of Berlin 
 * @Date   : 2/22/16
 */
public interface LineCallback<T> {
	T doSomethingWithLine(String line, T value);
}
