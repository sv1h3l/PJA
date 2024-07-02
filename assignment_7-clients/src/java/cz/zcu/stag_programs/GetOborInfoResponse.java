
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOborInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getOborInfoResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oborInfo" type="{http://stag-ws.zcu.cz/}oborInfoType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOborInfoResponse", propOrder = {
    "oborInfo"
})
public class GetOborInfoResponse {

    @XmlElement(required = true)
    protected OborInfoType oborInfo;

    /**
     * Gets the value of the oborInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OborInfoType }
     *     
     */
    public OborInfoType getOborInfo() {
        return oborInfo;
    }

    /**
     * Sets the value of the oborInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OborInfoType }
     *     
     */
    public void setOborInfo(OborInfoType value) {
        this.oborInfo = value;
    }

}
