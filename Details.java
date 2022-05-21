import java.util.Scanner;
class Father
{
	String name;
	int age;
	void input(String name, int age)
	{
	this.name=name;
	this.age=age;
	}
	void output()
	{
		System.out.println("Father Name :" + name);
		System.out.println("Father's Age :" + age);
	}
}
class Child extends Father
{
	String name;
	int age;
	void indata(String name, int age)
	{
	this.name=name;
	this.age=age;
	}
	void outdata()
	{
		System.out.println("Your Name :" + name);
		System.out.println("Your Age :" + age);
	}

}
class Details
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name :");
		String name= sc.next();
		System.out.println("Enter Age :");
		int age=sc.nextInt();
		Child C = new Child();
		C.input(name,age);
		C.output();
		C.indata(name,age);
		C.outdata();

	}
}