package lab1;
import java.lang.*;
public class Book {
    private String name;
    private int pages;
    public Book(String n, int p) {
        name = n;
        pages = p;
    }
    public Book(String n) {
        name = n;
        pages = 600;
    }
    public Book() {
        name = "War";
        pages = 10000;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public int getPages(){
        return pages;
    }
    public String toString(){
        return this.name+" is "+this.pages+" pages long";
    }
    public void bookWeight(){
        if (pages>300)
            System.out.println("'"+name+"'"+" is heavy");
        else
            System.out.println("'"+name+"'"+" is light");
    }
}