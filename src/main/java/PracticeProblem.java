/**
 * File: If and else Statements
 * Author: Mikah Ho
 * Date Created: Mar 24, 2026
 * Date Last Modified: Mar 24, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	//q1
	public static String isFive(int num) {
	    
	    if (num == 5) {
	        return "The number is Five";
	    }
	    else {
	        return "The number is not Five";
	    }
	}
	
	//q2
	public static String positiveOrNegative(double num) {
	    
	    if (num > 0) {
	        return "Positive";
	    }
	    else {
	        return "Negative";
	    }
	}
	
	//q3
	public static String highOrLow(int num) {
	    
	    
	    if (num > 100) {
	        return "High";
	    }
	    else {
	        return "Low";
	    }
	}
	
	//q4
	public static String isHello(String word) {
	    
	    if (word.equals("Hello")) {
	        return "The word is Hello";
	    }
	    else {
	        return "The word is not Hello";
	    }
	}
}
