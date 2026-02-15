import java.util.*;
import java.util.Scanner;

class Median{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the three numbers to determine median");

		System.out.println("Enter the 1st number:");
		int a=scan.nextInt();
		System.out.println("Enter the 2nd number:");
		int b=scan.nextInt();
		System.out.println("Enter the 3rd number:");
		int c=scan.nextInt();
		
		if(a>b){
			if(b>c){
				System.out.println("Median is b");
			}
			else if(a>c){
				System.out.println("Median is c");
			}
			else{
				System.out.println("Median is a");
			}
		}
		else if(b>=a){
			if(a>c){
				System.out.println("Median is a");
			}
			else if(b>c){
				System.out.println("Median is c");
			}
			else{
				System.out.println("Median is b");
			}
	
		}
			
	}
}