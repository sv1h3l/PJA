
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBlokySegmentuResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getBlokySegmentuResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="blokInfoList" type="{http://stag-ws.zcu.cz/}blokInfoListType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBlokySegmentuResponse", propOrder = {
    "blokInfoList"
})
public class GetBlokySegmentuResponse {

    @XmlElement(required = true)
    protected BlokInfoListType blokInfoList;

    /**
     * Gets the value of the blokInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link BlokInfoListType }
     *     
     */
    public BlokInfoListType getBlokInfoList() {
        return blokInfoList;
    }

    /**
     * Sets the value of the blokInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlokInfoListType }
     *     
     */
    public void setBlokInfoList(BlokInfoListType value) {
        this.blokInfoList = value;
    }

}
