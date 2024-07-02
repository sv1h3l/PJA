
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOboryQRAMInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getOboryQRAMInfoResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oborQRAMInfoList" type="{http://stag-ws.zcu.cz/}oborQRAMInfoListType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOboryQRAMInfoResponse", propOrder = {
    "oborQRAMInfoList"
})
public class GetOboryQRAMInfoResponse {

    @XmlElement(required = true)
    protected OborQRAMInfoListType oborQRAMInfoList;

    /**
     * Gets the value of the oborQRAMInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link OborQRAMInfoListType }
     *     
     */
    public OborQRAMInfoListType getOborQRAMInfoList() {
        return oborQRAMInfoList;
    }

    /**
     * Sets the value of the oborQRAMInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OborQRAMInfoListType }
     *     
     */
    public void setOborQRAMInfoList(OborQRAMInfoListType value) {
        this.oborQRAMInfoList = value;
    }

}
