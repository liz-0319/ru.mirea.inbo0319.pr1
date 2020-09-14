package lab1;
import java.lang.*;
public class Ball {
    private String colour;
    private int price;
    public Ball(String n, int p) {
        colour = n;
        price = p;
    }
    public Ball(String n) {
        colour = n;
        price = 600;
    }
    public Ball() {
        colour = "Gold";
        price = 10000;
    }
    public void setColor(String color){
        this.colour = colour;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getColour(){
        return colour;
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return " this ball is "+this.colour+" and costs "+this.price+"rub";
    }
    public void newPrice(){
        System.out.println(" now costs "+price/75.78+"$");
    }
}
