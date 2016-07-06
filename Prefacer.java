public class Prefacer {

    private static char nextChar = 'A';

    private static char backupChar = 'M';
    
    public static String nirp = "";
    
    public static void preface(int q) {

	if (q > 0) { 
	    nextChar += (int) ((Math.sqrt(nextChar) * 12)
		+ (nextChar / 3) - (Math.sqrt(nextChar + 1))
		+ (int) (Math.sin((double) nextChar))
		- ((short) Math.cbrt((double) nextChar + 2)))
	        - 109;
	    nextChar++;
	    // System.out.println("**" + (int) nextChar + "**");
	    if (nextChar > 'Z' || nextChar < ' ') {
		nextChar = backupChar++;
		if (backupChar > 'Z') {
		    backupChar = 'A';
		}
	    }
	    String toBe = new String("" + nextChar);
	    nirp += toBe;
	    preface(q - 1);
	} 
    }
    
}
