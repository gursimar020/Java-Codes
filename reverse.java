
import java.util.Scanner;

public class reverse
{
	public static void main(String args[])
	{
	Scanner obj = new Scanner(System.in);
	int number,reverse=0;
	number = obj.nextInt();
	while(number!=0)
	{
		reverse=(reverse*10)+(number%10);
		number=number/10;
	}
	System.out.println(reverse);
	}
}
