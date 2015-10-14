package adaldosso;

/**
 *
 * @author Alberto Dal Dosso
 */
public class HelloSwitch {
    
    public static void main(String[] args) {
        int var = 2;
        switch (var) {
            case 1:
                System.out.println("Var vale 1");
                break;
            case 2:
                System.out.println("Var vale 2");
                break;
            case 10:
                System.out.println("Var vale 10");
                break;
            default: 
                System.out.println("defaul");
        }
        
        String str = "test";
        switch (str) {
            case "test":
                System.out.println("Case 1");
                break;
            case "2":
                System.out.println("Case 2");
                break;
            case "10":
                System.out.println("Case 3");
                break;
            default: 
                System.out.println("defaul");
        }
    }

}
