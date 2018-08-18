package Assignment1;

import java.util.Scanner;

public class Threesubmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of sub1");
		int sub1= sc.nextInt();
		System.out.println("Enter the marks of sub2");
		int sub2= sc.nextInt();
		System.out.println("Enter the marks of sub3");
		int sub3= sc.nextInt();
		if(sub1>60&&sub2>60&&sub3>60)
		{
			System.out.println("Passed");
		}
		else if(sub1>60&&sub2>60 || sub2>60&&sub3>60 || sub3>60&&sub1>60)
		{
			System.out.println("Promoted");
		}
		else if(sub1>60 || sub2 >60 || sub3>60 || sub1<60&&sub2<60&&sub3<60)
		{
			System.out.println("Failed");
		}
	}
}
