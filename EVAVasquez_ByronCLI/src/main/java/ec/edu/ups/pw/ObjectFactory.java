
package ec.edu.ups.pw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.pw package. 
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

    private final static QName _CrearLibro_QNAME = new QName("http://bean.EVAVasquez_ByronSRV.ups.edu.ec/", "crearLibro");
    private final static QName _CrearLibroResponse_QNAME = new QName("http://bean.EVAVasquez_ByronSRV.ups.edu.ec/", "crearLibroResponse");
    private final static QName _GetLibros_QNAME = new QName("http://bean.EVAVasquez_ByronSRV.ups.edu.ec/", "getLibros");
    private final static QName _GetLibrosResponse_QNAME = new QName("http://bean.EVAVasquez_ByronSRV.ups.edu.ec/", "getLibrosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.pw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearLibro }
     * 
     */
    public CrearLibro createCrearLibro() {
        return new CrearLibro();
    }

    /**
     * Create an instance of {@link CrearLibroResponse }
     * 
     */
    public CrearLibroResponse createCrearLibroResponse() {
        return new CrearLibroResponse();
    }

    /**
     * Create an instance of {@link GetLibros }
     * 
     */
    public GetLibros createGetLibros() {
        return new GetLibros();
    }

    /**
     * Create an instance of {@link GetLibrosResponse }
     * 
     */
    public GetLibrosResponse createGetLibrosResponse() {
        return new GetLibrosResponse();
    }

    /**
     * Create an instance of {@link Libro }
     * 
     */
    public Libro createLibro() {
        return new Libro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearLibro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearLibro }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.EVAVasquez_ByronSRV.ups.edu.ec/", name = "crearLibro")
    public JAXBElement<CrearLibro> createCrearLibro(CrearLibro value) {
        return new JAXBElement<CrearLibro>(_CrearLibro_QNAME, CrearLibro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearLibroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearLibroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.EVAVasquez_ByronSRV.ups.edu.ec/", name = "crearLibroResponse")
    public JAXBElement<CrearLibroResponse> createCrearLibroResponse(CrearLibroResponse value) {
        return new JAXBElement<CrearLibroResponse>(_CrearLibroResponse_QNAME, CrearLibroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLibros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLibros }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.EVAVasquez_ByronSRV.ups.edu.ec/", name = "getLibros")
    public JAXBElement<GetLibros> createGetLibros(GetLibros value) {
        return new JAXBElement<GetLibros>(_GetLibros_QNAME, GetLibros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLibrosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLibrosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bean.EVAVasquez_ByronSRV.ups.edu.ec/", name = "getLibrosResponse")
    public JAXBElement<GetLibrosResponse> createGetLibrosResponse(GetLibrosResponse value) {
        return new JAXBElement<GetLibrosResponse>(_GetLibrosResponse_QNAME, GetLibrosResponse.class, null, value);
    }

}
