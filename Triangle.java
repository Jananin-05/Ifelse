import java.util.*;
import java.util.Scanner;

class Triangle{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the values of length to make a Triangle");

		System.out.println("Enter the length a:");
		int a=scan.nextInt();
		System.out.println("Enter the length b:");
		int b=scan.nextInt();
		System.out.println("Enter the length c:");
		int c=scan.nextInt();
		int d=a+b;
		int e=b+c;
		int f=c+a;

		if(d>c && e>a && f>b){
			System.out.println("Yes, they can form a Triangle");
		}
		else{
			System.out.println("No, Cannot form a Triangle");
		}
	}
}