package lab1;
import java.lang.*;
public class Dog {
    private String name;
    private int age;
    public Dog(String n, int a) {
        name = n;
        age = a;
    }
    public Dog(String n) {
        name = n;
        age = 0;
    }
    public Dog(){
        name = "Puffy";
        age = 7;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "name "+this.name+", age "+this.age;
    }
    public void ratingAge(){
        if (age>7)
            System.out.println(name+" is old");
        else
            System.out.println(name+" is young");
    }
}
