package enc.dec.java;

public class EncObj {
	public static void main (String[] args) {
		Encryption es = new Encryption();
	
	es.getInput(); 
	System.out.printf("Enter the string is \n %s", es.encrypt());
	es=null;

}
}
