
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOblastiVzdelavaniProgramuResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getOblastiVzdelavaniProgramuResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="programOblVzdelList" type="{http://stag-ws.zcu.cz/}programOblVzdelListType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOblastiVzdelavaniProgramuResponse", propOrder = {
    "programOblVzdelList"
})
public class GetOblastiVzdelavaniProgramuResponse {

    @XmlElement(required = true)
    protected ProgramOblVzdelListType programOblVzdelList;

    /**
     * Gets the value of the programOblVzdelList property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramOblVzdelListType }
     *     
     */
    public ProgramOblVzdelListType getProgramOblVzdelList() {
        return programOblVzdelList;
    }

    /**
     * Sets the value of the programOblVzdelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramOblVzdelListType }
     *     
     */
    public void setProgramOblVzdelList(ProgramOblVzdelListType value) {
        this.programOblVzdelList = value;
    }

}
