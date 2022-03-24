
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour somme complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="somme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="val1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="val2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somme", propOrder = {
    "val1",
    "val2"
})
public class Somme {

    protected int val1;
    protected int val2;

    /**
     * Obtient la valeur de la propriété val1.
     * 
     */
    public int getVal1() {
        return val1;
    }

    /**
     * Définit la valeur de la propriété val1.
     * 
     */
    public void setVal1(int value) {
        this.val1 = value;
    }

    /**
     * Obtient la valeur de la propriété val2.
     * 
     */
    public int getVal2() {
        return val2;
    }

    /**
     * Définit la valeur de la propriété val2.
     * 
     */
    public void setVal2(int value) {
        this.val2 = value;
    }

}
