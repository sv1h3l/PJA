
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBlokInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getBlokInfoResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="blokInfo" type="{http://stag-ws.zcu.cz/}blokInfoType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBlokInfoResponse", propOrder = {
    "blokInfo"
})
public class GetBlokInfoResponse {

    @XmlElement(required = true)
    protected BlokInfoType blokInfo;

    /**
     * Gets the value of the blokInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BlokInfoType }
     *     
     */
    public BlokInfoType getBlokInfo() {
        return blokInfo;
    }

    /**
     * Sets the value of the blokInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlokInfoType }
     *     
     */
    public void setBlokInfo(BlokInfoType value) {
        this.blokInfo = value;
    }

}
