import java.util.Scanner; 
class Km_to_meter
{
    public static void main (String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Distance in Kilo Meters: ");
    	double km = sc.nextDouble();
    	double m  = km * 1000.0;
    	double cm = m * 100.0;
        System.out.println("Length in Kilometer = "+ km);
        System.out.println("Length in Meter = " + m);
        System.out.println("Length in Centimeter = " + cm);
    }
}