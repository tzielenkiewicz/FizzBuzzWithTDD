public class FizzBuzz {
    public String process(int number) {
        if (number % 3 == 0 && number % 5 == 0) return "FizzBuzz";

        else if (number % 5 == 0) return "Buzz";
        else if (number % 3 == 0) return "Fizz";
        return String.valueOf(number);
    }
}
