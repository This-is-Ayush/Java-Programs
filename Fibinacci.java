import java.util.Scanner;
 class Fibonacci
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Term of Series : ");
		int n=sc.nextInt();
		int a=0, b=1,c,i;
		System.out.println("Fibonacci Series : ");
		System.out.println(a);
		System.out.println(b);
		for(i=1; i<=n-2; i++)
		{
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
 }
		