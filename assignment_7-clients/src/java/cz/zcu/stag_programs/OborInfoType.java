
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oborInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="oborInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oborIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="nazev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nazevCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nazevAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cisloOboru" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="cisloSpecializace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="forma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="jazyk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fakulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="platnyOd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="neplatnyOd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kodIsced" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="anotace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="anotaceCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="anotaceAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="limitKreditu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pocetEtap" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="maxDelka" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="stdDelka" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="stprIdno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="zkratka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="garant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="garantUcitIdno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="garant2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="garant2UcitIdno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="nazevProgramu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kodProgramu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilProgramu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="programAkreditacePoNovele" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="programAkreditovanSCislemOboru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vzdelavaciCile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profesniProfilyAbsolventu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kvalifikacniPozadavky" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyNaPrijetiCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyNaPrijetiAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyNaPrijetiUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pocetPrijimanych" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pocetPrijimanychPoznamka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadovanaZdrZpusobilostCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadovanaZdrZpusobilostAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilAbsolventaCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilAbsolventaAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladUplatitelnostiCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladUplatitelnostiAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="moznePracovniPoziceCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="moznePracovniPoziceAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniUznavaciO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="poznamkaVerejna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marketingDoplnkoveInf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marketingFormaStudia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marketingPopis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marketingPoznamka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marketingStudiumInf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="marketingUplatneni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nazevProDiplomCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nazevProDiplomAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oborInfoType", propOrder = {
    "oborIdno",
    "nazev",
    "nazevCz",
    "nazevAn",
    "cisloOboru",
    "cisloSpecializace",
    "typ",
    "forma",
    "jazyk",
    "fakulta",
    "platnyOd",
    "neplatnyOd",
    "kodIsced",
    "anotace",
    "anotaceCz",
    "anotaceAn",
    "limitKreditu",
    "pocetEtap",
    "maxDelka",
    "stdDelka",
    "stprIdno",
    "zkratka",
    "garant",
    "garantUcitIdno",
    "garant2",
    "garant2UcitIdno",
    "nazevProgramu",
    "kodProgramu",
    "profilProgramu",
    "programAkreditacePoNovele",
    "programAkreditovanSCislemOboru",
    "vzdelavaciCile",
    "profesniProfilyAbsolventu",
    "kvalifikacniPozadavky",
    "pozadavkyNaPrijetiCz",
    "pozadavkyNaPrijetiAn",
    "pozadavkyNaPrijetiUrl",
    "pocetPrijimanych",
    "pocetPrijimanychPoznamka",
    "pozadovanaZdrZpusobilostCz",
    "pozadovanaZdrZpusobilostAn",
    "profilAbsolventaCz",
    "profilAbsolventaAn",
    "predpokladUplatitelnostiCz",
    "predpokladUplatitelnostiAn",
    "moznePracovniPoziceCz",
    "moznePracovniPoziceAn",
    "regulovanePovolaniCz",
    "regulovanePovolaniAn",
    "regulovanePovolaniUznavaciO",
    "poznamkaVerejna",
    "marketingDoplnkoveInf",
    "marketingFormaStudia",
    "marketingPopis",
    "marketingPoznamka",
    "marketingStudiumInf",
    "marketingUplatneni",
    "nazevProDiplomCz",
    "nazevProDiplomAn"
})
public class OborInfoType {

