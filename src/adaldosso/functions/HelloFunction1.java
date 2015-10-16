package adaldosso.functions;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloFunction1 {
    
    private static void hello(String name) {
        name = "Test";
    }
    
    public static void main(String[] args) {
        String saluti = "Alberto";
        hello(saluti);
        System.out.println(saluti);
    }

}
