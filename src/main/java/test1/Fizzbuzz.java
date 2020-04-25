package test1;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 9:23
 */
public class Fizzbuzz {
    public static String printFizzBuzzNum(int count) {
        if (count % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(count);
    }
}
