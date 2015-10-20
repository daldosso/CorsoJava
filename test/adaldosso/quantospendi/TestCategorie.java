package adaldosso.quantospendi;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author daldosso
 */
public class TestCategorie {

    @Test
    public void testCreate() {
        CategorieManager categorieManager = new CategorieManager();
        Assert.assertTrue(categorieManager != null);
        categorieManager.add();
    }
}
