package Assignment1;

import java.io.*;
public class Reversestring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ip=br.readLine();
		String words[]=ip.split(" ");
		String fnl="";
		for(int i=0;i<words.length;i++)
		{
			String rev="";
		for(int j=words[i].length()-1;j>=0;j--)
		{
			rev+=words[i].charAt(j);
		}
		fnl+=rev+" ";
		}
		System.out.println(fnl);
		

	}

}
