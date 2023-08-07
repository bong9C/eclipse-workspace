package 연습.Day01;

import java.util.Scanner;

public class NO4 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        char c;
	        String answer = "";
	       
	        String a = sc.next();
	     
	        
	        for ( int i = 0; i < a.length() ; i++ ) {
	        	c = a.charAt(i);
	        	if (Character.isUpperCase(c)) {
	        		c = Character.toLowerCase(c);
	        		answer += c;
	        		
	        	} else if (Character.isLowerCase(c)){
	        		c = Character.toUpperCase(c);
	        		answer += c;
	        	}
	        	
	        }
	        System.out.print(answer);
	        
	        
	        
	    }
	}
