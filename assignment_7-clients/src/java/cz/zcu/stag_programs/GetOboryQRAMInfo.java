
package cz.zcu.stag_ws;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOboryQRAMInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getOboryQRAMInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oborIdno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="fakulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rok" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="forma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="jazyk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pouzePlatne" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOboryQRAMInfo", propOrder = {
    "oborIdno",
    "fakulta",
    "rok",
    "forma",
    "typ",
    "jazyk",
    "pouzePlatne"
})
public class GetOboryQRAMInfo {

    @XmlElementRef(name = "oborIdno", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> oborIdno;
    @XmlElementRef(name = "fakulta", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fakulta;
    @XmlElementRef(name = "rok", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rok;
    @XmlElementRef(name = "forma", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forma;
    @XmlElementRef(name = "typ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typ;
    @XmlElementRef(name = "jazyk", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jazyk;
    @XmlElementRef(name = "pouzePlatne", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> pouzePlatne;

    /**
     * Gets the value of the oborIdno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOborIdno() {
        return oborIdno;
    }

    /**
     * Sets the value of the oborIdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOborIdno(JAXBElement<Long> value) {
        this.oborIdno = value;
    }

    /**
     * Gets the value of the fakulta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFakulta() {
        return fakulta;
    }

    /**
     * Sets the value of the fakulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFakulta(JAXBElement<String> value) {
        this.fakulta = value;
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
     * Gets the value of the forma property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForma() {
        return forma;
    }

    /**
     * Sets the value of the forma property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForma(JAXBElement<String> value) {
        this.forma = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTyp(JAXBElement<String> value) {
        this.typ = value;
    }

    /**
     * Gets the value of the jazyk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJazyk() {
        return jazyk;
    }

    /**
     * Sets the value of the jazyk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJazyk(JAXBElement<String> value) {
        this.jazyk = value;
    }

    /**
     * Gets the value of the pouzePlatne property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPouzePlatne() {
        return pouzePlatne;
    }

    /**
     * Sets the value of the pouzePlatne property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPouzePlatne(JAXBElement<Boolean> value) {
        this.pouzePlatne = value;
    }

}
