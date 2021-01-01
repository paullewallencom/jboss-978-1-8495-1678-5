
package net.jasonshepherd.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetAustralianPostCodeByLocationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getAustralianPostCodeByLocationResult"
})
@XmlRootElement(name = "GetAustralianPostCodeByLocationResponse")
public class GetAustralianPostCodeByLocationResponse {

    @XmlElement(name = "GetAustralianPostCodeByLocationResult")
    protected String getAustralianPostCodeByLocationResult;

    /**
     * Gets the value of the getAustralianPostCodeByLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAustralianPostCodeByLocationResult() {
        return getAustralianPostCodeByLocationResult;
    }

    /**
     * Sets the value of the getAustralianPostCodeByLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAustralianPostCodeByLocationResult(String value) {
        this.getAustralianPostCodeByLocationResult = value;
    }

}
