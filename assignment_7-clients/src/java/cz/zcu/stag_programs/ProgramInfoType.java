
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for programInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="programInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stprIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="nazev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="nazevCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nazevAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="titul" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="titulZkr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="titulRigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="titulRigoZkr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="forma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fakulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="stdDelka" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="maxDelka" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="kredity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="vykazovan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="platnyOd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="neplatnyOd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="cile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="garant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="garantUcitIdno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="garantAdministrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="garantAdministraceUcitIdno" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="jazyk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="akreditacePoNovele" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="akreditaceInstitucionalni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="akreditaceOdDate" type="{http://stag-ws.zcu.cz/}xmlDateType" minOccurs="0"/>
 *         <element name="akreditaceDoDate" type="{http://stag-ws.zcu.cz/}xmlDateType" minOccurs="0"/>
 *         <element name="akreditaceZtracenaOdDate" type="{http://stag-ws.zcu.cz/}xmlDateType" minOccurs="0"/>
 *         <element name="akreditovanSeSpecializaci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="akreditaceCislo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kodIsced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="navaznostNaDalsiSpCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="navaznostNaDalsiSpAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="navaznostNaDalsiSpJ3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="navaznostNaDalsiSpJ4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="obsahoveZamereniCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="obsahoveZamereniAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="obsahoveZamereniJ3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="obsahoveZamereniJ4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadovanaZdrZpusobilostCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadovanaZdrZpusobilostAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadovanaZdrZpusobilostJ3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadovanaZdrZpusobilostJ4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilAbsolventaCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilAbsolventaAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilAbsolventaJ3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="profilAbsolventaJ4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pocetPrijimanych" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pocetPrijimanychPoznamka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyNaPrijetiCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyNaPrijetiAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyNaPrijetiUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyRovnyPristupZdrCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyRovnyPristupZdrAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyRovnyPristupZdrJ3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pozadavkyRovnyPristupZdrJ4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladUplatitelnostiCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladUplatitelnostiAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladUplatitelnostiJ3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="predpokladUplatitelnostiJ4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniJ3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniJ4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniUznavaciO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="regulovanePovolaniDatum" type="{http://stag-ws.zcu.cz/}xmlDateType" minOccurs="0"/>
 *         <element name="moznePracovniPoziceCz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="moznePracovniPoziceAn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="moznePracovniPoziceJ3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="moznePracovniPoziceJ4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vyukaZahranicniPredpis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vyukaAVCRPracoviste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="akreditaceOmezenaDuvod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="akreditaceOmezenaCislo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="akreditaceOmezenaOd" type="{http://stag-ws.zcu.cz/}xmlDateType" minOccurs="0"/>
 *         <element name="koefEkonomickeNarocnosti" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="typickaTemataVskp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="praktickaVyuka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="spolupraceSPraxi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="odbornaPraxe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="jointDegrees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="poznamkaVerejna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="podminkyPokracovaniStudia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "programInfoType", propOrder = {
    "stprIdno",
    "nazev",
    "nazevCz",
    "nazevAn",
    "kod",
    "titul",
    "titulZkr",
    "titulRigo",
    "titulRigoZkr",
    "typ",
    "forma",
    "fakulta",
    "stdDelka",
    "maxDelka",
    "kredity",
    "vykazovan",
    "platnyOd",
    "neplatnyOd",
    "cile",
    "garant",
    "garantUcitIdno",
    "garantAdministrace",
    "garantAdministraceUcitIdno",
    "jazyk",
    "profil",
    "akreditacePoNovele",
    "akreditaceInstitucionalni",
    "akreditaceOdDate",
    "akreditaceDoDate",
    "akreditaceZtracenaOdDate",
    "akreditovanSeSpecializaci",
    "akreditaceCislo",
    "kodIsced",
    "navaznostNaDalsiSpCz",
    "navaznostNaDalsiSpAn",
    "navaznostNaDalsiSpJ3",
    "navaznostNaDalsiSpJ4",
    "obsahoveZamereniCz",
    "obsahoveZamereniAn",
    "obsahoveZamereniJ3",
    "obsahoveZamereniJ4",
    "pozadovanaZdrZpusobilostCz",
    "pozadovanaZdrZpusobilostAn",
    "pozadovanaZdrZpusobilostJ3",
    "pozadovanaZdrZpusobilostJ4",
    "profilAbsolventaCz",
    "profilAbsolventaAn",
    "profilAbsolventaJ3",
    "profilAbsolventaJ4",
    "pocetPrijimanych",
    "pocetPrijimanychPoznamka",
    "pozadavkyNaPrijetiCz",
    "pozadavkyNaPrijetiAn",
    "pozadavkyNaPrijetiUrl",
    "pozadavkyRovnyPristupZdrCz",
    "pozadavkyRovnyPristupZdrAn",
    "pozadavkyRovnyPristupZdrJ3",
    "pozadavkyRovnyPristupZdrJ4",
    "predpokladUplatitelnostiCz",
    "predpokladUplatitelnostiAn",
    "predpokladUplatitelnostiJ3",
    "predpokladUplatitelnostiJ4",
    "regulovanePovolaniCz",
    "regulovanePovolaniAn",
    "regulovanePovolaniJ3",
    "regulovanePovolaniJ4",
    "regulovanePovolaniUznavaciO",
    "regulovanePovolaniDatum",
    "moznePracovniPoziceCz",
    "moznePracovniPoziceAn",
    "moznePracovniPoziceJ3",
    "moznePracovniPoziceJ4",
    "vyukaZahranicniPredpis",
    "vyukaAVCRPracoviste",
    "akreditaceOmezenaDuvod",
    "akreditaceOmezenaCislo",
    "akreditaceOmezenaOd",
    "koefEkonomickeNarocnosti",
    "typickaTemataVskp",
    "praktickaVyuka",
    "spolupraceSPraxi",
    "odbornaPraxe",
    "jointDegrees",
    "poznamkaVerejna",
    "podminkyPokracovaniStudia",
    "nazevProDiplomCz",
    "nazevProDiplomAn"
})
public class ProgramInfoType {

