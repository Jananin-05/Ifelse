import java.util.*;
import java.util.Scanner; 

class Neg{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the number:");
		int num=scan.nextInt();

		if(num<0){
			System.out.println("Negative");	
		}
		else{
			System.out.println("Positive or Zero");	
		}	
	}
}	