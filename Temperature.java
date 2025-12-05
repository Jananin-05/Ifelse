import java.util.*;
import java.util.Scanner; 

class Temperature{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Temperature:");
		int temp=scan.nextInt();

		if(temp>40){
			System.out.println("Very Hot");	
		}
		else{
			System.out.println("Normal");	
		}	
	}
}	