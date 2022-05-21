import java.util.Scanner;
class Personal_Details 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Details:");
String name = sc.next();
char ch = sc.next().charAt(0);
String ad = sc.next();
String material = sc.next();
System.out.println("Name:="+name);
System.out.println("Gender:="+ch);
System.out.println("Adhaar Crad No:="+ad);
System.out.println("Material Status:="+material);
}
}