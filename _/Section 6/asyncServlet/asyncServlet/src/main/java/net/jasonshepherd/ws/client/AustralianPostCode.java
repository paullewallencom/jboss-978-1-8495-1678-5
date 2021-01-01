package net.jasonshepherd.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * Australian Postcode ,Location Web service
 *
 * This class was generated by Apache CXF 2.4.6
 * 2013-06-13T10:40:00.631+10:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "AustralianPostCode", 
                  wsdlLocation = "http://www.webservicex.net/AustralianPostCode.asmx?WSDL",
                  targetNamespace = "http://www.webserviceX.NET") 
public class AustralianPostCode extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.webserviceX.NET", "AustralianPostCode");
    public final static QName AustralianPostCodeSoap = new QName("http://www.webserviceX.NET", "AustralianPostCodeSoap");
    public final static QName AustralianPostCodeSoap12 = new QName("http://www.webserviceX.NET", "AustralianPostCodeSoap12");
    public final static QName AustralianPostCodeHttpPost = new QName("http://www.webserviceX.NET", "AustralianPostCodeHttpPost");
    public final static QName AustralianPostCodeHttpGet = new QName("http://www.webserviceX.NET", "AustralianPostCodeHttpGet");
    static {
        URL url = null;
        try {
            url = new URL("http://www.webservicex.net/AustralianPostCode.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AustralianPostCode.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://www.webservicex.net/AustralianPostCode.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public AustralianPostCode(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AustralianPostCode(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AustralianPostCode() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AustralianPostCode(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AustralianPostCode(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AustralianPostCode(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AustralianPostCodeSoap
     */
    @WebEndpoint(name = "AustralianPostCodeSoap")
    public AustralianPostCodeSoap getAustralianPostCodeSoap() {
        return super.getPort(AustralianPostCodeSoap, AustralianPostCodeSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AustralianPostCodeSoap
     */
    @WebEndpoint(name = "AustralianPostCodeSoap")
    public AustralianPostCodeSoap getAustralianPostCodeSoap(WebServiceFeature... features) {
        return super.getPort(AustralianPostCodeSoap, AustralianPostCodeSoap.class, features);
    }
    /**
     *
     * @return
     *     returns AustralianPostCodeSoap
     */
    @WebEndpoint(name = "AustralianPostCodeSoap12")
    public AustralianPostCodeSoap getAustralianPostCodeSoap12() {
        return super.getPort(AustralianPostCodeSoap12, AustralianPostCodeSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AustralianPostCodeSoap
     */
    @WebEndpoint(name = "AustralianPostCodeSoap12")
    public AustralianPostCodeSoap getAustralianPostCodeSoap12(WebServiceFeature... features) {
        return super.getPort(AustralianPostCodeSoap12, AustralianPostCodeSoap.class, features);
    }
    /**
     *
     * @return
     *     returns AustralianPostCodeHttpPost
     */
    @WebEndpoint(name = "AustralianPostCodeHttpPost")
    public AustralianPostCodeHttpPost getAustralianPostCodeHttpPost() {
        return super.getPort(AustralianPostCodeHttpPost, AustralianPostCodeHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AustralianPostCodeHttpPost
     */
    @WebEndpoint(name = "AustralianPostCodeHttpPost")
    public AustralianPostCodeHttpPost getAustralianPostCodeHttpPost(WebServiceFeature... features) {
        return super.getPort(AustralianPostCodeHttpPost, AustralianPostCodeHttpPost.class, features);
    }
    /**
     *
     * @return
     *     returns AustralianPostCodeHttpGet
     */
    @WebEndpoint(name = "AustralianPostCodeHttpGet")
    public AustralianPostCodeHttpGet getAustralianPostCodeHttpGet() {
        return super.getPort(AustralianPostCodeHttpGet, AustralianPostCodeHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AustralianPostCodeHttpGet
     */
    @WebEndpoint(name = "AustralianPostCodeHttpGet")
    public AustralianPostCodeHttpGet getAustralianPostCodeHttpGet(WebServiceFeature... features) {
        return super.getPort(AustralianPostCodeHttpGet, AustralianPostCodeHttpGet.class, features);
    }

}