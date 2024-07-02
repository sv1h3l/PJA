
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPlanyStudentaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getPlanyStudentaResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="planyInfo" type="{http://stag-ws.zcu.cz/}planInfoListType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlanyStudentaResponse", propOrder = {
    "planyInfo"
})
public class GetPlanyStudentaResponse {

    @XmlElement(required = true)
    protected PlanInfoListType planyInfo;

    /**
     * Gets the value of the planyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlanInfoListType }
     *     
     */
    public PlanInfoListType getPlanyInfo() {
        return planyInfo;
    }

    /**
     * Sets the value of the planyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanInfoListType }
     *     
     */
    public void setPlanyInfo(PlanInfoListType value) {
        this.planyInfo = value;
    }

}
