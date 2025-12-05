import java.util.*;
import java.util.Scanner; 

class Blood{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your Weight:");
		int weight=scan.nextInt();

		if(weight<50){
			System.out.println("Cannot Donate");	
		}
		else{
			System.out.println("Can Donate");	
		}	
	}
}	