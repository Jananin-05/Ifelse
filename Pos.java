import java.util.*;
import java.util.Scanner; 

class Pos{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the number:");
		int num=scan.nextInt();

		if(num>0){
			System.out.println("Positive");	
		}
		else{
			System.out.println("Negative or Zero");	
		}	
	}
}	