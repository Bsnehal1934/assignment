package assignment;
import java.util.Scanner;

public class greatest {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i ;
	System.out.println("enter first no:");
	 i=sc.nextInt();
	 System.out.println("enter second no:");
	 int j =sc.nextInt();
	 System.out.println("enter third no:");
	 int k = sc.nextInt();
	 
	 System.out.print("your greatest number is:");
	 if(i>=j) {
		 if(i>=k) {
			 System.out.print(i);
		 }
	 }
	 if(j>=i) {
		 if(j>=k) {
			 System.out.print(j);
		 }
	 }
	 if(k>=i) {
		 if(k>=j) {
			 System.out.print(k);
		 }
	 }
	
	
}
}
