class Sample
{
	static double Sum(double a, double b)
	{
		double c = a+b;
		return c;
	}
}

class Demo55
{
	public static void main(String args[])
	{
		double s = Sample.Sum(10,20);
		System.out.println("Sum =" + s);
	} 
}