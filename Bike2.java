class vehicle
{
	void run()
	{
	System.out.println("Vehicale is Running");
	}
}
class Bike2 extends vehicle
{
	void run()
	{
	System.out.println("Bike is riding Safely");
	}
	public static void main(String args[])
	{
	Bike2 obj = new Bike2();
	obj.run();
	}
}