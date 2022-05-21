import java.util.Scanner;
class Surface_Area {
	public static void main(String Args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Radius of Cylender:");
		double r = sc.nextDouble();
		System.out.println("Enter Height of Cylender:");
		double h = sc.nextDouble();
		double a = (2*3.14*r*h)+(2*3.14*r*r);
		double v = (3.14*r*r*h);
		
		System.out.println("Area of Cylender:"+ a);
		System.out.println("Volume of Cylender:"+ v);
		
		
	}

}
