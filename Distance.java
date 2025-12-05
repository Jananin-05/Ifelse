import java.util.*;
import java.util.Scanner; 

class Distance{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter First Distance:");
		int dis1=scan.nextInt();
		System.out.println("Enter Second Distance:");
		int dis2=scan.nextInt();

		if(dis1>dis2){
			System.out.println("Distance one is Longer");	
		}
		else{
			System.out.println("Distance two is Longer");	
		}	
	}
}	