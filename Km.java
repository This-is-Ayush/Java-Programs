import java.util.Scanner;
 class Km
 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number to chech Number is Krishnamurti or Not : ");
		int n = sc.nextInt();
		int n1= n;
		int s = 0;
		while (n>0)
		{
			int f = 1;
			int r = n % 10;
			for(int i = 1 ; i <= r ; i++)
			{
				f = f * i;
			}
			s = s + f;
			n = n / 10;
			}
		if ( n1 == s )
		{
		System.out.println("Number is Krishnamurti");
		}
		else
		{	
		System.out.println("Number is Not krishnamurti");
		}
	}
 }
		