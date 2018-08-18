package Assignment1;
import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int flag=0;
		String[] names= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev","Kity","Meery","Smith","Johnson","Bill","Williams","Jones","Brown","Davis","Miller","Willson","Moore","Taylor","Anderson","Thomas","Jackson"};
		Scanner in=new Scanner(System.in);
		System.out.println("give the input name");
		String s=in.nextLine();
		for(int i=0;i<28;i++) {
			String x=names[i];
			if(s.equals(x))
			{
				flag++;
			}
		}
			if(flag!=0)
			{
				System.out.println("yes matched "+flag+ "times");
			}
			else
			{
				System.out.println("It is not present");
			}
			}
		}


