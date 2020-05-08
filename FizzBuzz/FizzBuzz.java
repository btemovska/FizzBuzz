package FizzBuzz;
public class FizzBuzz {             //STEP 2 production code
    public String getResponse(int number) {
        if((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";}
        if(number % 3 == 0) {
            return "Fizz";}
        if(number % 5 == 0) {
            return "Buzz";}
        if(number % 11 == 0) {
            return "BANG";}
    return String.valueOf(number);
        //converts the return from integer to a String
    }
}
