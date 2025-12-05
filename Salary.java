import java.util.*;
import java.util.Scanner; 

class Salary{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your Salary:");
		int salary=scan.nextInt();

		if(salary>50000){
			System.out.println("High Salary");	
		}
		else{
			System.out.println("Normal Salary");	
		}	
	}
}	