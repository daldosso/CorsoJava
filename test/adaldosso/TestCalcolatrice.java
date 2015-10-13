package adaldosso;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Alberto Dal Dosso
 */
public class TestCalcolatrice {
    
    @Test
    public void testSomma() {
        Calcolatrice calcolatrice = new Calcolatrice();
        Assert.assertTrue(calcolatrice != null);
    }

}
