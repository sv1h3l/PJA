
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPlanInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getPlanInfoResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="planInfo" type="{http://stag-ws.zcu.cz/}planInfoType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlanInfoResponse", propOrder = {
    "planInfo"
})
public class GetPlanInfoResponse {

    @XmlElement(required = true)
    protected PlanInfoType planInfo;

    /**
     * Gets the value of the planInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlanInfoType }
     *     
     */
    public PlanInfoType getPlanInfo() {
        return planInfo;
    }

    /**
     * Sets the value of the planInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanInfoType }
     *     
     */
    public void setPlanInfo(PlanInfoType value) {
        this.planInfo = value;
    }

}
