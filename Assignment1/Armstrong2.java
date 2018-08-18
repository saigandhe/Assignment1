
public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=100;k<1000;k++)
		{
			int n=k;
			int s=0;
			while(n>0)
			{
				int d=n%10;
				s=s+(d*d*d);
				n=n/10;
			}
			if(k==s)
			{
				System.out.println(k);
			}
			}
		}

	}


