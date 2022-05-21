class Demo
{
	double a,b;
	Demo(double a, double b)
	{
		this.a=a;
		this.b=b;
	}
void Display()
{
	System.out.println("A =" + a);
	System.out.println("B =" + b);
}
}
class Uthis
{
	public static void main(String args[])
	{
		Demo D = new Demo(45,05);
		D.Display();
	} 
}