    protected long stprIdno;
    @XmlElement(required = true)
    protected String nazev;
    protected String nazevCz;
    protected String nazevAn;
    @XmlElement(required = true)
    protected String kod;
    protected String titul;
    protected String titulZkr;
    protected String titulRigo;
    protected String titulRigoZkr;
    @XmlElement(required = true)
    protected String typ;
    @XmlElement(required = true)
    protected String forma;
    @XmlElement(required = true)
    protected String fakulta;
    protected float stdDelka;
    protected float maxDelka;
    protected int kredity;
    @XmlElement(required = true)
    protected String vykazovan;
    protected String platnyOd;
    protected String neplatnyOd;
    protected String cile;
    protected String garant;
    protected Long garantUcitIdno;
    protected String garantAdministrace;
    protected Long garantAdministraceUcitIdno;
    protected String jazyk;
    protected String profil;
    protected String akreditacePoNovele;
    protected String akreditaceInstitucionalni;
    protected String akreditaceOdDate;
    protected String akreditaceDoDate;
    protected String akreditaceZtracenaOdDate;
    protected String akreditovanSeSpecializaci;
    protected String akreditaceCislo;
    protected String kodIsced;
    protected String navaznostNaDalsiSpCz;
    protected String navaznostNaDalsiSpAn;
    protected String navaznostNaDalsiSpJ3;
    protected String navaznostNaDalsiSpJ4;
    protected String obsahoveZamereniCz;
    protected String obsahoveZamereniAn;
    protected String obsahoveZamereniJ3;
    protected String obsahoveZamereniJ4;
    protected String pozadovanaZdrZpusobilostCz;
    protected String pozadovanaZdrZpusobilostAn;
    protected String pozadovanaZdrZpusobilostJ3;
    protected String pozadovanaZdrZpusobilostJ4;
    protected String profilAbsolventaCz;
    protected String profilAbsolventaAn;
    protected String profilAbsolventaJ3;
    protected String profilAbsolventaJ4;
    protected Integer pocetPrijimanych;
    protected String pocetPrijimanychPoznamka;
    protected String pozadavkyNaPrijetiCz;
    protected String pozadavkyNaPrijetiAn;
    protected String pozadavkyNaPrijetiUrl;
    protected String pozadavkyRovnyPristupZdrCz;
    protected String pozadavkyRovnyPristupZdrAn;
    protected String pozadavkyRovnyPristupZdrJ3;
    protected String pozadavkyRovnyPristupZdrJ4;
    protected String predpokladUplatitelnostiCz;
    protected String predpokladUplatitelnostiAn;
    protected String predpokladUplatitelnostiJ3;
    protected String predpokladUplatitelnostiJ4;
    protected String regulovanePovolaniCz;
    protected String regulovanePovolaniAn;
    protected String regulovanePovolaniJ3;
    protected String regulovanePovolaniJ4;
    protected String regulovanePovolaniUznavaciO;
    protected String regulovanePovolaniDatum;
    protected String moznePracovniPoziceCz;
    protected String moznePracovniPoziceAn;
    protected String moznePracovniPoziceJ3;
    protected String moznePracovniPoziceJ4;
    protected String vyukaZahranicniPredpis;
    protected String vyukaAVCRPracoviste;
    protected String akreditaceOmezenaDuvod;
    protected String akreditaceOmezenaCislo;
    protected String akreditaceOmezenaOd;
    protected Double koefEkonomickeNarocnosti;
    protected String typickaTemataVskp;
    protected String praktickaVyuka;
    protected String spolupraceSPraxi;
    protected String odbornaPraxe;
    protected String jointDegrees;
    protected String poznamkaVerejna;
    protected String podminkyPokracovaniStudia;
    protected String nazevProDiplomCz;
    protected String nazevProDiplomAn;

