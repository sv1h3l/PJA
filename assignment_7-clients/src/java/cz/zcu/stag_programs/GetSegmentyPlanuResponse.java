
package cz.zcu.stag_ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSegmentyPlanuResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="getSegmentyPlanuResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="segmentInfoList" type="{http://stag-ws.zcu.cz/}segmentInfoListType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSegmentyPlanuResponse", propOrder = {
    "segmentInfoList"
})
public class GetSegmentyPlanuResponse {

    @XmlElement(required = true)
    protected SegmentInfoListType segmentInfoList;

    /**
     * Gets the value of the segmentInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentInfoListType }
     *     
     */
    public SegmentInfoListType getSegmentInfoList() {
        return segmentInfoList;
    }

    /**
     * Sets the value of the segmentInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentInfoListType }
     *     
     */
    public void setSegmentInfoList(SegmentInfoListType value) {
        this.segmentInfoList = value;
    }

}
