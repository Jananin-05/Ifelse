import java.util.*;
import java.util.Scanner;

class Grade{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Mark:");
		int mark=scan.nextInt();

		if(mark>90 && mark<=100){
			System.out.println("A Grade");
		}
		else if(mark<=90 && mark>80){
			System.out.println("B Grade");
		}
		else if(mark<80 && mark<70){
			System.out.println("C Grade");
		}
		else if(mark<=70 && mark>=0){
			System.out.println("D Grade");
		}
		else{
			System.out.println("No Grade");
		}
	}
}