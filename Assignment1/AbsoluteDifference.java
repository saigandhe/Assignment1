package Assignment1;
import java.io.*;
public class AbsoluteDifference {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr the size of array");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int [size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the value of k");
		int k = Integer.parseInt(br.readLine());
		for(int i=0;i<size-1;i++)
		{
		for(int j=i+1;j<size;j++)
		{
			if(Math.abs(i-j)<=k)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Such a pair exists at" +(i+1) + "and" +(j+1));
				}
			}
		}
		}
	}

}
