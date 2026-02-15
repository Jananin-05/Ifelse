import java.util.*;
import java.util.Scanner;

class Grade{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("");

		System.out.println("Enter the Percentage marks:");
		int m=scan.nextInt();
		
		if(m>90){
			System.out.println("A+");
		}
	
		else if(m>80){
			System.out.println("A");
		}
		else if(m>70){
			System.out.println("B");
		}
		else if(m>60){
			System.out.println("C");
		}
		else if(m>50){
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
			
	}
}