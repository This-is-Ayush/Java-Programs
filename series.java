import java.util.Scanner;
 class series
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Term of Series : ");
		int n=sc.nextInt();
		double s = 0, f =1;
		for(int i=1; i<=n; i++)
		{
			f= f * i;
			s= s + (1/f);
		}
		System.out.println("Sum = "+ s);
	}
 }
		