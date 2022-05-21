import java.util.Scanner;
class Triangle {
public static void main(String Args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Sides of triangle:");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double s = (a+b+c)/2;
	double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println("Area of Triangle:"+ar);
}
}
