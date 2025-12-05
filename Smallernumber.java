import java.util.*;
import java.util.Scanner; 

class Smallernumber{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a=scan.nextInt();
		System.out.println("Enter the 2nd number:");
		int b=scan.nextInt();

		if(a<b){
			System.out.println("First is Smaller");	
		}
		else{
			System.out.println("Second is Smaller");	
		}	
	}
}	