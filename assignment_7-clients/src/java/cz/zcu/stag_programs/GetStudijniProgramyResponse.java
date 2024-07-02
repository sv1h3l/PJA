
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStudijniProgramyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getStudijniProgramyResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="programInfoList" type="{http://stag-ws.zcu.cz/}programInfoListType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStudijniProgramyResponse", propOrder = {
    "programInfoList"
})
public class GetStudijniProgramyResponse {

    @XmlElement(required = true)
    protected ProgramInfoListType programInfoList;

    /**
     * Gets the value of the programInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInfoListType }
     *     
     */
    public ProgramInfoListType getProgramInfoList() {
        return programInfoList;
    }

    /**
     * Sets the value of the programInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInfoListType }
     *     
     */
    public void setProgramInfoList(ProgramInfoListType value) {
        this.programInfoList = value;
    }

}
