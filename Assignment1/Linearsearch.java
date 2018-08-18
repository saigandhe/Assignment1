package Assignment1;
import java.util.Scanner;
public class Linearsearch {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array");
    int n= sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the elements in Array");
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();
    }
    System.out.println("Enter the element to be searched");
    int x=sc.nextInt();
    int flag=0,k=0;
    for(k=0;k<n;k++)
    {
    	if(a[k]==x)
    	{
    		flag=1;
    		break;
    	}
    	else 
    	{
    		flag=0;
    		
    	}
    }
    if(flag==1)
    {
    	System.out.println("Number is found at the position" +(k+1));
    }
    else
    {
    	System.out.println("Not found");
    }
	}

}
