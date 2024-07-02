
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOboryStudijnihoProgramuResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getOboryStudijnihoProgramuResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oborInfoList" type="{http://stag-ws.zcu.cz/}oborInfoListType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOboryStudijnihoProgramuResponse", propOrder = {
    "oborInfoList"
})
public class GetOboryStudijnihoProgramuResponse {

    @XmlElement(required = true)
    protected OborInfoListType oborInfoList;

    /**
     * Gets the value of the oborInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link OborInfoListType }
     *     
     */
    public OborInfoListType getOborInfoList() {
        return oborInfoList;
    }

    /**
     * Sets the value of the oborInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OborInfoListType }
     *     
     */
    public void setOborInfoList(OborInfoListType value) {
        this.oborInfoList = value;
    }

}
