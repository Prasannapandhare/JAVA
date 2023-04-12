import java.util.*;

abstract class shape
{
    double a,b;
    Scanner sc = new Scanner(System.in);
    abstract public void area();
    public void input()
    {
        System.out.println("Enter input a : ");
        a = sc.nextDouble();
        System.out.println("Enter input b : ");
        b = sc.nextDouble();
    }
}

class rectangle extends shape
{
    public void area()
    {
        System.out.println("Area of Rectangle is : "+ a*b);
    }
}

class triangle extends shape
{
    public void area()
    {
        System.out.println("Area of Triangle is : "+ 0.5*a*b);
    }
}

public class shapeClass 
{
    public static void main(String[] args)
    {
        System.out.println("DYNAMIC BINDING");
        shape S;
        rectangle R = new rectangle();
        triangle T = new triangle();
        S = R;
        System.out.println("Enter inputs of Rectangle : ");
        S.input();
        S.area();
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        S = T;
        System.out.println("Enter inputs of Triangle : ");
        S.input();
        S.area(); 
    }
}
