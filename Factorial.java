package pack2;
public class Factorial
{
	double n;
	public Factorial(double n1)
	{
		n = n1;
	}
	public void fact()
	{
		int i,f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial : "+ f);
	}
}