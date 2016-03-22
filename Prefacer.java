public class Prefacer {

    private static char nextChar = 'A';

    public static String nirp = "";
    
    public static void preface(int q) {
	if (q > 0) { 
	    nextChar++;
	    if (nextChar == 'Z') {
		nextChar = 'A';
	    }
	    String toBe = new String("" + nextChar);
	    nirp += toBe;
	    preface(q - 1);
	} 
    }
    
}
