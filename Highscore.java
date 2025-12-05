import java.util.*;
import java.util.Scanner; 

class Highscore{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your 1st Score:");
		int score1=scan.nextInt();

		System.out.println("Enter your 2nd Score:");
		int score2=scan.nextInt();

		if(score1>score2){
			System.out.println("First is Higher");	
		}
		else{
			System.out.println("Second is Higher");	
		}	
	}
}	