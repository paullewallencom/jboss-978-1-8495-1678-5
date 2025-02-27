package net.jasonshepherd.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2013-06-13T10:40:00.528+10:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET", name = "AustralianPostCodeSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface AustralianPostCodeSoap {

    /**
     * Get Australian Location by partial / full Postcode
     */
    @WebResult(name = "GetAustralianLocationByPostCodeResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetAustralianLocationByPostCode", targetNamespace = "http://www.webserviceX.NET", className = "net.jasonshepherd.ws.client.GetAustralianLocationByPostCode")
    @WebMethod(operationName = "GetAustralianLocationByPostCode", action = "http://www.webserviceX.NET/GetAustralianLocationByPostCode")
    @ResponseWrapper(localName = "GetAustralianLocationByPostCodeResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.jasonshepherd.ws.client.GetAustralianLocationByPostCodeResponse")
    public java.lang.String getAustralianLocationByPostCode(
        @WebParam(name = "PostCode", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String postCode
    );

    /**
     * Get Australian Postcode by partial / full Location Name
     */
    @WebResult(name = "GetAustralianPostCodeByLocationResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetAustralianPostCodeByLocation", targetNamespace = "http://www.webserviceX.NET", className = "net.jasonshepherd.ws.client.GetAustralianPostCodeByLocation")
    @WebMethod(operationName = "GetAustralianPostCodeByLocation", action = "http://www.webserviceX.NET/GetAustralianPostCodeByLocation")
    @ResponseWrapper(localName = "GetAustralianPostCodeByLocationResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.jasonshepherd.ws.client.GetAustralianPostCodeByLocationResponse")
    public java.lang.String getAustralianPostCodeByLocation(
        @WebParam(name = "Location", targetNamespace = "http://www.webserviceX.NET")
        java.lang.String location
    );
}
