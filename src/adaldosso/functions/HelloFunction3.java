package adaldosso.functions;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloFunction3 {
    
    private static void change(String name) {
        name = new String("Test");
    }
    
    public static void main(String[] args) {
        String n = "Prova";
        change(n);
        System.out.println(n);
    }

}
