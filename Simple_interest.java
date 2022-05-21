import java.util.Scanner;
class Simple_interest {
public static void main(String Args[])
{
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter Principle Amount:");
	double pa = sc.nextDouble();
	System.out.println("Enter Time in Years:");
	double t = sc.nextDouble();
	System.out.println("Enter Rate of Interest:");
	double r = sc.nextDouble();
	double si = (pa*t*r)/100;
	System.out.println("Simple Interest:"+si);
}
}
