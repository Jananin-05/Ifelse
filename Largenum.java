import java.util.*;
import java.util.Scanner; 

class Largenum{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Number:");
		int num=scan.nextInt();

		if(num>999){
			System.out.println("Large Number");	
		}
		else{
			System.out.println("Small Number");	
		}	
	}
}	