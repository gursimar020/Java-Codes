import java.util.Scanner;

public class armstrong
{
	public static void main(String args[])
	{
	int n,m,cc,sum=0,z,t,count=0;

	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the number : ");
	n=obj.nextInt();

	m=n;

	while(n>0)
	{
		n=n/10;
		count++;
	}

	n=m;
	cc=count;

	while(n>0)
	{
		t=n%10;
		count=cc;
		z=1;

		while(count!=0)
		{
			z=z*t;
			count--;
		}

		sum=sum+z;
		n=n/10;
	}
	if(sum==m)
	System.out.println("Armstrong");
	else
	System.out.println("Not Armstrong");

	}
}
