import java.util.Scanner;
 class Prime
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number to check Prime Number: ");
		int n=sc.nextInt();
		int f= 0;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				f=1;
				break;
			}
		}
		if(f==1)
		System.out.println("Number is Not Prime");
		else
		System.out.println("Number is Prime");
	}
 }
		