import java.util.Scanner;
class Subject {
public static void main(String Args[])
{
	Scanner sc= new Scanner (System.in);
			System.out.print("Enter 5-Subjest's Marks: ");
	int c = sc.nextInt();
	int h = sc.nextInt();
	int e = sc.nextInt();
	int m = sc.nextInt();
	int p = sc.nextInt();
	int pr=((c+h+e+m+p)*100)/500;
	System.out.println("Total Percentage of 5-Subjects out of 500 in % " + pr);
}
}
