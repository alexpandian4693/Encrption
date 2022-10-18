package enc.dec.java;

import java.util.Scanner;

public class Encryption {
	private String originalString;
	private String encryptString;
	
	public String originalstring() {
		return originalString;
	}
	public String encryptString() {
		return encryptString;
	}
	public void getInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input:\n");
		originalString=in.nextLine();	
		
		
	}
	public String encrypt() {
		encryptString=new String();
		encryptString="";
		char c;
		for(int i=0; i<originalString.length()-1; i++) {
			c=originalString.charAt(i);
			c = (char) ((int)c -1);
			encryptString +=Character.toString(c);	
			
			
		}
		return encryptString;
		
	}


}
