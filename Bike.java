class vehicle
{
	void run()
	{
	System.out.println("Vehicale is Running");
	}
}
class Bike extends vehicle
{
	public static void main(String args[])
	{
	Bike obj = new Bike();
	obj.run();
	}
}