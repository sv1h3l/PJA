
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oborQRAMInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="oborQRAMInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oborIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="nazevCZ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nazevEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cisloOboru" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cisloSpecializace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kodIsced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="zkratka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="garantujiciKatedra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="garantOboruUcitIdno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="garantOboruCeleJmeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fakultaOboru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="forma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="jazyk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fakulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kodProgramu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="anotaceCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="anotaceEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profesniProfilyAbsolventuCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profesniProfilyAbsolventuEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kvalifikacniPozadavkyCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kvalifikacniPozadavkyEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladyZnalostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladyZnalostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vystupyZnalostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vystupyZnalostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladyDovednostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladyDovednostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vystupyDovednostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vystupyDovednostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladyZpusobilostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladyZpusobilostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vystupyZpusobilostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vystupyZpusobilostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="oblastVzdelavaniCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="oblastVzdelavaniEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vyucMetodyZnalostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vyucMetodyZnalostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vyucMetodyDovednostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vyucMetodyDovednostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vyucMetodyZpusobilostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vyucMetodyZpusobilostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hodMetodyZnalostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hodMetodyZnalostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hodMetodyDovednostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hodMetodyDovednostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hodMetodyZpusobilostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="hodMetodyZpusobilostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyNaPrijetiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyNaPrijetiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyNaPrijetiURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pocetPrijimanych" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pocetPrijimanychPoznamka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadovanaZdrZpusobilostCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadovanaZdrZpusobilostEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilProgramuCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilProgramuEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vzdelavaciCileOboruCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vzdelavaciCileOboruEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilAbsolventaCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilAbsolventaEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladUplatnitelnostiCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladUplatnitelnostiEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniUznavaciO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="moznePracovniPoziceCZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="moznePracovniPoziceEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="poznamkaVerejna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="akreditaceCislo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="akreditaceOd" type="{http://stag-ws.zcu.cz/}xmlDateType" minOccurs="0"/>
 *         <element name="akreditaceDo" type="{http://stag-ws.zcu.cz/}xmlDateType" minOccurs="0"/>
 *         <element name="akreditovanoPodleZakona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tiskSpecializaceDiplomDs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oborQRAMInfoType", propOrder = {
    "oborIdno",
    "nazevCZ",
    "nazevEN",
    "cisloOboru",
    "cisloSpecializace",
    "kodIsced",
    "zkratka",
    "garantujiciKatedra",
    "garantOboruUcitIdno",
    "garantOboruCeleJmeno",
    "fakultaOboru",
    "typ",
    "forma",
    "jazyk",
    "fakulta",
    "kodProgramu",
    "anotaceCZ",
    "anotaceEN",
    "profesniProfilyAbsolventuCZ",
    "profesniProfilyAbsolventuEN",
    "kvalifikacniPozadavkyCZ",
    "kvalifikacniPozadavkyEN",
    "predpokladyZnalostiCZ",
    "predpokladyZnalostiEN",
    "vystupyZnalostiCZ",
    "vystupyZnalostiEN",
    "predpokladyDovednostiCZ",
    "predpokladyDovednostiEN",
    "vystupyDovednostiCZ",
    "vystupyDovednostiEN",
    "predpokladyZpusobilostiCZ",
    "predpokladyZpusobilostiEN",
    "vystupyZpusobilostiCZ",
    "vystupyZpusobilostiEN",
    "oblastVzdelavaniCZ",
    "oblastVzdelavaniEN",
    "vyucMetodyZnalostiCZ",
    "vyucMetodyZnalostiEN",
    "vyucMetodyDovednostiCZ",
    "vyucMetodyDovednostiEN",
    "vyucMetodyZpusobilostiCZ",
    "vyucMetodyZpusobilostiEN",
    "hodMetodyZnalostiCZ",
    "hodMetodyZnalostiEN",
    "hodMetodyDovednostiCZ",
    "hodMetodyDovednostiEN",
    "hodMetodyZpusobilostiCZ",
    "hodMetodyZpusobilostiEN",
    "pozadavkyNaPrijetiCZ",
    "pozadavkyNaPrijetiEN",
    "pozadavkyNaPrijetiURL",
    "pocetPrijimanych",
    "pocetPrijimanychPoznamka",
    "pozadovanaZdrZpusobilostCZ",
    "pozadovanaZdrZpusobilostEN",
    "profilProgramuCZ",
    "profilProgramuEN",
    "vzdelavaciCileOboruCZ",
    "vzdelavaciCileOboruEN",
    "profilAbsolventaCZ",
    "profilAbsolventaEN",
    "predpokladUplatnitelnostiCZ",
    "predpokladUplatnitelnostiEN",
    "regulovanePovolaniCZ",
    "regulovanePovolaniEN",
    "regulovanePovolaniUznavaciO",
    "moznePracovniPoziceCZ",
    "moznePracovniPoziceEN",
    "poznamkaVerejna",
    "akreditaceCislo",
    "akreditaceOd",
    "akreditaceDo",
    "akreditovanoPodleZakona",
    "tiskSpecializaceDiplomDs"
})
public class OborQRAMInfoType {

