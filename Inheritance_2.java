class Teacher
{
	int id;
	String add;
	String name;
	double sal;
	void setid(int id)
	{
		this.id=id;
	}
	void getid()
	{
		System.out.println("ID Number: "+ id);
	}
	void setname(String name)
	{
		this.name=name;
	}
	void getname()
	{
		System.out.println("Teacher Name :"+ name);
	}
	void setadd(String add)
	{
		this.add=add;
	}
	void getadd()
	{
		System.out.println("Address :"+ add);
	}
	void setsal(double sal)
	{
		this.sal=sal;
	}
	void getsal()
	{
		System.out.println("Salary of Teacher :"+ sal);
	}
}
class Student extends Teacher
{
	String stname;
	double marks;
	void setstname(String stname)
	{
		this.stname=stname;
	}
	void getstname()
	{
		System.out.println("Name of Student :"+ stname);
	}
	void setmarks(double marks)
	{
		this.marks=marks;
	}
	void getmarks()
	{
		System.out.println("Student Marks :"+ marks);
	}
}

class Inheritance_2
{
	public static void main(String args[])
	{
		Student op = new Student();
		op.setid(401);
		op.getid();
		op.setname("Mohan");
		op.getname();
		op.setadd("422/11, Gurugram");
		op.getadd();
		op.setsal(40000);
		op.getsal();
		op.setstname("Chamdan");
		op.getstname();
		op.setmarks(380);
		op.getmarks();
	}
}