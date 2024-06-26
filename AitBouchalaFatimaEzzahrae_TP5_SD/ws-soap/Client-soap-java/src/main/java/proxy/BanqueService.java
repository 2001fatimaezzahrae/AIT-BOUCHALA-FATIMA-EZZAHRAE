
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws/BanqueService/getCompteRequest", output = "http://ws/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "lisComptes", targetNamespace = "http://ws/", className = "proxy.LisComptes")
    @ResponseWrapper(localName = "lisComptesResponse", targetNamespace = "http://ws/", className = "proxy.LisComptesResponse")
    @Action(input = "http://ws/BanqueService/lisComptesRequest", output = "http://ws/BanqueService/lisComptesResponse")
    public List<Compte> lisComptes();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEurotoDH", targetNamespace = "http://ws/", className = "proxy.ConversionEurotoDH")
    @ResponseWrapper(localName = "conversionEurotoDHResponse", targetNamespace = "http://ws/", className = "proxy.ConversionEurotoDHResponse")
    @Action(input = "http://ws/BanqueService/conversionEurotoDHRequest", output = "http://ws/BanqueService/conversionEurotoDHResponse")
    public double conversionEurotoDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}
