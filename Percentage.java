import java.util.*;
import java.util.Scanner; 

class Percentage{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Percentage:");
		int percent=scan.nextInt();
		
		if(percent>90){
			System.out.println("Excellent");	
		}
		else{
			System.out.println("Good");	
		}	
	}
}	