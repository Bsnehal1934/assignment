package assignment;
import java.util.Scanner;
public class vowelorconstant {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String c;
		System.out.println("enter character : ");
		

		String i = sc.next().toLowerCase();
		
		boolean upparcase = i.charAt(0) >=65 && i.charAt(0) <=90;
		boolean lowercase = i.charAt(0) >=97 && i.charAt(0) <=122;
		boolean vowel = i.equals("i") || i.equals("a") || i.equals("e") || i.equals("o") || i.equals("u"); ;
		if(i.length() >1) {
			System.out.println("error: enter a single character");
		}
		else if(!(upparcase || lowercase) )
		{
			System.out.println("Error : not a character");
		}
		else if(vowel)
		{
			System.out.println("vowels");
		}
		else
		{
			System.out.println("constant");
		}
	}
}
