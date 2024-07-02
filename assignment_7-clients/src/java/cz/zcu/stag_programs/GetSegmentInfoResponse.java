
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSegmentInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getSegmentInfoResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="segmentInfo" type="{http://stag-ws.zcu.cz/}segmentInfoType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSegmentInfoResponse", propOrder = {
    "segmentInfo"
})
public class GetSegmentInfoResponse {

    @XmlElement(required = true)
    protected SegmentInfoType segmentInfo;

    /**
     * Gets the value of the segmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentInfoType }
     *     
     */
    public SegmentInfoType getSegmentInfo() {
        return segmentInfo;
    }

    /**
     * Sets the value of the segmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentInfoType }
     *     
     */
    public void setSegmentInfo(SegmentInfoType value) {
        this.segmentInfo = value;
    }

}