    protected long oborIdno;
    @XmlElement(required = true)
    protected String nazev;
    protected String nazevCz;
    protected String nazevAn;
    @XmlElement(required = true)
    protected String cisloOboru;
    @XmlElement(required = true)
    protected String cisloSpecializace;
    @XmlElement(required = true)
    protected String typ;
    @XmlElement(required = true)
    protected String forma;
    @XmlElement(required = true)
    protected String jazyk;
    @XmlElement(required = true)
    protected String fakulta;
    protected String platnyOd;
    protected String neplatnyOd;
    @XmlElement(required = true)
    protected String kodIsced;
    protected String anotace;
    protected String anotaceCz;
    protected String anotaceAn;
    protected Integer limitKreditu;
    protected Integer pocetEtap;
    protected Double maxDelka;
    protected Double stdDelka;
    protected Long stprIdno;
    protected String zkratka;
    protected String garant;
    protected Long garantUcitIdno;
    protected String garant2;
    protected Long garant2UcitIdno;
    protected String nazevProgramu;
    protected String kodProgramu;
    protected String profilProgramu;
    protected String programAkreditacePoNovele;
    protected String programAkreditovanSCislemOboru;
    protected String vzdelavaciCile;
    protected String profesniProfilyAbsolventu;
    protected String kvalifikacniPozadavky;
    protected String pozadavkyNaPrijetiCz;
    protected String pozadavkyNaPrijetiAn;
    protected String pozadavkyNaPrijetiUrl;
    protected Integer pocetPrijimanych;
    protected String pocetPrijimanychPoznamka;
    protected String pozadovanaZdrZpusobilostCz;
    protected String pozadovanaZdrZpusobilostAn;
    protected String profilAbsolventaCz;
    protected String profilAbsolventaAn;
    protected String predpokladUplatitelnostiCz;
    protected String predpokladUplatitelnostiAn;
    protected String moznePracovniPoziceCz;
    protected String moznePracovniPoziceAn;
    protected String regulovanePovolaniCz;
    protected String regulovanePovolaniAn;
    protected String regulovanePovolaniUznavaciO;
    protected String poznamkaVerejna;
    protected String marketingDoplnkoveInf;
    protected String marketingFormaStudia;
    protected String marketingPopis;
    protected String marketingPoznamka;
    protected String marketingStudiumInf;
    protected String marketingUplatneni;
    protected String nazevProDiplomCz;
    protected String nazevProDiplomAn;

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
     * Gets the value of the nazevCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevCz() {
        return nazevCz;
    }

