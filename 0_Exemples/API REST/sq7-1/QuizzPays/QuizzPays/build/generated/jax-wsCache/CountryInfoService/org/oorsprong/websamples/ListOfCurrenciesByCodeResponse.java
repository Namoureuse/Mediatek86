
package org.oorsprong.websamples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfCurrenciesByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCurrency"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfCurrenciesByCodeResult"
})
@XmlRootElement(name = "ListOfCurrenciesByCodeResponse")
public class ListOfCurrenciesByCodeResponse {

    @XmlElement(name = "ListOfCurrenciesByCodeResult", required = true)
    protected ArrayOftCurrency listOfCurrenciesByCodeResult;

    /**
     * Obtient la valeur de la propriété listOfCurrenciesByCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public ArrayOftCurrency getListOfCurrenciesByCodeResult() {
        return listOfCurrenciesByCodeResult;
    }

    /**
     * Définit la valeur de la propriété listOfCurrenciesByCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public void setListOfCurrenciesByCodeResult(ArrayOftCurrency value) {
        this.listOfCurrenciesByCodeResult = value;
    }

}
