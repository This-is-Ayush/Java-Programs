import java.util.Scanner;
class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter Temprature in celcius:");
double c= sc.nextDouble();
double f = ( c / 15 ) * 9 + 32;
System.out.println("Temprature in Fahrenheit=" + f );
	}

}
