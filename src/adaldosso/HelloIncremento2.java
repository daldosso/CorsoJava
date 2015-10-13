package adaldosso;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloIncremento2 {

    public static void main(String[] args) {
        int var1, var2;
        var1 = 0;
        System.out.println("var1: " + var1);
        var2 = var1++;
        System.out.println("var2: " + var2);
        
        var2 = ++var1;
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        
    }
    
}
