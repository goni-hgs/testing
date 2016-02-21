package toby.numbers;

/**
 * Created by j on 2016-02-21.
 */
public interface LineCallback＜Ｔ＞ {
    Ｔ doSomethingWithLine(String line, Ｔ value);
}
