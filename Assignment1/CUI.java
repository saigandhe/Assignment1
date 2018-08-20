package Assignment1;
import java.util.Scanner;

public class CUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userid = "Saigandhe";
		String pwd = "Naveena";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the userid and pwd");
		int flag =0;
		for (int i=0;i<3;i++)
		{
			String u =sc.nextLine();
			String p =sc.nextLine();
			if(userid.equals(u)&&pwd.equals(p))
			{
				//String u =sc.nextLine();
				//String p =sc.nextLine();
				System.out.println("Welcome" +userid);
				System.exit(0);
				System.out.println("Enter Again");
				flag++;
			}
			
		}
		if(flag==3)
		{
			System.out.println("Welcome");
	}
		else
		{
			System.out.println("Contact Admin");
		}
	}

}
