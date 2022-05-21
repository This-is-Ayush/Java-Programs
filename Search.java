import java.util.Scanner;
 class Search
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int n=sc.nextInt();
		int f= 0;
		for(int i=1; i<=50; i++)
		{
			if(n==i)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		System.out.println("Number is Present");
		else
		System.out.println("Number is Not Present");
	}
 }
		