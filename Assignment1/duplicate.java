package Assignment1;
import java.io.*;
public class duplicate {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the word : ");
		String s = br.readLine();
		int l = s.length();
		char ch;
		String ans=" ";
		for(int i=0; i<l; i++)
		{
			ch = s.charAt(i);
			
			if(ch!=' ')
			{
				
				ans = ans + ch;
				s=s.replace(ch, ' ');
				
			}
			
		}
		System.out.println("Words after removing the duplicate characters : " + ans);
	}

}
