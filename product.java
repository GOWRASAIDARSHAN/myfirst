package productt;
import java.util.*;

public class productt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Price: ");
		double price = sc.nextDouble();
		System.out.println("Enter Quantity: ");
		int qty = sc.nextInt();
		double total = price*qty;
		double discount = total*0.10;
		double finalAmount = total-discount;
		System.out.println("Total Amount:"+total);
		System.out.println("Discount:"+discount);
		System.out.println("Final Payable Amount:"+finalAmount);
		sc.close();
	}
}
