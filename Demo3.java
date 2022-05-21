class Person
{
	String name;
	int age;
	Person()
	{
		name = "Ravi";
		age = 25;
		}
	Person(String n , int a)
	{
		name = n;
		age = a;
	}
		void Display()
		{
			System.out.println("My name is" + name);
			System.out.println("I am" + age +"years old");
		}
	}
class Demo3
{
	public static void main(String args[])
	{
		Person p = new Person();
		p.Display();
		Person p1 = new Person("Ram", 21);
		p1.Display();
		
	}

}