public class FizzBuzz {
    public String getResponse(int inputValue) {
        if (inputValue % 15 == 0) {
            return "FizzBuzz";
        } else if (inputValue % 3 == 0) {
            return "Fizz";
        } else if (inputValue % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(inputValue);
        }
    }
}
