import java.util.Scanner;
 class Sum_skip
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any 10-positive Number : ");
		int i , s=0 ;
		for(i=1; i<=10; i++)
		{
			int n=sc.nextInt();
			if(n<0)
			{
				System.out.println("Please Enter Positive Number");
				continue;
			}
			else
			{
				s=s+n;
			}
	}
		System.out.println("Sum = " + s);
 }
 }
		