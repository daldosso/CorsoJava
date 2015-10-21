package adaldosso.quantospendi;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author daldosso
 */
public class TestCategorie {
    
    private final CategorieManager categorieManager = new CategorieManager();

    @Test
    public void testCreate() {
        Assert.assertTrue(categorieManager != null);
    }
    
    @Test
    public void testCategorie() {
        Categoria auto = new Categoria("AUTO", "Automobile");
        categorieManager.add(auto);
        Assert.assertTrue(categorieManager.categorieCount() > 0);
        
    }
}
