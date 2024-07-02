
package cz.zcu.stag_ws;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBlokInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getBlokInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="blokIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "getBlokInfo", propOrder = {
    "blokIdno",
    "lang"
})
public class GetBlokInfo {

    protected long blokIdno;
    @XmlElementRef(name = "lang", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lang;

    /**
     * Gets the value of the blokIdno property.
     * 
     */
    public long getBlokIdno() {
        return blokIdno;
    }

    /**
     * Sets the value of the blokIdno property.
     * 
     */
    public void setBlokIdno(long value) {
        this.blokIdno = value;
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
