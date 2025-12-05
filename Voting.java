import java.util.*;
import java.util.Scanner; 

class Voting{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the number:");
		int age=scan.nextInt();

		if(age>17){
			System.out.println("Eligible");	
		}
		else{
			System.out.println("Not Eligible");	
		}	
	}
}	