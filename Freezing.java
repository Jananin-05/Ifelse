import java.util.*;
import java.util.Scanner; 

class Freezing{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Temperature:");
		int temp=scan.nextInt();

		if(temp<0){
			System.out.println("Water Freezes");	
		}
		else{
			System.out.println("Not frozen");	
		}	
	}
}	