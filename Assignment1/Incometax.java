package Assignment1;
import java.util.*;
public class Incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int annualIncome,tax=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enetr your income");
     annualIncome = sc.nextInt();
     if(annualIncome>=0 && annualIncome<=180000)
     {
    	 System.out.println("you are not under Tax");
     }
     else if(annualIncome >= 181001 && annualIncome<= 300000)
     {
    	 tax=(annualIncome*10)/100;
    	 System.out.println("you have to pay" +tax);
     }
     else if(annualIncome>=300001 && annualIncome<=500000)
     {
    	 tax=(annualIncome*20)/100;
    	 System.out.println("you have to pay" +tax);
    	 
     }
     else if(annualIncome>=500001 && annualIncome<=1000000)
     {
    	 tax=(annualIncome*30)/100;
    	 System.out.println("you have to pay" +tax);
    	 
		}

	}

}
