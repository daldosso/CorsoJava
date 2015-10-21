package adaldosso.xml;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Alberto Dal Dosso
 */
public class XmlManager {
    
     public static void main(String[] args) {
         try {
             XmlContatti xmlMap = (XmlContatti) JAXBContext.newInstance(XmlContatti.class).createUnmarshaller().unmarshal(new File("src\\adaldosso\\xml\\test.xml"));
             for (XmlContatto contatto : xmlMap.getContatti()) {
                 System.out.println("Nome: " + contatto.getNome());
             }
         } catch (JAXBException ex) {
             Logger.getLogger(XmlManager.class.getName()).log(Level.SEVERE, null, ex);
         }
        
     }

}
