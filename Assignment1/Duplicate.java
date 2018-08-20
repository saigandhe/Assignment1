package Assignment1;
import java.io.*;
public class Duplicate {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the word : ");
		String input = br.readLine();
		int length = input.length();
		char ch;
		String output=" ";
		for(int i=0; i<length; i++)
		{
			ch = input.charAt(i);
			
			if(ch!=' ')
			{
				
				output = output + ch;
				input=input.replace(ch, ' ');
				
			}
			
		}
		System.out.println("Words after removing the duplicate characters : " + output);
	}

}
