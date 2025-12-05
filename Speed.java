import java.util.*;
import java.util.Scanner; 

class Speed{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Speed:");
		int speed=scan.nextInt();

		if(speed>60){
			System.out.println("Over Speed");	
		}
		else{
			System.out.println("Safe speed");	
		}	
	}
}	