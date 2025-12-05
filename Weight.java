import java.util.*;
import java.util.Scanner; 

class Weight{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter 1st Person Weight:");
		int weight1=scan.nextInt();
		System.out.println("Enter 2nd Person Weight:");
		int weight2=scan.nextInt();

		if(weight1>weight2){
			System.out.println("First is Heavier");	
		}
		else{
			System.out.println("Second is Heavier");	
		}	
	}
}	