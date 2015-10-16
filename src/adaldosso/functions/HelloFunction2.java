package adaldosso.functions;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloFunction2 {
    
    private static void change(int number) {
        number = 10;
    }
    
    public static void main(String[] args) {
        int n = 0;
        change(n);
        System.out.println(n);
    }

}