    /**
     * Sets the value of the nazevCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevCz(String value) {
        this.nazevCz = value;
    }

    /**
     * Gets the value of the nazevAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevAn() {
        return nazevAn;
    }

    /**
     * Sets the value of the nazevAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevAn(String value) {
        this.nazevAn = value;
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
     * Gets the value of the platnyOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatnyOd() {
        return platnyOd;
    }

    /**
     * Sets the value of the platnyOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatnyOd(String value) {
        this.platnyOd = value;
    }

    /**
     * Gets the value of the neplatnyOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeplatnyOd() {
        return neplatnyOd;
    }

    /**
     * Sets the value of the neplatnyOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeplatnyOd(String value) {
        this.neplatnyOd = value;
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
     * Gets the value of the anotace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotace() {
        return anotace;
    }

    /**
     * Sets the value of the anotace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotace(String value) {
        this.anotace = value;
    }

    /**
     * Gets the value of the anotaceCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotaceCz() {
        return anotaceCz;
    }

    /**
     * Sets the value of the anotaceCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotaceCz(String value) {
        this.anotaceCz = value;
    }

    /**
     * Gets the value of the anotaceAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotaceAn() {
        return anotaceAn;
    }

    /**
     * Sets the value of the anotaceAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotaceAn(String value) {
        this.anotaceAn = value;
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
     * Gets the value of the pocetEtap property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPocetEtap() {
        return pocetEtap;
    }

    /**
     * Sets the value of the pocetEtap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPocetEtap(Integer value) {
        this.pocetEtap = value;
    }

    /**
     * Gets the value of the maxDelka property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxDelka() {
        return maxDelka;
    }

    /**
     * Sets the value of the maxDelka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxDelka(Double value) {
        this.maxDelka = value;
    }

    /**
     * Gets the value of the stdDelka property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStdDelka() {
        return stdDelka;
    }

    /**
     * Sets the value of the stdDelka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStdDelka(Double value) {
        this.stdDelka = value;
    }

    /**
     * Gets the value of the stprIdno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStprIdno() {
        return stprIdno;
    }

    /**
     * Sets the value of the stprIdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStprIdno(Long value) {
        this.stprIdno = value;
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
     * Gets the value of the garant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGarant() {
        return garant;
    }

    /**
     * Sets the value of the garant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGarant(String value) {
        this.garant = value;
    }

    /**
     * Gets the value of the garantUcitIdno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGarantUcitIdno() {
        return garantUcitIdno;
    }

    /**
     * Sets the value of the garantUcitIdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGarantUcitIdno(Long value) {
        this.garantUcitIdno = value;
    }

    /**
     * Gets the value of the garant2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGarant2() {
        return garant2;
    }

    /**
     * Sets the value of the garant2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGarant2(String value) {
        this.garant2 = value;
    }

    /**
     * Gets the value of the garant2UcitIdno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGarant2UcitIdno() {
        return garant2UcitIdno;
    }

    /**
     * Sets the value of the garant2UcitIdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGarant2UcitIdno(Long value) {
        this.garant2UcitIdno = value;
    }

    /**
     * Gets the value of the nazevProgramu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevProgramu() {
        return nazevProgramu;
    }

    /**
     * Sets the value of the nazevProgramu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevProgramu(String value) {
        this.nazevProgramu = value;
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
     * Gets the value of the profilProgramu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilProgramu() {
        return profilProgramu;
    }

    /**
     * Sets the value of the profilProgramu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilProgramu(String value) {
        this.profilProgramu = value;
    }

    /**
     * Gets the value of the programAkreditacePoNovele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramAkreditacePoNovele() {
        return programAkreditacePoNovele;
    }

    /**
     * Sets the value of the programAkreditacePoNovele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramAkreditacePoNovele(String value) {
        this.programAkreditacePoNovele = value;
    }

    /**
     * Gets the value of the programAkreditovanSCislemOboru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramAkreditovanSCislemOboru() {
        return programAkreditovanSCislemOboru;
    }

    /**
     * Sets the value of the programAkreditovanSCislemOboru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramAkreditovanSCislemOboru(String value) {
        this.programAkreditovanSCislemOboru = value;
    }

    /**
     * Gets the value of the vzdelavaciCile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVzdelavaciCile() {
        return vzdelavaciCile;
    }

    /**
     * Sets the value of the vzdelavaciCile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVzdelavaciCile(String value) {
        this.vzdelavaciCile = value;
    }

    /**
     * Gets the value of the profesniProfilyAbsolventu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfesniProfilyAbsolventu() {
        return profesniProfilyAbsolventu;
    }

    /**
     * Sets the value of the profesniProfilyAbsolventu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfesniProfilyAbsolventu(String value) {
        this.profesniProfilyAbsolventu = value;
    }

    /**
     * Gets the value of the kvalifikacniPozadavky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvalifikacniPozadavky() {
        return kvalifikacniPozadavky;
    }

    /**
     * Sets the value of the kvalifikacniPozadavky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvalifikacniPozadavky(String value) {
        this.kvalifikacniPozadavky = value;
    }

    /**
     * Gets the value of the pozadavkyNaPrijetiCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyNaPrijetiCz() {
        return pozadavkyNaPrijetiCz;
    }

    /**
     * Sets the value of the pozadavkyNaPrijetiCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyNaPrijetiCz(String value) {
        this.pozadavkyNaPrijetiCz = value;
    }

    /**
     * Gets the value of the pozadavkyNaPrijetiAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyNaPrijetiAn() {
        return pozadavkyNaPrijetiAn;
    }

    /**
     * Sets the value of the pozadavkyNaPrijetiAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyNaPrijetiAn(String value) {
        this.pozadavkyNaPrijetiAn = value;
    }

    /**
     * Gets the value of the pozadavkyNaPrijetiUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyNaPrijetiUrl() {
        return pozadavkyNaPrijetiUrl;
    }

    /**
     * Sets the value of the pozadavkyNaPrijetiUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyNaPrijetiUrl(String value) {
        this.pozadavkyNaPrijetiUrl = value;
    }

    /**
     * Gets the value of the pocetPrijimanych property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPocetPrijimanych() {
        return pocetPrijimanych;
    }

    /**
     * Sets the value of the pocetPrijimanych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPocetPrijimanych(Integer value) {
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
     * Gets the value of the pozadovanaZdrZpusobilostCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadovanaZdrZpusobilostCz() {
        return pozadovanaZdrZpusobilostCz;
    }

    /**
     * Sets the value of the pozadovanaZdrZpusobilostCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadovanaZdrZpusobilostCz(String value) {
        this.pozadovanaZdrZpusobilostCz = value;
    }

    /**
     * Gets the value of the pozadovanaZdrZpusobilostAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadovanaZdrZpusobilostAn() {
        return pozadovanaZdrZpusobilostAn;
    }

    /**
     * Sets the value of the pozadovanaZdrZpusobilostAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadovanaZdrZpusobilostAn(String value) {
        this.pozadovanaZdrZpusobilostAn = value;
    }

    /**
     * Gets the value of the profilAbsolventaCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilAbsolventaCz() {
        return profilAbsolventaCz;
    }

    /**
     * Sets the value of the profilAbsolventaCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilAbsolventaCz(String value) {
        this.profilAbsolventaCz = value;
    }

    /**
     * Gets the value of the profilAbsolventaAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilAbsolventaAn() {
        return profilAbsolventaAn;
    }

    /**
     * Sets the value of the profilAbsolventaAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilAbsolventaAn(String value) {
        this.profilAbsolventaAn = value;
    }

    /**
     * Gets the value of the predpokladUplatitelnostiCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladUplatitelnostiCz() {
        return predpokladUplatitelnostiCz;
    }

    /**
     * Sets the value of the predpokladUplatitelnostiCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladUplatitelnostiCz(String value) {
        this.predpokladUplatitelnostiCz = value;
    }

    /**
     * Gets the value of the predpokladUplatitelnostiAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladUplatitelnostiAn() {
        return predpokladUplatitelnostiAn;
    }

    /**
     * Sets the value of the predpokladUplatitelnostiAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladUplatitelnostiAn(String value) {
        this.predpokladUplatitelnostiAn = value;
    }

    /**
     * Gets the value of the moznePracovniPoziceCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoznePracovniPoziceCz() {
        return moznePracovniPoziceCz;
    }

    /**
     * Sets the value of the moznePracovniPoziceCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoznePracovniPoziceCz(String value) {
        this.moznePracovniPoziceCz = value;
    }

    /**
     * Gets the value of the moznePracovniPoziceAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoznePracovniPoziceAn() {
        return moznePracovniPoziceAn;
    }

    /**
     * Sets the value of the moznePracovniPoziceAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoznePracovniPoziceAn(String value) {
        this.moznePracovniPoziceAn = value;
    }

    /**
     * Gets the value of the regulovanePovolaniCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulovanePovolaniCz() {
        return regulovanePovolaniCz;
    }

    /**
     * Sets the value of the regulovanePovolaniCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulovanePovolaniCz(String value) {
        this.regulovanePovolaniCz = value;
    }

    /**
     * Gets the value of the regulovanePovolaniAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulovanePovolaniAn() {
        return regulovanePovolaniAn;
    }

    /**
     * Sets the value of the regulovanePovolaniAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulovanePovolaniAn(String value) {
        this.regulovanePovolaniAn = value;
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
     * Gets the value of the marketingDoplnkoveInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingDoplnkoveInf() {
        return marketingDoplnkoveInf;
    }

    /**
     * Sets the value of the marketingDoplnkoveInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingDoplnkoveInf(String value) {
        this.marketingDoplnkoveInf = value;
    }

    /**
     * Gets the value of the marketingFormaStudia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingFormaStudia() {
        return marketingFormaStudia;
    }

    /**
     * Sets the value of the marketingFormaStudia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingFormaStudia(String value) {
        this.marketingFormaStudia = value;
    }

    /**
     * Gets the value of the marketingPopis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingPopis() {
        return marketingPopis;
    }

    /**
     * Sets the value of the marketingPopis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingPopis(String value) {
        this.marketingPopis = value;
    }

    /**
     * Gets the value of the marketingPoznamka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingPoznamka() {
        return marketingPoznamka;
    }

    /**
     * Sets the value of the marketingPoznamka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingPoznamka(String value) {
        this.marketingPoznamka = value;
    }

    /**
     * Gets the value of the marketingStudiumInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingStudiumInf() {
        return marketingStudiumInf;
    }

    /**
     * Sets the value of the marketingStudiumInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingStudiumInf(String value) {
        this.marketingStudiumInf = value;
    }

    /**
     * Gets the value of the marketingUplatneni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingUplatneni() {
        return marketingUplatneni;
    }

    /**
     * Sets the value of the marketingUplatneni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingUplatneni(String value) {
        this.marketingUplatneni = value;
    }

    /**
     * Gets the value of the nazevProDiplomCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevProDiplomCz() {
        return nazevProDiplomCz;
    }

    /**
     * Sets the value of the nazevProDiplomCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevProDiplomCz(String value) {
        this.nazevProDiplomCz = value;
    }

    /**
     * Gets the value of the nazevProDiplomAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevProDiplomAn() {
        return nazevProDiplomAn;
    }

    /**
     * Sets the value of the nazevProDiplomAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevProDiplomAn(String value) {
        this.nazevProDiplomAn = value;
    }

}
