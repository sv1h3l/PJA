
package cz.upol.pja.lecture06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repeat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="calculateBmi">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="height" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0""/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateBmi", propOrder = {
    "weight",
    "height"
})
public class CalculateBmi {

    protected String weight;
    protected String height;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the n property.
     * 
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the n property.
     * 
     */
    public void setHeight(String value) {
        this.height = value;
    }

}
