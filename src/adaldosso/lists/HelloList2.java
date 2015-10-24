package adaldosso.lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daldosso
 */
public class HelloList2 {
    
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Prova1");
        list.add("Prova2");
        list.add("Prova3");
        list.add("Prova4");

        for (Object str : list) {
            System.out.println(str);
        }
    }
    
}
