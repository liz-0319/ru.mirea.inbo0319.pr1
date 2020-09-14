package lab1;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book a = new Book("Lady", 50);
        Book b = new Book("Games");
        Book c = new Book();

        b.setPages(900);
        System.out.println(a);
        a.bookWeight();
        System.out.println(b);
        b.bookWeight();
        System.out.println(c);
        c.bookWeight();
    }
}