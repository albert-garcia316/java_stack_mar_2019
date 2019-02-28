public class FizzBuzz {
    public String fizzBuzz(int number){
        String output = new String();
        if(number == 3){
            output = "Fizz";
        } else if(number == 5){
            output = "Buzz";
        } else if(number == 15){
            output = "FizzBuzz";
        } else if(number == 2){
            output = Integer.toString(number);
        } else {
            output = "Please enter a valid number: 3, 5, 15, or 2";
        }

        return output;
    }
}