    protected long oborIdno;
    @XmlElement(required = true)
    protected String nazevCZ;
    @XmlElement(required = true)
    protected String nazevEN;
    @XmlElement(required = true)
    protected String cisloOboru;
    @XmlElement(required = true)
    protected String cisloSpecializace;
    protected String kodIsced;
    protected String zkratka;
    protected String garantujiciKatedra;
    protected Long garantOboruUcitIdno;
    protected String garantOboruCeleJmeno;
    protected String fakultaOboru;
    @XmlElement(required = true)
    protected String typ;
    @XmlElement(required = true)
    protected String forma;
    @XmlElement(required = true)
    protected String jazyk;
    @XmlElement(required = true)
    protected String fakulta;
    protected String kodProgramu;
    protected String anotaceCZ;
    protected String anotaceEN;
    protected String profesniProfilyAbsolventuCZ;
    protected String profesniProfilyAbsolventuEN;
    protected String kvalifikacniPozadavkyCZ;
    protected String kvalifikacniPozadavkyEN;
    protected String predpokladyZnalostiCZ;
    protected String predpokladyZnalostiEN;
    protected String vystupyZnalostiCZ;
    protected String vystupyZnalostiEN;
    protected String predpokladyDovednostiCZ;
    protected String predpokladyDovednostiEN;
    protected String vystupyDovednostiCZ;
    protected String vystupyDovednostiEN;
    protected String predpokladyZpusobilostiCZ;
    protected String predpokladyZpusobilostiEN;
    protected String vystupyZpusobilostiCZ;
    protected String vystupyZpusobilostiEN;
    protected String oblastVzdelavaniCZ;
    protected String oblastVzdelavaniEN;
    protected String vyucMetodyZnalostiCZ;
    protected String vyucMetodyZnalostiEN;
    protected String vyucMetodyDovednostiCZ;
    protected String vyucMetodyDovednostiEN;
    protected String vyucMetodyZpusobilostiCZ;
    protected String vyucMetodyZpusobilostiEN;
    protected String hodMetodyZnalostiCZ;
    protected String hodMetodyZnalostiEN;
    protected String hodMetodyDovednostiCZ;
    protected String hodMetodyDovednostiEN;
    protected String hodMetodyZpusobilostiCZ;
    protected String hodMetodyZpusobilostiEN;
    protected String pozadavkyNaPrijetiCZ;
    protected String pozadavkyNaPrijetiEN;
    protected String pozadavkyNaPrijetiURL;
    protected String pocetPrijimanych;
    protected String pocetPrijimanychPoznamka;
    protected String pozadovanaZdrZpusobilostCZ;
    protected String pozadovanaZdrZpusobilostEN;
    protected String profilProgramuCZ;
    protected String profilProgramuEN;
    protected String vzdelavaciCileOboruCZ;
    protected String vzdelavaciCileOboruEN;
    protected String profilAbsolventaCZ;
    protected String profilAbsolventaEN;
    protected String predpokladUplatnitelnostiCZ;
    protected String predpokladUplatnitelnostiEN;
    protected String regulovanePovolaniCZ;
    protected String regulovanePovolaniEN;
    protected String regulovanePovolaniUznavaciO;
    protected String moznePracovniPoziceCZ;
    protected String moznePracovniPoziceEN;
    protected String poznamkaVerejna;
    protected String akreditaceCislo;
    protected String akreditaceOd;
    protected String akreditaceDo;
    protected String akreditovanoPodleZakona;
    protected String tiskSpecializaceDiplomDs;

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
     * Gets the value of the nazevCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevCZ() {
        return nazevCZ;
    }

