package FizzBuzz;
import org.junit.Test;         //STEP 1 test code
import static org.junit.Assert.assertEquals;
public class FizzBuzzTest {
    FizzBuzz test = new FizzBuzz(); //arrange
    @Test
    public void shouldSay1For1(){
        assertEquals ("1", test.getResponse(1));} //assert & act
    @Test
    public void shouldSay2for2(){
        assertEquals("2", test.getResponse(2)); }
    @Test
    public void shouldSayFizzFor3(){
        assertEquals("Fizz", test.getResponse(3)); }
    @Test
    public void shouldSayBuzzFor5(){
        assertEquals("Buzz", test.getResponse(5)); }
    @Test
    public void shouldSayFizzFor6(){
        assertEquals("Fizz", test.getResponse(6)); }
    @Test
    public void shouldSayBuzzFor10(){
        assertEquals("Buzz", test.getResponse(10)); }
    @Test
    public void shouldSayFizzBuzzFor15(){
        assertEquals("FizzBuzz", test.getResponse(15)); }
    @Test
    public void shouldSayBANGFor11(){
        assertEquals("BANG", test.getResponse(11)); }
    @Test
    public void output (){
        for (int i = 1; i < 100; i++){
            System.out.println(test.getResponse(i));
        }
    }
}
