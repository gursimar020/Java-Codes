import java.util.Scanner;

public class factorial
{
	public static void main(String[] args)
	{
			int s,fact=1,i;
			Scanner num = new Scanner(System.in);
			s=num.nextInt();
			for(i=1;i<=s;i++)
			fact=fact*i;
			System.out.println("Factorial is:"+fact);
	}
}
