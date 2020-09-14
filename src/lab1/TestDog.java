package lab1;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Black", 13);
        Dog d2 = new Dog("Sam");
        Dog d3 = new Dog();

    d2.setAge(1);
    System.out.println(d1);
    d1.ratingAge();
    System.out.println(d2);
    d2.ratingAge();
    System.out.println(d3);
    d3.ratingAge();
}
}
