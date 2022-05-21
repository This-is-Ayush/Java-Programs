import java.util.Scanner;
class sum_1_to_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
System.out.println("Enter Any Number from 1 to 10 : ");
int i = Sc.nextInt();
int sum = 0;
while(i<=10)
{
	sum = sum + i;
	i++;
			}
System.out.println("Sum " + sum);
	}

}
