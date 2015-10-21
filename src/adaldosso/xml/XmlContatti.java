package adaldosso.xml;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alberto Dal Dosso
 */
@XmlRootElement(name = "contatti")
public class XmlContatti {
    
    List<XmlContatto> contatti;
    
    @XmlElement(name = "contatto")
    public void setContatti(List<XmlContatto> contatti) {
        this.contatti = contatti;
    }

    public List<XmlContatto> getContatti() {
        return contatti;
    }
    
}
