package adaldosso.functions;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloFunction {
    
    private static String hello(String name) {
        return "Hello " + name;
    }
    
    public static void main(String[] args) {
        String saluti = hello("Alberto");
        System.out.println(saluti);
    }

}
