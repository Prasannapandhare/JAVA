import java.util.*;
public class division {

	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter first number :");
			num1 = sc.nextInt();
			System.out.println("Enter second number :");
			num2 = sc.nextInt();
		
			int q = num1/num2;
			int r = num1%num2;
			
			System.out.println("Quotient : "+q);
			System.out.println("Remainder : "+r);
			
			int arr[] = {1,2,3,4,5,6};
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]+"");
			}
		}
		
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Hello , It's "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of Bound");
		}
		
		finally
		{
            System.out.println("\nProcess Executed Successfully.......\n");
        }
		sc.close();
	}
}
