import java.util.Scanner;
 class Zero_sum
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int s=0,n;
		do
		{
		System.out.println("Enter Any Number : ");
		n = sc.nextInt();
		s = s + n;
		}while (n!=0);
		System.out.println("Sum is =" + s);
 }
 }