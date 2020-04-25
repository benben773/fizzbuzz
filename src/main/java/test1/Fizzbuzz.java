package test1;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 9:23
 */
public class Fizzbuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public static String printFizzBuzzNum(int count) throws Exception {
        if (count < 1) {
            throw new Exception("can not less than 1");
        }
        if (canDevByANum(count, 3) && (canDevByANum(count, 5))) {
            return FIZZ_BUZZ;
        }
        if (canDevByANum(count, 3)) {
            return FIZZ;
        }
        if (canDevByANum(count, 5)) {
            return BUZZ;
        }
        return String.valueOf(count);
    }

    private static boolean canDevByANum(int count, int i) {
        return count % i == 0;
    }
}
