
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStudijniProgramInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getStudijniProgramInfoResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="programInfo" type="{http://stag-ws.zcu.cz/}programInfoType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStudijniProgramInfoResponse", propOrder = {
    "programInfo"
})
public class GetStudijniProgramInfoResponse {

    @XmlElement(required = true)
    protected ProgramInfoType programInfo;

    /**
     * Gets the value of the programInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInfoType }
     *     
     */
    public ProgramInfoType getProgramInfo() {
        return programInfo;
    }

    /**
     * Sets the value of the programInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInfoType }
     *     
     */
    public void setProgramInfo(ProgramInfoType value) {
        this.programInfo = value;
    }

}
