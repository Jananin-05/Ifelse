import java.util.*;
import java.util.Scanner; 

class Age{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter First person Age:");
		int age1=scan.nextInt();
		System.out.println("Enter Second person Age:");
		int age2=scan.nextInt();

		if(age1>age2){
			System.out.println("First is older");	
		}
		else{
			System.out.println("Second is older");	
		}	
	}
}	