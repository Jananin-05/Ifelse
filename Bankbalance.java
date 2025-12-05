import java.util.*;
import java.util.Scanner; 

class Bankbalance{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your Bank Balance:");
		int amnt=scan.nextInt();

		if(amnt<1000){
			System.out.println("Low Balance");	
		}
		else{
			System.out.println("Balance OK");	
		}	
	}
}	