package Assignment1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121, reverseinteger=0, remainder, orginalinteger;
		orginalinteger=num;
		while(num!=0)
		{
			remainder=num%10;
			reverseinteger=reverseinteger*10+remainder;
			num /= 10;
		}
		if(orginalinteger == reverseinteger)
		{
			System.out.println(orginalinteger + " is a palindrome.");
			
		}
		else
		{
			System.out.println(orginalinteger + "is not a palindrome.");
		
		}
		

	}

}
