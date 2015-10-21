package adaldosso.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Alberto Dal Dosso
 */

@XmlType
@XmlRootElement( name = "contatto" )
public class XmlContatto {
    
    private String nome;

    @XmlElement(name="nome")
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
