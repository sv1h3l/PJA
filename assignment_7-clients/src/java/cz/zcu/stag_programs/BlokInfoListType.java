
package cz.zcu.stag_ws;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blokInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="blokInfoListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="blokInfo" type="{http://stag-ws.zcu.cz/}blokInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blokInfoListType", propOrder = {
    "blokInfo"
})
public class BlokInfoListType {

    @XmlElement(nillable = true)
    protected List<BlokInfoType> blokInfo;

    /**
     * Gets the value of the blokInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the blokInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlokInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlokInfoType }
     * 
     * 
     * @return
     *     The value of the blokInfo property.
     */
    public List<BlokInfoType> getBlokInfo() {
        if (blokInfo == null) {
            blokInfo = new ArrayList<>();
        }
        return this.blokInfo;
    }

}
