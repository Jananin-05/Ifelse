import java.util.*;
import java.util.Scanner; 

class Attendance{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Attendance:");
		int attendance=scan.nextInt();
		
		if(attendance<75){
			System.out.println("Warning");	
		}
		else{
			System.out.println("Allowed");	
		}	
	}
}	