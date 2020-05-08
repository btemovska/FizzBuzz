package FizzBuzz;
import java.util.Scanner;
public class FizzBuzzApp {      //STEP 2 user interface
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        FizzBuzz fizBuzzObject = new FizzBuzz();

        System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.println(fizBuzzObject.getResponse(number));

        input.close();
    }
}
