package lab1;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball small = new Ball("Black", 50);
        Ball medium = new Ball("Pink");
        Ball big = new Ball();

        small.setPrice(100);
        System.out.println(small);
        small.newPrice();
        System.out.println(medium);
        medium.newPrice();
        System.out.println(big);
        big.newPrice();
    }
}