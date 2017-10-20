public class SumOfPrimeNum
{
	public static void main(String args[])
	{
	int count=0,number=2,sum=0;
	while(count<10)
	{
		if(isprime(number))
		{
		System.out.println(number);
		sum=sum+number;
		count++;
		}
	number++;
	}
	System.out.println(sum);
	}

	private static boolean isprime(int num)
	{
	int i=2;
	for(i=2;i<=num/2;i++)
	{
	if(num%i==0)
	return false;
	}
	return true;
	}

}