    /**
     * Sets the value of the nazevCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevCZ(String value) {
        this.nazevCZ = value;
    }

    /**
     * Gets the value of the nazevEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevEN() {
        return nazevEN;
    }

    /**
     * Sets the value of the nazevEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevEN(String value) {
        this.nazevEN = value;
    }

    /**
     * Gets the value of the cisloOboru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloOboru() {
        return cisloOboru;
    }

    /**
     * Sets the value of the cisloOboru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloOboru(String value) {
        this.cisloOboru = value;
    }

    /**
     * Gets the value of the cisloSpecializace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloSpecializace() {
        return cisloSpecializace;
    }

    /**
     * Sets the value of the cisloSpecializace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloSpecializace(String value) {
        this.cisloSpecializace = value;
    }

    /**
     * Gets the value of the kodIsced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodIsced() {
        return kodIsced;
    }

    /**
     * Sets the value of the kodIsced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodIsced(String value) {
        this.kodIsced = value;
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
     * Gets the value of the garantujiciKatedra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGarantujiciKatedra() {
        return garantujiciKatedra;
    }

    /**
     * Sets the value of the garantujiciKatedra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGarantujiciKatedra(String value) {
        this.garantujiciKatedra = value;
    }

    /**
     * Gets the value of the garantOboruUcitIdno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGarantOboruUcitIdno() {
        return garantOboruUcitIdno;
    }

    /**
     * Sets the value of the garantOboruUcitIdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGarantOboruUcitIdno(Long value) {
        this.garantOboruUcitIdno = value;
    }

    /**
     * Gets the value of the garantOboruCeleJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGarantOboruCeleJmeno() {
        return garantOboruCeleJmeno;
    }

    /**
     * Sets the value of the garantOboruCeleJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGarantOboruCeleJmeno(String value) {
        this.garantOboruCeleJmeno = value;
    }

    /**
     * Gets the value of the fakultaOboru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFakultaOboru() {
        return fakultaOboru;
    }

    /**
     * Sets the value of the fakultaOboru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFakultaOboru(String value) {
        this.fakultaOboru = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the forma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForma() {
        return forma;
    }

    /**
     * Sets the value of the forma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForma(String value) {
        this.forma = value;
    }

    /**
     * Gets the value of the jazyk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJazyk() {
        return jazyk;
    }

    /**
     * Sets the value of the jazyk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJazyk(String value) {
        this.jazyk = value;
    }

    /**
     * Gets the value of the fakulta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFakulta() {
        return fakulta;
    }

    /**
     * Sets the value of the fakulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFakulta(String value) {
        this.fakulta = value;
    }

    /**
     * Gets the value of the kodProgramu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodProgramu() {
        return kodProgramu;
    }

    /**
     * Sets the value of the kodProgramu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodProgramu(String value) {
        this.kodProgramu = value;
    }

    /**
     * Gets the value of the anotaceCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotaceCZ() {
        return anotaceCZ;
    }

    /**
     * Sets the value of the anotaceCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotaceCZ(String value) {
        this.anotaceCZ = value;
    }

    /**
     * Gets the value of the anotaceEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotaceEN() {
        return anotaceEN;
    }

    /**
     * Sets the value of the anotaceEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotaceEN(String value) {
        this.anotaceEN = value;
    }

    /**
     * Gets the value of the profesniProfilyAbsolventuCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfesniProfilyAbsolventuCZ() {
        return profesniProfilyAbsolventuCZ;
    }

    /**
     * Sets the value of the profesniProfilyAbsolventuCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfesniProfilyAbsolventuCZ(String value) {
        this.profesniProfilyAbsolventuCZ = value;
    }

    /**
     * Gets the value of the profesniProfilyAbsolventuEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfesniProfilyAbsolventuEN() {
        return profesniProfilyAbsolventuEN;
    }

    /**
     * Sets the value of the profesniProfilyAbsolventuEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfesniProfilyAbsolventuEN(String value) {
        this.profesniProfilyAbsolventuEN = value;
    }

    /**
     * Gets the value of the kvalifikacniPozadavkyCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvalifikacniPozadavkyCZ() {
        return kvalifikacniPozadavkyCZ;
    }

    /**
     * Sets the value of the kvalifikacniPozadavkyCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvalifikacniPozadavkyCZ(String value) {
        this.kvalifikacniPozadavkyCZ = value;
    }

    /**
     * Gets the value of the kvalifikacniPozadavkyEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvalifikacniPozadavkyEN() {
        return kvalifikacniPozadavkyEN;
    }

    /**
     * Sets the value of the kvalifikacniPozadavkyEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvalifikacniPozadavkyEN(String value) {
        this.kvalifikacniPozadavkyEN = value;
    }

    /**
     * Gets the value of the predpokladyZnalostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladyZnalostiCZ() {
        return predpokladyZnalostiCZ;
    }

    /**
     * Sets the value of the predpokladyZnalostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladyZnalostiCZ(String value) {
        this.predpokladyZnalostiCZ = value;
    }

    /**
     * Gets the value of the predpokladyZnalostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladyZnalostiEN() {
        return predpokladyZnalostiEN;
    }

    /**
     * Sets the value of the predpokladyZnalostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladyZnalostiEN(String value) {
        this.predpokladyZnalostiEN = value;
    }

    /**
     * Gets the value of the vystupyZnalostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVystupyZnalostiCZ() {
        return vystupyZnalostiCZ;
    }

    /**
     * Sets the value of the vystupyZnalostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVystupyZnalostiCZ(String value) {
        this.vystupyZnalostiCZ = value;
    }

    /**
     * Gets the value of the vystupyZnalostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVystupyZnalostiEN() {
        return vystupyZnalostiEN;
    }

    /**
     * Sets the value of the vystupyZnalostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVystupyZnalostiEN(String value) {
        this.vystupyZnalostiEN = value;
    }

    /**
     * Gets the value of the predpokladyDovednostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladyDovednostiCZ() {
        return predpokladyDovednostiCZ;
    }

    /**
     * Sets the value of the predpokladyDovednostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladyDovednostiCZ(String value) {
        this.predpokladyDovednostiCZ = value;
    }

    /**
     * Gets the value of the predpokladyDovednostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladyDovednostiEN() {
        return predpokladyDovednostiEN;
    }

    /**
     * Sets the value of the predpokladyDovednostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladyDovednostiEN(String value) {
        this.predpokladyDovednostiEN = value;
    }

    /**
     * Gets the value of the vystupyDovednostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVystupyDovednostiCZ() {
        return vystupyDovednostiCZ;
    }

    /**
     * Sets the value of the vystupyDovednostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVystupyDovednostiCZ(String value) {
        this.vystupyDovednostiCZ = value;
    }

    /**
     * Gets the value of the vystupyDovednostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVystupyDovednostiEN() {
        return vystupyDovednostiEN;
    }

    /**
     * Sets the value of the vystupyDovednostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVystupyDovednostiEN(String value) {
        this.vystupyDovednostiEN = value;
    }

    /**
     * Gets the value of the predpokladyZpusobilostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladyZpusobilostiCZ() {
        return predpokladyZpusobilostiCZ;
    }

    /**
     * Sets the value of the predpokladyZpusobilostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladyZpusobilostiCZ(String value) {
        this.predpokladyZpusobilostiCZ = value;
    }

    /**
     * Gets the value of the predpokladyZpusobilostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladyZpusobilostiEN() {
        return predpokladyZpusobilostiEN;
    }

    /**
     * Sets the value of the predpokladyZpusobilostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladyZpusobilostiEN(String value) {
        this.predpokladyZpusobilostiEN = value;
    }

    /**
     * Gets the value of the vystupyZpusobilostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVystupyZpusobilostiCZ() {
        return vystupyZpusobilostiCZ;
    }

    /**
     * Sets the value of the vystupyZpusobilostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVystupyZpusobilostiCZ(String value) {
        this.vystupyZpusobilostiCZ = value;
    }

    /**
     * Gets the value of the vystupyZpusobilostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVystupyZpusobilostiEN() {
        return vystupyZpusobilostiEN;
    }

    /**
     * Sets the value of the vystupyZpusobilostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVystupyZpusobilostiEN(String value) {
        this.vystupyZpusobilostiEN = value;
    }

    /**
     * Gets the value of the oblastVzdelavaniCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblastVzdelavaniCZ() {
        return oblastVzdelavaniCZ;
    }

    /**
     * Sets the value of the oblastVzdelavaniCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblastVzdelavaniCZ(String value) {
        this.oblastVzdelavaniCZ = value;
    }

    /**
     * Gets the value of the oblastVzdelavaniEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblastVzdelavaniEN() {
        return oblastVzdelavaniEN;
    }

    /**
     * Sets the value of the oblastVzdelavaniEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblastVzdelavaniEN(String value) {
        this.oblastVzdelavaniEN = value;
    }

    /**
     * Gets the value of the vyucMetodyZnalostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyucMetodyZnalostiCZ() {
        return vyucMetodyZnalostiCZ;
    }

    /**
     * Sets the value of the vyucMetodyZnalostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyucMetodyZnalostiCZ(String value) {
        this.vyucMetodyZnalostiCZ = value;
    }

    /**
     * Gets the value of the vyucMetodyZnalostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyucMetodyZnalostiEN() {
        return vyucMetodyZnalostiEN;
    }

    /**
     * Sets the value of the vyucMetodyZnalostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyucMetodyZnalostiEN(String value) {
        this.vyucMetodyZnalostiEN = value;
    }

    /**
     * Gets the value of the vyucMetodyDovednostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyucMetodyDovednostiCZ() {
        return vyucMetodyDovednostiCZ;
    }

    /**
     * Sets the value of the vyucMetodyDovednostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyucMetodyDovednostiCZ(String value) {
        this.vyucMetodyDovednostiCZ = value;
    }

    /**
     * Gets the value of the vyucMetodyDovednostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyucMetodyDovednostiEN() {
        return vyucMetodyDovednostiEN;
    }

    /**
     * Sets the value of the vyucMetodyDovednostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyucMetodyDovednostiEN(String value) {
        this.vyucMetodyDovednostiEN = value;
    }

    /**
     * Gets the value of the vyucMetodyZpusobilostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyucMetodyZpusobilostiCZ() {
        return vyucMetodyZpusobilostiCZ;
    }

    /**
     * Sets the value of the vyucMetodyZpusobilostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyucMetodyZpusobilostiCZ(String value) {
        this.vyucMetodyZpusobilostiCZ = value;
    }

    /**
     * Gets the value of the vyucMetodyZpusobilostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyucMetodyZpusobilostiEN() {
        return vyucMetodyZpusobilostiEN;
    }

    /**
     * Sets the value of the vyucMetodyZpusobilostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyucMetodyZpusobilostiEN(String value) {
        this.vyucMetodyZpusobilostiEN = value;
    }

    /**
     * Gets the value of the hodMetodyZnalostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHodMetodyZnalostiCZ() {
        return hodMetodyZnalostiCZ;
    }

    /**
     * Sets the value of the hodMetodyZnalostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHodMetodyZnalostiCZ(String value) {
        this.hodMetodyZnalostiCZ = value;
    }

    /**
     * Gets the value of the hodMetodyZnalostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHodMetodyZnalostiEN() {
        return hodMetodyZnalostiEN;
    }

    /**
     * Sets the value of the hodMetodyZnalostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHodMetodyZnalostiEN(String value) {
        this.hodMetodyZnalostiEN = value;
    }

    /**
     * Gets the value of the hodMetodyDovednostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHodMetodyDovednostiCZ() {
        return hodMetodyDovednostiCZ;
    }

    /**
     * Sets the value of the hodMetodyDovednostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHodMetodyDovednostiCZ(String value) {
        this.hodMetodyDovednostiCZ = value;
    }

    /**
     * Gets the value of the hodMetodyDovednostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHodMetodyDovednostiEN() {
        return hodMetodyDovednostiEN;
    }

    /**
     * Sets the value of the hodMetodyDovednostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHodMetodyDovednostiEN(String value) {
        this.hodMetodyDovednostiEN = value;
    }

    /**
     * Gets the value of the hodMetodyZpusobilostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHodMetodyZpusobilostiCZ() {
        return hodMetodyZpusobilostiCZ;
    }

    /**
     * Sets the value of the hodMetodyZpusobilostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHodMetodyZpusobilostiCZ(String value) {
        this.hodMetodyZpusobilostiCZ = value;
    }

    /**
     * Gets the value of the hodMetodyZpusobilostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHodMetodyZpusobilostiEN() {
        return hodMetodyZpusobilostiEN;
    }

    /**
     * Sets the value of the hodMetodyZpusobilostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHodMetodyZpusobilostiEN(String value) {
        this.hodMetodyZpusobilostiEN = value;
    }

    /**
     * Gets the value of the pozadavkyNaPrijetiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyNaPrijetiCZ() {
        return pozadavkyNaPrijetiCZ;
    }

    /**
     * Sets the value of the pozadavkyNaPrijetiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyNaPrijetiCZ(String value) {
        this.pozadavkyNaPrijetiCZ = value;
    }

    /**
     * Gets the value of the pozadavkyNaPrijetiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyNaPrijetiEN() {
        return pozadavkyNaPrijetiEN;
    }

    /**
     * Sets the value of the pozadavkyNaPrijetiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyNaPrijetiEN(String value) {
        this.pozadavkyNaPrijetiEN = value;
    }

    /**
     * Gets the value of the pozadavkyNaPrijetiURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyNaPrijetiURL() {
        return pozadavkyNaPrijetiURL;
    }

    /**
     * Sets the value of the pozadavkyNaPrijetiURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyNaPrijetiURL(String value) {
        this.pozadavkyNaPrijetiURL = value;
    }

    /**
     * Gets the value of the pocetPrijimanych property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPocetPrijimanych() {
        return pocetPrijimanych;
    }

    /**
     * Sets the value of the pocetPrijimanych property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPocetPrijimanych(String value) {
        this.pocetPrijimanych = value;
    }

    /**
     * Gets the value of the pocetPrijimanychPoznamka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPocetPrijimanychPoznamka() {
        return pocetPrijimanychPoznamka;
    }

    /**
     * Sets the value of the pocetPrijimanychPoznamka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPocetPrijimanychPoznamka(String value) {
        this.pocetPrijimanychPoznamka = value;
    }

    /**
     * Gets the value of the pozadovanaZdrZpusobilostCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadovanaZdrZpusobilostCZ() {
        return pozadovanaZdrZpusobilostCZ;
    }

    /**
     * Sets the value of the pozadovanaZdrZpusobilostCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadovanaZdrZpusobilostCZ(String value) {
        this.pozadovanaZdrZpusobilostCZ = value;
    }

    /**
     * Gets the value of the pozadovanaZdrZpusobilostEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadovanaZdrZpusobilostEN() {
        return pozadovanaZdrZpusobilostEN;
    }

    /**
     * Sets the value of the pozadovanaZdrZpusobilostEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadovanaZdrZpusobilostEN(String value) {
        this.pozadovanaZdrZpusobilostEN = value;
    }

    /**
     * Gets the value of the profilProgramuCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilProgramuCZ() {
        return profilProgramuCZ;
    }

    /**
     * Sets the value of the profilProgramuCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilProgramuCZ(String value) {
        this.profilProgramuCZ = value;
    }

    /**
     * Gets the value of the profilProgramuEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilProgramuEN() {
        return profilProgramuEN;
    }

    /**
     * Sets the value of the profilProgramuEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilProgramuEN(String value) {
        this.profilProgramuEN = value;
    }

    /**
     * Gets the value of the vzdelavaciCileOboruCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVzdelavaciCileOboruCZ() {
        return vzdelavaciCileOboruCZ;
    }

    /**
     * Sets the value of the vzdelavaciCileOboruCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVzdelavaciCileOboruCZ(String value) {
        this.vzdelavaciCileOboruCZ = value;
    }

    /**
     * Gets the value of the vzdelavaciCileOboruEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVzdelavaciCileOboruEN() {
        return vzdelavaciCileOboruEN;
    }

    /**
     * Sets the value of the vzdelavaciCileOboruEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVzdelavaciCileOboruEN(String value) {
        this.vzdelavaciCileOboruEN = value;
    }

    /**
     * Gets the value of the profilAbsolventaCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilAbsolventaCZ() {
        return profilAbsolventaCZ;
    }

    /**
     * Sets the value of the profilAbsolventaCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilAbsolventaCZ(String value) {
        this.profilAbsolventaCZ = value;
    }

    /**
     * Gets the value of the profilAbsolventaEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilAbsolventaEN() {
        return profilAbsolventaEN;
    }

    /**
     * Sets the value of the profilAbsolventaEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilAbsolventaEN(String value) {
        this.profilAbsolventaEN = value;
    }

    /**
     * Gets the value of the predpokladUplatnitelnostiCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladUplatnitelnostiCZ() {
        return predpokladUplatnitelnostiCZ;
    }

    /**
     * Sets the value of the predpokladUplatnitelnostiCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladUplatnitelnostiCZ(String value) {
        this.predpokladUplatnitelnostiCZ = value;
    }

    /**
     * Gets the value of the predpokladUplatnitelnostiEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladUplatnitelnostiEN() {
        return predpokladUplatnitelnostiEN;
    }

    /**
     * Sets the value of the predpokladUplatnitelnostiEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladUplatnitelnostiEN(String value) {
        this.predpokladUplatnitelnostiEN = value;
    }

    /**
     * Gets the value of the regulovanePovolaniCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulovanePovolaniCZ() {
        return regulovanePovolaniCZ;
    }

    /**
     * Sets the value of the regulovanePovolaniCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulovanePovolaniCZ(String value) {
        this.regulovanePovolaniCZ = value;
    }

    /**
     * Gets the value of the regulovanePovolaniEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulovanePovolaniEN() {
        return regulovanePovolaniEN;
    }

    /**
     * Sets the value of the regulovanePovolaniEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulovanePovolaniEN(String value) {
        this.regulovanePovolaniEN = value;
    }

    /**
     * Gets the value of the regulovanePovolaniUznavaciO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulovanePovolaniUznavaciO() {
        return regulovanePovolaniUznavaciO;
    }

    /**
     * Sets the value of the regulovanePovolaniUznavaciO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulovanePovolaniUznavaciO(String value) {
        this.regulovanePovolaniUznavaciO = value;
    }

    /**
     * Gets the value of the moznePracovniPoziceCZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoznePracovniPoziceCZ() {
        return moznePracovniPoziceCZ;
    }

    /**
     * Sets the value of the moznePracovniPoziceCZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoznePracovniPoziceCZ(String value) {
        this.moznePracovniPoziceCZ = value;
    }

    /**
     * Gets the value of the moznePracovniPoziceEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoznePracovniPoziceEN() {
        return moznePracovniPoziceEN;
    }

    /**
     * Sets the value of the moznePracovniPoziceEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoznePracovniPoziceEN(String value) {
        this.moznePracovniPoziceEN = value;
    }

    /**
     * Gets the value of the poznamkaVerejna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoznamkaVerejna() {
        return poznamkaVerejna;
    }

    /**
     * Sets the value of the poznamkaVerejna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoznamkaVerejna(String value) {
        this.poznamkaVerejna = value;
    }

    /**
     * Gets the value of the akreditaceCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceCislo() {
        return akreditaceCislo;
    }

    /**
     * Sets the value of the akreditaceCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceCislo(String value) {
        this.akreditaceCislo = value;
    }

    /**
     * Gets the value of the akreditaceOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceOd() {
        return akreditaceOd;
    }

    /**
     * Sets the value of the akreditaceOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceOd(String value) {
        this.akreditaceOd = value;
    }

    /**
     * Gets the value of the akreditaceDo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceDo() {
        return akreditaceDo;
    }

    /**
     * Sets the value of the akreditaceDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceDo(String value) {
        this.akreditaceDo = value;
    }

    /**
     * Gets the value of the akreditovanoPodleZakona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditovanoPodleZakona() {
        return akreditovanoPodleZakona;
    }

    /**
     * Sets the value of the akreditovanoPodleZakona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditovanoPodleZakona(String value) {
        this.akreditovanoPodleZakona = value;
    }

    /**
     * Gets the value of the tiskSpecializaceDiplomDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiskSpecializaceDiplomDs() {
        return tiskSpecializaceDiplomDs;
    }

    /**
     * Sets the value of the tiskSpecializaceDiplomDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiskSpecializaceDiplomDs(String value) {
        this.tiskSpecializaceDiplomDs = value;
    }

}
