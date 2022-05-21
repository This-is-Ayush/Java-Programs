import java.util.Scanner;
class Salary {
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary:");
		double bs = sc.nextDouble();
		double da, ta, hra, pf, gs;
		da =(bs*25)/100;
		ta =(bs*15.5)/100;
		hra =(bs*20)/100;
		pf =(bs*19.75)/100;
		gs = bs+da+ta+hra-pf;
		System.out.println("Gross salary:"+gs);
	}
}
