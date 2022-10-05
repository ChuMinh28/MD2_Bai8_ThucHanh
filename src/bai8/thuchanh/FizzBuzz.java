package bai8.thuchanh;

public class FizzBuzz {
    public static String FizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean idBuzz = number % 5 == 0;
        if (isFizz && idBuzz)
            return "FizzBuzz";

        if (isFizz)
            return "Fizz";

        if (idBuzz)
            return "Buzz";

        return number+"";
    }
}
