package Assignment1;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int discount,newitemprice;
		Scanner sc = new Scanner(System.in);
		double MRP,discount,newitemprice,s;
		System.out.println("Enter the MRP");
		MRP = sc.nextDouble();
	discount = MRP*35/100;
	newitemprice = MRP-discount;
	System.out.println("The discounted price is :" +newitemprice);
		

	}

}
