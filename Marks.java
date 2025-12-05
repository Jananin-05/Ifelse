import java.util.*;
import java.util.Scanner; 

class Marks{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your Mark:");
		int mark=scan.nextInt();

		if(mark>34){
			System.out.println("Passed");	
		}
		else{
			System.out.println("Failed");	
		}	
	}
}	