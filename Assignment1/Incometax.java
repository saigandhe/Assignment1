package Assignment1;
import java.util.*;
public class Incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,tax=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enetr your income");
     a = sc.nextInt();
     if(a>=0 && a<=180000)
     {
    	 System.out.println("you are not under Tax");
     }
     else if(a >= 181001 && a<= 300000)
     {
    	 tax=(a*10)/100;
    	 System.out.println("you have to pay" +tax);
     }
     else if(a>=300001 && a<=500000)
     {
    	 tax=(a*20)/100;
    	 System.out.println("you have to pay" +tax);
    	 
     }
     else if(a>=500001 && a<=1000000)
     {
    	 tax=(a*30)/100;
    	 System.out.println("you have to pay" +tax);
    	 
     }
    	
	}

}
