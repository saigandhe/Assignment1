package Assignment1;
import java.util.Scanner;
public class MultidimenssionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows= sc.nextInt();
		System.out.println("Enter the number of columns");
		int columns= sc.nextInt();
		System.out.println("Enter the elements of array");
		int md[][] = new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<columns;j++)
		{
			md[i][j] = sc.nextInt();
		}
	}
		System.out.println("Enter the element to be searched");
		int ele = sc.nextInt();
		sc.close();
		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<columns;j++)
		{
			if(ele==md[i][j])
			{
				System.out.println("element is found");
				
			}
			}
		}
	}
}
