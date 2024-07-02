
package cz.zcu.stag_ws;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSegmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getSegmentInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sespIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "getSegmentInfo", propOrder = {
    "sespIdno",
    "lang"
})
public class GetSegmentInfo {

    protected long sespIdno;
    @XmlElementRef(name = "lang", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lang;

    /**
     * Gets the value of the sespIdno property.
     * 
     */
    public long getSespIdno() {
        return sespIdno;
    }

    /**
     * Sets the value of the sespIdno property.
     * 
     */
    public void setSespIdno(long value) {
        this.sespIdno = value;
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
