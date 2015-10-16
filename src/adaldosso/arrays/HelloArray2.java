package adaldosso.arrays;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloArray2 {
    
    public static void main(String[] args) {
        int[] lista = new int[8];
        lista[0] = 12;
        lista[1] = 4;
        lista[2] = 5;
        lista[3] = 3;
        lista[4] = 7;
        lista[5] = 8;
        lista[6] = 5;
        lista[7] = 1;
        
        for (int i=0; i<lista.length; i++) {
            System.out.println("Hello world: " + lista[i]);
        }        
    }

}
