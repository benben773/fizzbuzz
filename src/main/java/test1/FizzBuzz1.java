package test1;

public class FizzBuzz1 {
    public String valueOf(int count) {
        if (canDiv(count, 5) && canDiv(count, 3)) {
            return "FizzBuzz";
        }
        if (canDiv(count, 5)) {
            return "Buzz";
        }
        if (canDiv(count, 3) || String.valueOf(count).contains("3")) {
            return "Fizz";
        }
        return String.valueOf(count);
    }

    private boolean canDiv(int count, int i) {
        return count % i == 0;
    }
}
