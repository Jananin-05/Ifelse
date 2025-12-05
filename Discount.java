import java.util.*;
import java.util.Scanner; 

class Discount{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Discount:");
		int discount=scan.nextInt();

		if(discount>20){
			System.out.println("Big Discount");	
		}
		else{
			System.out.println("Normal Discount");	
		}	
	}
}	