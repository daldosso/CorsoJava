package adaldosso.lists.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daldosso
 */
public class HelloGen {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Prova1");
        list.add("Prova2");
        list.add("Prova3");
        list.add("Prova4");

        for (String str : list) {
            System.out.println(str);
        }
    }
    
}
