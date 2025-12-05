import java.util.*;
import java.util.Scanner; 

class Height{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter 1st Person height:");
		int height1=scan.nextInt();
		System.out.println("Enter 2nd Person height:");
		int height2=scan.nextInt();

		if(height1>height2){
			System.out.println("First is Taller");	
		}
		else{
			System.out.println("Second is Taller");	
		}	
	}
}	