public class smallest_largest
{
	public static void main(String[] args)
	{

	int arr[]=new int[]{4,70,30,54,2};
	int small=arr[0],large=arr[0];

	for(int i=0;i<5;i++)
	{
		if(arr[i]>large)
		large=arr[i];

		if(arr[i]<small)
		small=arr[i];
	}
	System.out.println("largest = "+large);
	System.out.println("smallest = "+small);
	}

}
