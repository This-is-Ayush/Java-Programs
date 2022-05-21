class Person {
private String name = "Ram";
private int age = 21;
public void display()
{
	System.out.println("My name is" + name);
	System.out.println("I am" + age +"years old");
	}
}
class Demo1
{
	public static void main(String args[])
	{
		Person p = new Person();
		p.display();
		
	}
}