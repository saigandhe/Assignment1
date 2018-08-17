import java.io.*;
public class Square {
	void sqr(int n)
	{
		int sqr = n*n;
		System.out.println(n + " * 1 = " + n + ", Square: " +sqr);
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("enter the value");
		int n= Integer.parseInt(br.readLine());
		Square obj = new Square();
		obj.sqr(n);
	}

}
