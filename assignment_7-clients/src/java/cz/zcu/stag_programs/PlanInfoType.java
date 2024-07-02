
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for planInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="planInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stplIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="oborIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="nazev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kreditne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="limitKreditu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="etapa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pocetSemestru" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="rokPlatnosti" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="verze" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="poznamka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="specializace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vyucJazyk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="poradi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ectsZobrazit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planInfoType", propOrder = {
    "stplIdno",
    "oborIdno",
    "nazev",
    "kreditne",
    "limitKreditu",
    "etapa",
    "pocetSemestru",
    "rokPlatnosti",
    "verze",
    "poznamka",
    "specializace",
    "vyucJazyk",
    "poradi",
    "ectsZobrazit"
})
public class PlanInfoType {

    protected long stplIdno;
    protected long oborIdno;
    @XmlElement(required = true)
    protected String nazev;
    protected String kreditne;
    protected Integer limitKreditu;
    protected Integer etapa;
    protected Integer pocetSemestru;
    @XmlElement(required = true)
    protected String rokPlatnosti;
    @XmlElement(required = true)
    protected String verze;
    protected String poznamka;
    protected String specializace;
    protected String vyucJazyk;
    protected Integer poradi;
    protected String ectsZobrazit;

    /**
     * Gets the value of the stplIdno property.
     * 
     */
    public long getStplIdno() {
        return stplIdno;
    }

    /**
     * Sets the value of the stplIdno property.
     * 
     */
    public void setStplIdno(long value) {
        this.stplIdno = value;
    }

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
     * Gets the value of the kreditne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKreditne() {
        return kreditne;
    }

    /**
     * Sets the value of the kreditne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKreditne(String value) {
        this.kreditne = value;
    }

    /**
     * Gets the value of the limitKreditu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimitKreditu() {
        return limitKreditu;
    }

    /**
     * Sets the value of the limitKreditu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimitKreditu(Integer value) {
        this.limitKreditu = value;
    }

    /**
     * Gets the value of the etapa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEtapa() {
        return etapa;
    }

    /**
     * Sets the value of the etapa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEtapa(Integer value) {
        this.etapa = value;
    }

    /**
     * Gets the value of the pocetSemestru property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPocetSemestru() {
        return pocetSemestru;
    }

    /**
     * Sets the value of the pocetSemestru property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPocetSemestru(Integer value) {
        this.pocetSemestru = value;
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
     * Gets the value of the verze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerze() {
        return verze;
    }

    /**
     * Sets the value of the verze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerze(String value) {
        this.verze = value;
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
     * Gets the value of the specializace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecializace() {
        return specializace;
    }

    /**
     * Sets the value of the specializace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecializace(String value) {
        this.specializace = value;
    }

    /**
     * Gets the value of the vyucJazyk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyucJazyk() {
        return vyucJazyk;
    }

    /**
     * Sets the value of the vyucJazyk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyucJazyk(String value) {
        this.vyucJazyk = value;
    }

    /**
     * Gets the value of the poradi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoradi() {
        return poradi;
    }

    /**
     * Sets the value of the poradi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoradi(Integer value) {
        this.poradi = value;
    }

    /**
     * Gets the value of the ectsZobrazit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEctsZobrazit() {
        return ectsZobrazit;
    }

    /**
     * Sets the value of the ectsZobrazit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEctsZobrazit(String value) {
        this.ectsZobrazit = value;
    }

}
