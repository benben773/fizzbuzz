package test1;

public class FizzBuzz1 {
    public String valueOf(int count) {
        if (count % 5 == 0) {
            return "Buzz";
        }
        if (count % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(count);
    }
}
