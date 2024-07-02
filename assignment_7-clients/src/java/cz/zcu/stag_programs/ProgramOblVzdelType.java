
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for programOblVzdelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="programOblVzdelType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stprIdno" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="oblastVzdelavani" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="oblastVzdelavaniText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="tematickeOkruhy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "programOblVzdelType", propOrder = {
    "stprIdno",
    "oblastVzdelavani",
    "oblastVzdelavaniText",
    "tematickeOkruhy"
})
public class ProgramOblVzdelType {

    protected long stprIdno;
    @XmlElement(required = true)
    protected String oblastVzdelavani;
    @XmlElement(required = true)
    protected String oblastVzdelavaniText;
    protected String tematickeOkruhy;

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
     * Gets the value of the oblastVzdelavani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblastVzdelavani() {
        return oblastVzdelavani;
    }

    /**
     * Sets the value of the oblastVzdelavani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblastVzdelavani(String value) {
        this.oblastVzdelavani = value;
    }

    /**
     * Gets the value of the oblastVzdelavaniText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblastVzdelavaniText() {
        return oblastVzdelavaniText;
    }

    /**
     * Sets the value of the oblastVzdelavaniText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblastVzdelavaniText(String value) {
        this.oblastVzdelavaniText = value;
    }

    /**
     * Gets the value of the tematickeOkruhy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTematickeOkruhy() {
        return tematickeOkruhy;
    }

    /**
     * Sets the value of the tematickeOkruhy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTematickeOkruhy(String value) {
        this.tematickeOkruhy = value;
    }

}
