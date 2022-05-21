import java.io.*;
class person
{
	private String name;
	private int age;
	void setname(String name)
	{
		this.name=name;
	}
	void setage(int age)
	{
		this.age=age;
	}
	String getname()
	{
		return name;
	}
	int getage()
	{
		return age;
	}
}
class Demo56
{
	public static void main(String args[])
	{
		person p = new person();
		p.setname("Mukku");
		p.setage(24);
		System.out.println("Name = " +p.getname());
		System.out.println("Age = " +p.getage());
	} 
}