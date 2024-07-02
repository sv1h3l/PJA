
package cz.zcu.stag_ws;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPlanyOboru complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getPlanyOboru">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oborIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "getPlanyOboru", propOrder = {
    "oborIdno",
    "rok",
    "lang"
})
public class GetPlanyOboru {

    protected long oborIdno;
    @XmlElementRef(name = "rok", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rok;
    @XmlElementRef(name = "lang", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lang;

    /**
     * Gets the value of the oborIdno property.
     * 
     */
    public long getOborIdno() {
        return oborIdno;
    }

    /**
     * Sets the value of the oborIdno property.
     * 
     */
    public void setOborIdno(long value) {
        this.oborIdno = value;
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
