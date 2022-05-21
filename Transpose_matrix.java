import java.util.Scanner;
 class Transpose_matrix
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j, m[][]= new int[3][3];
		System.out.print("Enter Element in Matrix : ");
		for(i=0;i<3;i++)
			{
			for(j=0;j<3;j++)
			{
			m[i][j] = sc.nextInt();	
			}
			}
		System.out.println("Your Matrix");
		for(i=0;i<3;i++)
		{
		for(j=0;j<3;j++)
		{
			System.out.println(m[i][j]);
		}
		System.out.println();
		}
		System.out.println("Transpose of Matix  :");
		for(j=0;j<3;j++)
		{
		for(i=0;i<3;i++)
		{
			System.out.println(m[i][j]);
		}
		System.out.println();
		}
	}
 }