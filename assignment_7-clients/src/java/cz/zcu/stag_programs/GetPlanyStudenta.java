
package cz.zcu.stag_ws;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPlanyStudenta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getPlanyStudenta">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="osCislo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="rok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlanyStudenta", propOrder = {
    "osCislo",
    "rok",
    "lang"
})
public class GetPlanyStudenta {

    @XmlElement(required = true)
    protected String osCislo;
    @XmlElementRef(name = "rok", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rok;
    @XmlElementRef(name = "lang", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lang;

    /**
     * Gets the value of the osCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsCislo() {
        return osCislo;
    }

    /**
     * Sets the value of the osCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsCislo(String value) {
        this.osCislo = value;
    }

    /**
     * Gets the value of the rok property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRok() {
        return rok;
    }

    /**
     * Sets the value of the rok property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRok(JAXBElement<String> value) {
        this.rok = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLang(JAXBElement<String> value) {
        this.lang = value;
    }

}
