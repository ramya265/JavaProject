package day5;
import java.lang.String;
public class Duplicate {

	
		// TODO Auto-generated method stub
		static final int NO_OF_CHARS = 256;
		 
	    /* Fills count array with 
	       frequency of characters */
	    static void CharCounts(String str, 
	                                   int[] count)
	    {
	        for (int i = 0; i < str.length(); i++)
	            count[str.charAt(i)]++;
	    }
	 
	    /* Print duplicates present 
	      in the passed string */
	    static void printDups(String str)
	    {
	        // Create an array of size 
	        // 256 and fill count of
	        // every character in it
	        int count[] = new int[NO_OF_CHARS];
	        CharCounts(str, count);
	 
	        for (int i = 0; i < NO_OF_CHARS; i++)
	            if (count[i] > 0)
	                System.out.println((char)(i) + 
	                          " = " + count[i]);
	    }
	    public static void main(String[] args) {
	    	String str = "RACECAR";
	        printDups(str);


	}

}
