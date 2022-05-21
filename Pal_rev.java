import java.util.Scanner;
class Reverse
{
	int n;
	void input(int n)
	{
	this.n=n;
	}
	void calculate()
	{
	int r, rev=0;
	while(n>0)
	{
	r=n%10;
	rev=rev*10+r;
	n=n/10;
	}
	System.out.println("REVERSE NUMBER :" + rev);
	}
}
class palindrome extends Reverse
{
	int n;
	void check_palindrome(int n)
	{
	this.n=n;
	int r,rev=0,n1=n;
	while(n>0)
	{
	r=n%10;
	rev=rev*10+r;
	n=n/10;
	}
	if(n1==rev)
	System.out.println("Number is Palindrome");
	else
	System.out.println("Number is Not Palindrome");
	}
}
class Pal_rev
{
	public static void main(String args[])
	{
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n= Sc.nextInt();
		palindrome p=new palindrome();
		p.input(n);
		p.calculate();
		p.check_palindrome(n);
	}
}