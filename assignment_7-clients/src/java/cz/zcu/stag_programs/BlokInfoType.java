
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blokInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="blokInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="blokIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="sespIdno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="nazev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="statut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="minKred" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="maxKred" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="minPocetPredmetu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="poznamka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="rokPlatnosti" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blokInfoType", propOrder = {
    "blokIdno",
    "sespIdno",
    "nazev",
    "statut",
    "minKred",
    "maxKred",
    "minPocetPredmetu",
    "poznamka",
    "rokPlatnosti"
})
public class BlokInfoType {

    protected long blokIdno;
    protected Long sespIdno;
    @XmlElement(required = true)
    protected String nazev;
    @XmlElement(required = true)
    protected String statut;
    protected Integer minKred;
    protected Integer maxKred;
    protected Integer minPocetPredmetu;
    protected String poznamka;
    @XmlElement(required = true)
    protected String rokPlatnosti;

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
     * Gets the value of the sespIdno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSespIdno() {
        return sespIdno;
    }

    /**
     * Sets the value of the sespIdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSespIdno(Long value) {
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
     * Gets the value of the statut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatut() {
        return statut;
    }

    /**
     * Sets the value of the statut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatut(String value) {
        this.statut = value;
    }

    /**
     * Gets the value of the minKred property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinKred() {
        return minKred;
    }

    /**
     * Sets the value of the minKred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinKred(Integer value) {
        this.minKred = value;
    }

    /**
     * Gets the value of the maxKred property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxKred() {
        return maxKred;
    }

    /**
     * Sets the value of the maxKred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxKred(Integer value) {
        this.maxKred = value;
    }

    /**
     * Gets the value of the minPocetPredmetu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinPocetPredmetu() {
        return minPocetPredmetu;
    }

    /**
     * Sets the value of the minPocetPredmetu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinPocetPredmetu(Integer value) {
        this.minPocetPredmetu = value;
    }

    /**
     * Gets the value of the poznamka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoznamka() {
        return poznamka;
    }

    /**
     * Sets the value of the poznamka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoznamka(String value) {
        this.poznamka = value;
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

}
