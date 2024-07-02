
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPlanyOboruResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getPlanyOboruResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="planInfoList" type="{http://stag-ws.zcu.cz/}planInfoListType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlanyOboruResponse", propOrder = {
    "planInfoList"
})
public class GetPlanyOboruResponse {

    @XmlElement(required = true)
    protected PlanInfoListType planInfoList;

    /**
     * Gets the value of the planInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link PlanInfoListType }
     *     
     */
    public PlanInfoListType getPlanInfoList() {
        return planInfoList;
    }

    /**
     * Sets the value of the planInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanInfoListType }
     *     
     */
    public void setPlanInfoList(PlanInfoListType value) {
        this.planInfoList = value;
    }

}
