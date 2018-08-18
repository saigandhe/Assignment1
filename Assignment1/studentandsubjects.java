package Assignment1;
import java.util.Scanner;

public class studentandsubjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of student 1:");
		
		int a1=Integer.parseInt(sc.next());
		int b1=Integer.parseInt(sc.next());
		int c1=Integer.parseInt(sc.next());
		System.out.println("Enter the marks of student 2:");
		
		int a2=Integer.parseInt(sc.next());
		int b2=Integer.parseInt(sc.next());
		int c2=Integer.parseInt(sc.next());
		System.out.println("Enter the marks of student 3:");
		
		int a3=Integer.parseInt(sc.next());
		int b3=Integer.parseInt(sc.next());
		int c3=Integer.parseInt(sc.next());
		
		int st1=a1+b1+c1;
		int st2=a2+b2+c2;
		int st3=a3+b3+c3;
		int sa1=st1/3;
		int sa2=st2/3;
		int sa3=st3/3;
		int sut1=a1+a2+a3;
		int sut2=b1+b2+b3;
		int sut3=c1+c2+c3;
		int sua1=sut1/3;
		int sua2=sut2/3;
		int sua3=sut3/3;
		System.out.println();
		System.out.println("Total marks of student1 are :" +st1);
		System.out.println("Average marks of student1 are :"+sa1);
		
		System.out.println();
		System.out.println("Total marks of student2 are :" +st2);
		System.out.println("Average marks of student2 are :"+sa2);
		
		System.out.println();
		System.out.println("Total marks of student3 are :" +st3);
		System.out.println("Average marks of student3 are :"+sa3);
		
		System.out.println();
		System.out.println("Total marks obtained by the 3 students in subject A  are :" +sut1);
		System.out.println("Total marks obtained by the 3 students in subject B  are :" +sut2);
		System.out.println("Total marks obtained by the 3 students in subject C are :" +sut3);
		
		System.out.println();
		System.out.println("Average marks obtained by the 3 students in subject A  are :" +sua1);
		System.out.println("Average marks obtained by the 3 students in subject B  are :" +sua2);
		System.out.println("Average marks obtained by the 3 students in subject C are :" +sua3);
		
		
		
		
		
	}

}
