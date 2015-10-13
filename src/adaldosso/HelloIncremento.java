package adaldosso;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloIncremento {

    public static void main(String[] args) {
        int var = 10;
        var = var + 1;
        System.out.println("var: " + var);
        
        var +=1;
        System.out.println("var: " + var);
        
        var++;
        System.out.println("var: " + var);
    }
    
}
