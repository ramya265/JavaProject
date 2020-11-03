package day5;
import java.util.Scanner;
import java.lang.String;


public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	     System.out.print("Input a Sentence: ");
   	     String ln = in.nextLine();
   	     String uc = " "; 
         Scanner ls = new Scanner(ln); 
           while(ls.hasNext()) {
               String word = ls.next(); 
               uc += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
           }
        System.out.println(uc.trim()); 

	}

}
