import java.util.Scanner;
 class Comb
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any value of n&r");
		int n=sc.nextInt();
		int r=sc.nextInt();
		int f1=1, f2=1, f3=1, i;
		for(i=1;i<=n;i++)
		{
			f1=f1*i;
		}
		for(i=1;i<=r;i++)
		{
			f2=f2*i;
			}
		for(i=1;i<=n-r;i++)
		{
		f3=f3*i;
		}
		int nCr = f1/(f2*f3);
		System.out.println("nCr  =" + nCr);
	}
	}
	
 

