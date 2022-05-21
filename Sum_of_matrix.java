import java.util.Scanner;
 class Sum_of_matrix
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int m1[][]= new int[3][3];
		int m2[][]= new int[3][3];
		System.out.print("Enter Element in Matrix : 1");
		for(i=0;i<3;i++)
			{
		for(j=0;j<3;j++)
			{
		    m1[i][j] = sc.nextInt();	
			}
			}
		System.out.println("Enter Element in Matrix : 2");
		for(i=0;i<3;i++)
		{
		for(j=0;j<3;j++)
		{
	   	m2[i][j]= sc.nextInt();
		}
		}
	    int m3[][] = new int[3][3];
		for(j=0;j<3;j++)
		{
		for(i=0;i<3;i++)
		{
		m3[i][j]= m1[i][j]+m2[i][j];
		}
		}
		System.out.println("After Sum of Matrix :");
		for(j=0;j<3;j++)
		{
		for(i=0;i<3;i++)
		{
		System.out.print(m3[i][j]+" ");
		}
		System.out.println();
		}
	}
 }