import java.util.*;
import java.util.Scanner; 

class Coldtemp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the temperature:");
		int temp=scan.nextInt();
		
		if(temp<15){
			System.out.println("Cold");	
		}
		else{
			System.out.println("Warm");	
		}	
	}
}	