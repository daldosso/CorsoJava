package adaldosso.arrays;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloMatrix2 {
    
    public static void main(String[] args) {
        String[][][] lista = new String[8][8][8];
        lista[0][0][0] = "12";
        lista[1][0][0] = "4";
        lista[2][0][0] = "5";
        lista[3][0][0] = "3";
        lista[4][0][0] = "7";
        lista[5][0][0] = "8";
        lista[6][0][0] = "5";
        lista[7][0][0] = "1";
        
        for (int i=0; i<lista.length; i++) {
            System.out.println("Hello world: " + lista[i][0][0]);
        }        
    }

}
