package adaldosso.quantospendi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alberto Dal Dosso
 */
class CategorieManager {
    
    List<Categoria> categorie = new ArrayList<>();

    public void add(Categoria categoria) {
        categorie.add(categoria);
    }

    public int categorieCount() {
        return categorie.size();
    }

}
