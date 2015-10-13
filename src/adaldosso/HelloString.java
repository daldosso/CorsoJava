package adaldosso;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloString {
    
    public static void main(String[] args) {
        // Create a string with a constructor
        String s1 = new String("Who let the dogs out?");
        
        // Just using "" creates a string, so no need to write it the previous way.
        String s2 = "Who who who who!";

        // Java defined the operator + on strings to concatenate:
        String s3 = s1 + s2;
        
        System.out.println(s3);
    }

}
