import java.util.*;

class complex_op 
{
    float real,img;

    complex_op()
    {
        real = 0;
        img = 0;
    }

    complex_op(float comp1,float comp2)
    {
        real = comp1;
        img = comp2;
    }

    public void Addnumbers(complex_op c1,complex_op c2)
    {
        float real,img;
        real = (c1.real + c2.real);
        img  = (c1.img + c2.img);
        System.out.println("Answer is : ("+real+")+("+img+")i");
    }

    public void Subnumbers(complex_op c1,complex_op c2)
    {
        float real,img;
        real = (c1.real - c2.real);
        img  = (c1.img - c2.img);
        System.out.println("Answer is : ("+real+")+("+img+")i");
    }

    public void Multiplynumbers(complex_op c1,complex_op c2)
    {
        float real,img;
        real = (c1.real*c2.img + c1.img*c2.real);
        img  = (c1.img * c2.img);
        System.out.println("Answer is : ("+real+")+("+img+")i");
    }

    public void Dividenumbers(complex_op c1,complex_op c2)
    {
        float real,img;
        real = ((c1.real*c2.real + c1.img*c2.img)/c2.real*c2.real + c2.img*c2.img);
        img  = ((c1.img*c2.real + c1.real*c2.img)/c2.real*c2.real + c2.img*c2.img);
        System.out.println("Answer is : ("+real+")+("+img+")i");
    }
}

public class complex 
{
    public static void main(String args[])
    {
        float num1,num2;
        int ch=0,y;
        complex_op cal = new complex_op();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");
            System.out.println("Enter Choice : ");
            ch = sc.nextInt();
            System.out.println("Enter first number : ");
            num1 = sc.nextFloat();
            num2 = sc.nextFloat();
            complex_op object1 = new complex_op(num1,num2);
            System.out.println("Enter second number : ");
            num1 = sc.nextFloat();
            num2 = sc.nextFloat();
            complex_op object2 = new complex_op(num1,num2);
            
            switch(ch)
            {
                case 1 : cal.Addnumbers(object1 , object2);
                            break;

                case 2 : cal.Subnumbers(object1 , object2);
                            break;

                case 3 : cal.Multiplynumbers(object1 , object2);
                            break;

                case 4 : cal.Dividenumbers(object1 , object2);
                            break;

                default : 
                System.out.println("Invalid Choice!!");
                break;
            }
            System.out.println("Press 1 to continue else 0 : ");
            y = sc.nextInt();
        }while(y==1);
        sc.close();
    }
}
