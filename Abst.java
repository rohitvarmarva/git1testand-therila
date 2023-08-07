import java.io.*;
abstract class Passenger{
    Passenger(){
        System.out.println("hello");
    }
    abstract void booking();
}
public class Abst extends Passenger{
    String n="Active";
    String v="vivek";
    int no=62;
    Abst(){
        System.out.println("gfdshjms");
    }
    public void booking(){
        System.out.println("the train "+n+":"+v+":"+no);
    }
    public static void main(String[] args){
       // Passenger p=new Passenger();
        Abst m=new Abst();
        m.booking();
    }
}
