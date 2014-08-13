
package br.com.magabrew.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.magabrew.service package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _ListarCervejas_QNAME = new QName("http://service.magabrew.com.br/", "listarCervejas");
    private final static QName _ListarCervejasResponse_QNAME = new QName("http://service.magabrew.com.br/", "listarCervejasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.magabrew.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarCervejasResponse }
     * 
     */
    public ListarCervejasResponse createListarCervejasResponse() {
        return new ListarCervejasResponse();
    }

    /**
     * Create an instance of {@link ListarCervejas_Type }
     * 
     */
    public ListarCervejas_Type createListarCervejas_Type() {
        return new ListarCervejas_Type();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCervejas_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.magabrew.com.br/", name = "listarCervejas")
    public JAXBElement<ListarCervejas_Type> createListarCervejas(ListarCervejas_Type value) {
        return new JAXBElement<ListarCervejas_Type>(_ListarCervejas_QNAME, ListarCervejas_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCervejasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.magabrew.com.br/", name = "listarCervejasResponse")
    public JAXBElement<ListarCervejasResponse> createListarCervejasResponse(ListarCervejasResponse value) {
        return new JAXBElement<ListarCervejasResponse>(_ListarCervejasResponse_QNAME, ListarCervejasResponse.class, null, value);
    }

}
