
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ConversionEurotoDH_QNAME = new QName("http://ws/", "conversionEurotoDH");
    private static final QName _ConversionEurotoDHResponse_QNAME = new QName("http://ws/", "conversionEurotoDHResponse");
    private static final QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");
    private static final QName _LisComptes_QNAME = new QName("http://ws/", "lisComptes");
    private static final QName _LisComptesResponse_QNAME = new QName("http://ws/", "lisComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEurotoDH }
     * 
     * @return
     *     the new instance of {@link ConversionEurotoDH }
     */
    public ConversionEurotoDH createConversionEurotoDH() {
        return new ConversionEurotoDH();
    }

    /**
     * Create an instance of {@link ConversionEurotoDHResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEurotoDHResponse }
     */
    public ConversionEurotoDHResponse createConversionEurotoDHResponse() {
        return new ConversionEurotoDHResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link LisComptes }
     * 
     * @return
     *     the new instance of {@link LisComptes }
     */
    public LisComptes createLisComptes() {
        return new LisComptes();
    }

    /**
     * Create an instance of {@link LisComptesResponse }
     * 
     * @return
     *     the new instance of {@link LisComptesResponse }
     */
    public LisComptesResponse createLisComptesResponse() {
        return new LisComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEurotoDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEurotoDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEurotoDH")
    public JAXBElement<ConversionEurotoDH> createConversionEurotoDH(ConversionEurotoDH value) {
        return new JAXBElement<>(_ConversionEurotoDH_QNAME, ConversionEurotoDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEurotoDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEurotoDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEurotoDHResponse")
    public JAXBElement<ConversionEurotoDHResponse> createConversionEurotoDHResponse(ConversionEurotoDHResponse value) {
        return new JAXBElement<>(_ConversionEurotoDHResponse_QNAME, ConversionEurotoDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LisComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LisComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "lisComptes")
    public JAXBElement<LisComptes> createLisComptes(LisComptes value) {
        return new JAXBElement<>(_LisComptes_QNAME, LisComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LisComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LisComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "lisComptesResponse")
    public JAXBElement<LisComptesResponse> createLisComptesResponse(LisComptesResponse value) {
        return new JAXBElement<>(_LisComptesResponse_QNAME, LisComptesResponse.class, null, value);
    }

}