    /**
     * Gets the value of the stprIdno property.
     * 
     */
    public long getStprIdno() {
        return stprIdno;
    }

    /**
     * Sets the value of the stprIdno property.
     * 
     */
    public void setStprIdno(long value) {
        this.stprIdno = value;
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
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKod(String value) {
        this.kod = value;
    }

    /**
     * Gets the value of the titul property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitul() {
        return titul;
    }

    /**
     * Sets the value of the titul property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitul(String value) {
        this.titul = value;
    }

    /**
     * Gets the value of the titulZkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulZkr() {
        return titulZkr;
    }

    /**
     * Sets the value of the titulZkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulZkr(String value) {
        this.titulZkr = value;
    }

    /**
     * Gets the value of the titulRigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulRigo() {
        return titulRigo;
    }

    /**
     * Sets the value of the titulRigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulRigo(String value) {
        this.titulRigo = value;
    }

    /**
     * Gets the value of the titulRigoZkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulRigoZkr() {
        return titulRigoZkr;
    }

    /**
     * Sets the value of the titulRigoZkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulRigoZkr(String value) {
        this.titulRigoZkr = value;
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
     * Gets the value of the stdDelka property.
     * 
     */
    public float getStdDelka() {
        return stdDelka;
    }

    /**
     * Sets the value of the stdDelka property.
     * 
     */
    public void setStdDelka(float value) {
        this.stdDelka = value;
    }

    /**
     * Gets the value of the maxDelka property.
     * 
     */
    public float getMaxDelka() {
        return maxDelka;
    }

    /**
     * Sets the value of the maxDelka property.
     * 
     */
    public void setMaxDelka(float value) {
        this.maxDelka = value;
    }

    /**
     * Gets the value of the kredity property.
     * 
     */
    public int getKredity() {
        return kredity;
    }

    /**
     * Sets the value of the kredity property.
     * 
     */
    public void setKredity(int value) {
        this.kredity = value;
    }

    /**
     * Gets the value of the vykazovan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVykazovan() {
        return vykazovan;
    }

    /**
     * Sets the value of the vykazovan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVykazovan(String value) {
        this.vykazovan = value;
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
     * Gets the value of the cile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCile() {
        return cile;
    }

    /**
     * Sets the value of the cile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCile(String value) {
        this.cile = value;
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
     * Gets the value of the garantAdministrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGarantAdministrace() {
        return garantAdministrace;
    }

    /**
     * Sets the value of the garantAdministrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGarantAdministrace(String value) {
        this.garantAdministrace = value;
    }

    /**
     * Gets the value of the garantAdministraceUcitIdno property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGarantAdministraceUcitIdno() {
        return garantAdministraceUcitIdno;
    }

    /**
     * Sets the value of the garantAdministraceUcitIdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGarantAdministraceUcitIdno(Long value) {
        this.garantAdministraceUcitIdno = value;
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
     * Gets the value of the profil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfil() {
        return profil;
    }

    /**
     * Sets the value of the profil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfil(String value) {
        this.profil = value;
    }

    /**
     * Gets the value of the akreditacePoNovele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditacePoNovele() {
        return akreditacePoNovele;
    }

    /**
     * Sets the value of the akreditacePoNovele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditacePoNovele(String value) {
        this.akreditacePoNovele = value;
    }

    /**
     * Gets the value of the akreditaceInstitucionalni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceInstitucionalni() {
        return akreditaceInstitucionalni;
    }

    /**
     * Sets the value of the akreditaceInstitucionalni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceInstitucionalni(String value) {
        this.akreditaceInstitucionalni = value;
    }

    /**
     * Gets the value of the akreditaceOdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceOdDate() {
        return akreditaceOdDate;
    }

    /**
     * Sets the value of the akreditaceOdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceOdDate(String value) {
        this.akreditaceOdDate = value;
    }

    /**
     * Gets the value of the akreditaceDoDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceDoDate() {
        return akreditaceDoDate;
    }

    /**
     * Sets the value of the akreditaceDoDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceDoDate(String value) {
        this.akreditaceDoDate = value;
    }

    /**
     * Gets the value of the akreditaceZtracenaOdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceZtracenaOdDate() {
        return akreditaceZtracenaOdDate;
    }

    /**
     * Sets the value of the akreditaceZtracenaOdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceZtracenaOdDate(String value) {
        this.akreditaceZtracenaOdDate = value;
    }

    /**
     * Gets the value of the akreditovanSeSpecializaci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditovanSeSpecializaci() {
        return akreditovanSeSpecializaci;
    }

    /**
     * Sets the value of the akreditovanSeSpecializaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditovanSeSpecializaci(String value) {
        this.akreditovanSeSpecializaci = value;
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
     * Gets the value of the navaznostNaDalsiSpCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavaznostNaDalsiSpCz() {
        return navaznostNaDalsiSpCz;
    }

    /**
     * Sets the value of the navaznostNaDalsiSpCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavaznostNaDalsiSpCz(String value) {
        this.navaznostNaDalsiSpCz = value;
    }

    /**
     * Gets the value of the navaznostNaDalsiSpAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavaznostNaDalsiSpAn() {
        return navaznostNaDalsiSpAn;
    }

    /**
     * Sets the value of the navaznostNaDalsiSpAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavaznostNaDalsiSpAn(String value) {
        this.navaznostNaDalsiSpAn = value;
    }

    /**
     * Gets the value of the navaznostNaDalsiSpJ3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavaznostNaDalsiSpJ3() {
        return navaznostNaDalsiSpJ3;
    }

    /**
     * Sets the value of the navaznostNaDalsiSpJ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavaznostNaDalsiSpJ3(String value) {
        this.navaznostNaDalsiSpJ3 = value;
    }

    /**
     * Gets the value of the navaznostNaDalsiSpJ4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavaznostNaDalsiSpJ4() {
        return navaznostNaDalsiSpJ4;
    }

    /**
     * Sets the value of the navaznostNaDalsiSpJ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavaznostNaDalsiSpJ4(String value) {
        this.navaznostNaDalsiSpJ4 = value;
    }

    /**
     * Gets the value of the obsahoveZamereniCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsahoveZamereniCz() {
        return obsahoveZamereniCz;
    }

    /**
     * Sets the value of the obsahoveZamereniCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsahoveZamereniCz(String value) {
        this.obsahoveZamereniCz = value;
    }

    /**
     * Gets the value of the obsahoveZamereniAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsahoveZamereniAn() {
        return obsahoveZamereniAn;
    }

    /**
     * Sets the value of the obsahoveZamereniAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsahoveZamereniAn(String value) {
        this.obsahoveZamereniAn = value;
    }

    /**
     * Gets the value of the obsahoveZamereniJ3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsahoveZamereniJ3() {
        return obsahoveZamereniJ3;
    }

    /**
     * Sets the value of the obsahoveZamereniJ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsahoveZamereniJ3(String value) {
        this.obsahoveZamereniJ3 = value;
    }

    /**
     * Gets the value of the obsahoveZamereniJ4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsahoveZamereniJ4() {
        return obsahoveZamereniJ4;
    }

    /**
     * Sets the value of the obsahoveZamereniJ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsahoveZamereniJ4(String value) {
        this.obsahoveZamereniJ4 = value;
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
     * Gets the value of the pozadovanaZdrZpusobilostJ3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadovanaZdrZpusobilostJ3() {
        return pozadovanaZdrZpusobilostJ3;
    }

    /**
     * Sets the value of the pozadovanaZdrZpusobilostJ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadovanaZdrZpusobilostJ3(String value) {
        this.pozadovanaZdrZpusobilostJ3 = value;
    }

    /**
     * Gets the value of the pozadovanaZdrZpusobilostJ4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadovanaZdrZpusobilostJ4() {
        return pozadovanaZdrZpusobilostJ4;
    }

    /**
     * Sets the value of the pozadovanaZdrZpusobilostJ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadovanaZdrZpusobilostJ4(String value) {
        this.pozadovanaZdrZpusobilostJ4 = value;
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
     * Gets the value of the profilAbsolventaJ3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilAbsolventaJ3() {
        return profilAbsolventaJ3;
    }

    /**
     * Sets the value of the profilAbsolventaJ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilAbsolventaJ3(String value) {
        this.profilAbsolventaJ3 = value;
    }

    /**
     * Gets the value of the profilAbsolventaJ4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilAbsolventaJ4() {
        return profilAbsolventaJ4;
    }

    /**
     * Sets the value of the profilAbsolventaJ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilAbsolventaJ4(String value) {
        this.profilAbsolventaJ4 = value;
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
     * Gets the value of the pozadavkyRovnyPristupZdrCz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyRovnyPristupZdrCz() {
        return pozadavkyRovnyPristupZdrCz;
    }

    /**
     * Sets the value of the pozadavkyRovnyPristupZdrCz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyRovnyPristupZdrCz(String value) {
        this.pozadavkyRovnyPristupZdrCz = value;
    }

    /**
     * Gets the value of the pozadavkyRovnyPristupZdrAn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyRovnyPristupZdrAn() {
        return pozadavkyRovnyPristupZdrAn;
    }

    /**
     * Sets the value of the pozadavkyRovnyPristupZdrAn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyRovnyPristupZdrAn(String value) {
        this.pozadavkyRovnyPristupZdrAn = value;
    }

    /**
     * Gets the value of the pozadavkyRovnyPristupZdrJ3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyRovnyPristupZdrJ3() {
        return pozadavkyRovnyPristupZdrJ3;
    }

    /**
     * Sets the value of the pozadavkyRovnyPristupZdrJ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyRovnyPristupZdrJ3(String value) {
        this.pozadavkyRovnyPristupZdrJ3 = value;
    }

    /**
     * Gets the value of the pozadavkyRovnyPristupZdrJ4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozadavkyRovnyPristupZdrJ4() {
        return pozadavkyRovnyPristupZdrJ4;
    }

    /**
     * Sets the value of the pozadavkyRovnyPristupZdrJ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozadavkyRovnyPristupZdrJ4(String value) {
        this.pozadavkyRovnyPristupZdrJ4 = value;
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
     * Gets the value of the predpokladUplatitelnostiJ3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladUplatitelnostiJ3() {
        return predpokladUplatitelnostiJ3;
    }

    /**
     * Sets the value of the predpokladUplatitelnostiJ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladUplatitelnostiJ3(String value) {
        this.predpokladUplatitelnostiJ3 = value;
    }

    /**
     * Gets the value of the predpokladUplatitelnostiJ4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPredpokladUplatitelnostiJ4() {
        return predpokladUplatitelnostiJ4;
    }

    /**
     * Sets the value of the predpokladUplatitelnostiJ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPredpokladUplatitelnostiJ4(String value) {
        this.predpokladUplatitelnostiJ4 = value;
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
     * Gets the value of the regulovanePovolaniJ3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulovanePovolaniJ3() {
        return regulovanePovolaniJ3;
    }

    /**
     * Sets the value of the regulovanePovolaniJ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulovanePovolaniJ3(String value) {
        this.regulovanePovolaniJ3 = value;
    }

    /**
     * Gets the value of the regulovanePovolaniJ4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulovanePovolaniJ4() {
        return regulovanePovolaniJ4;
    }

    /**
     * Sets the value of the regulovanePovolaniJ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulovanePovolaniJ4(String value) {
        this.regulovanePovolaniJ4 = value;
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
     * Gets the value of the regulovanePovolaniDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulovanePovolaniDatum() {
        return regulovanePovolaniDatum;
    }

    /**
     * Sets the value of the regulovanePovolaniDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulovanePovolaniDatum(String value) {
        this.regulovanePovolaniDatum = value;
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
     * Gets the value of the moznePracovniPoziceJ3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoznePracovniPoziceJ3() {
        return moznePracovniPoziceJ3;
    }

    /**
     * Sets the value of the moznePracovniPoziceJ3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoznePracovniPoziceJ3(String value) {
        this.moznePracovniPoziceJ3 = value;
    }

    /**
     * Gets the value of the moznePracovniPoziceJ4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoznePracovniPoziceJ4() {
        return moznePracovniPoziceJ4;
    }

    /**
     * Sets the value of the moznePracovniPoziceJ4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoznePracovniPoziceJ4(String value) {
        this.moznePracovniPoziceJ4 = value;
    }

    /**
     * Gets the value of the vyukaZahranicniPredpis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyukaZahranicniPredpis() {
        return vyukaZahranicniPredpis;
    }

    /**
     * Sets the value of the vyukaZahranicniPredpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyukaZahranicniPredpis(String value) {
        this.vyukaZahranicniPredpis = value;
    }

    /**
     * Gets the value of the vyukaAVCRPracoviste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyukaAVCRPracoviste() {
        return vyukaAVCRPracoviste;
    }

    /**
     * Sets the value of the vyukaAVCRPracoviste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyukaAVCRPracoviste(String value) {
        this.vyukaAVCRPracoviste = value;
    }

    /**
     * Gets the value of the akreditaceOmezenaDuvod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceOmezenaDuvod() {
        return akreditaceOmezenaDuvod;
    }

    /**
     * Sets the value of the akreditaceOmezenaDuvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceOmezenaDuvod(String value) {
        this.akreditaceOmezenaDuvod = value;
    }

    /**
     * Gets the value of the akreditaceOmezenaCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceOmezenaCislo() {
        return akreditaceOmezenaCislo;
    }

    /**
     * Sets the value of the akreditaceOmezenaCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceOmezenaCislo(String value) {
        this.akreditaceOmezenaCislo = value;
    }

    /**
     * Gets the value of the akreditaceOmezenaOd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAkreditaceOmezenaOd() {
        return akreditaceOmezenaOd;
    }

    /**
     * Sets the value of the akreditaceOmezenaOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAkreditaceOmezenaOd(String value) {
        this.akreditaceOmezenaOd = value;
    }

    /**
     * Gets the value of the koefEkonomickeNarocnosti property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKoefEkonomickeNarocnosti() {
        return koefEkonomickeNarocnosti;
    }

    /**
     * Sets the value of the koefEkonomickeNarocnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKoefEkonomickeNarocnosti(Double value) {
        this.koefEkonomickeNarocnosti = value;
    }

    /**
     * Gets the value of the typickaTemataVskp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypickaTemataVskp() {
        return typickaTemataVskp;
    }

    /**
     * Sets the value of the typickaTemataVskp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypickaTemataVskp(String value) {
        this.typickaTemataVskp = value;
    }

    /**
     * Gets the value of the praktickaVyuka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPraktickaVyuka() {
        return praktickaVyuka;
    }

    /**
     * Sets the value of the praktickaVyuka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPraktickaVyuka(String value) {
        this.praktickaVyuka = value;
    }

    /**
     * Gets the value of the spolupraceSPraxi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpolupraceSPraxi() {
        return spolupraceSPraxi;
    }

    /**
     * Sets the value of the spolupraceSPraxi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpolupraceSPraxi(String value) {
        this.spolupraceSPraxi = value;
    }

    /**
     * Gets the value of the odbornaPraxe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdbornaPraxe() {
        return odbornaPraxe;
    }

    /**
     * Sets the value of the odbornaPraxe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdbornaPraxe(String value) {
        this.odbornaPraxe = value;
    }

    /**
     * Gets the value of the jointDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointDegrees() {
        return jointDegrees;
    }

    /**
     * Sets the value of the jointDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointDegrees(String value) {
        this.jointDegrees = value;
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
     * Gets the value of the podminkyPokracovaniStudia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodminkyPokracovaniStudia() {
        return podminkyPokracovaniStudia;
    }

    /**
     * Sets the value of the podminkyPokracovaniStudia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodminkyPokracovaniStudia(String value) {
        this.podminkyPokracovaniStudia = value;
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
