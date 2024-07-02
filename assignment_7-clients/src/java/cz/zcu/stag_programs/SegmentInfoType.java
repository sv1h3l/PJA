
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="segmentInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sespIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="nazev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nazevModulu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zkratka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rokPlatnosti" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="minCrdBBloku" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="minPocetAbsBBloku" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentInfoType", propOrder = {
    "sespIdno",
    "nazev",
    "nazevModulu",
    "zkratka",
    "rokPlatnosti",
    "minCrdBBloku",
    "minPocetAbsBBloku"
})
public class SegmentInfoType {

    protected long sespIdno;
    @XmlElement(required = true)
    protected String nazev;
    protected String nazevModulu;
    protected String zkratka;
    @XmlElement(required = true)
    protected String rokPlatnosti;
    protected Integer minCrdBBloku;
    protected Integer minPocetAbsBBloku;

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
     * Gets the value of the nazev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazev() {
        return nazev;
    }

    /**
     * Sets the value of the nazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazev(String value) {
        this.nazev = value;
    }

    /**
     * Gets the value of the nazevModulu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevModulu() {
        return nazevModulu;
    }

    /**
     * Sets the value of the nazevModulu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevModulu(String value) {
        this.nazevModulu = value;
    }

    /**
     * Gets the value of the zkratka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZkratka() {
        return zkratka;
    }

    /**
     * Sets the value of the zkratka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZkratka(String value) {
        this.zkratka = value;
    }

    /**
     * Gets the value of the rokPlatnosti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRokPlatnosti() {
        return rokPlatnosti;
    }

    /**
     * Sets the value of the rokPlatnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRokPlatnosti(String value) {
        this.rokPlatnosti = value;
    }

    /**
     * Gets the value of the minCrdBBloku property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinCrdBBloku() {
        return minCrdBBloku;
    }

    /**
     * Sets the value of the minCrdBBloku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinCrdBBloku(Integer value) {
        this.minCrdBBloku = value;
    }

    /**
     * Gets the value of the minPocetAbsBBloku property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinPocetAbsBBloku() {
        return minPocetAbsBBloku;
    }

    /**
     * Sets the value of the minPocetAbsBBloku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinPocetAbsBBloku(Integer value) {
        this.minPocetAbsBBloku = value;
    }

}
