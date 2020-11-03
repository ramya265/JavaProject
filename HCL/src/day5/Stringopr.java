package day5;
import java.lang.String;
public class Stringopr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doOperation("Ramya", "Add");
		doOperation("Ramya", "Replace");
		doOperation("Ramya", "Remove");
		doOperation("ramya", "Change");

	}

	public static String doOperation(String inStr, String operation) {
		String opStr = "";
		StringBuilder sb = new StringBuilder();

		if ("Add".equals(operation)) {
			opStr = inStr.concat(inStr);
		} else if ("Remove".equals(operation)) {
			char[] chars = inStr.toCharArray();
			boolean repeatChar;
			for (int i = 0; i < chars.length; i++) {
			    repeatChar = false;
			    for (int j = i + 1; j < chars.length; j++) {
			        if (chars[i] == chars[j]) {
			            repeatChar = true;
			            break;
			        }
			    }
			    if (!repeatChar) {
			        sb.append(chars[i]);
			    }
			}
			opStr = sb.toString();

		} else {
			int real = 0;
			int n = 0;
			for (int i = 0; i < inStr.length(); i++) {
				char currChar = inStr.charAt(i);
				if (real % 2 == 0) {
					n++;
					
					if ("Replace".equals(operation)) {
						currChar = '#';
					} else {
						currChar = Character.toUpperCase(currChar);
					}

				}
				real++;
				sb.append(currChar);
				opStr = sb.toString();
			}
		}

		System.out.println("outputStr :: " + opStr);

		return opStr;
	




	}

}
