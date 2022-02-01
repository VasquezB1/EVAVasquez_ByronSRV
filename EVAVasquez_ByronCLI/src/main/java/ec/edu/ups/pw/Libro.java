
package ec.edu.ups.pw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para libro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="libro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="editorial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_autor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre_libro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="num_pag" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libro", propOrder = {
    "codigo",
    "editorial",
    "nombreAutor",
    "nombreLibro",
    "numPag"
})
public class Libro {

    protected int codigo;
    protected String editorial;
    @XmlElement(name = "nombre_autor")
    protected String nombreAutor;
    @XmlElement(name = "nombre_libro")
    protected String nombreLibro;
    @XmlElement(name = "num_pag")
    protected int numPag;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     */
    public void setCodigo(int value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad editorial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Define el valor de la propiedad editorial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorial(String value) {
        this.editorial = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAutor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAutor() {
        return nombreAutor;
    }

    /**
     * Define el valor de la propiedad nombreAutor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAutor(String value) {
        this.nombreAutor = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreLibro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreLibro() {
        return nombreLibro;
    }

    /**
     * Define el valor de la propiedad nombreLibro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreLibro(String value) {
        this.nombreLibro = value;
    }

    /**
     * Obtiene el valor de la propiedad numPag.
     * 
     */
    public int getNumPag() {
        return numPag;
    }

    /**
     * Define el valor de la propiedad numPag.
     * 
     */
    public void setNumPag(int value) {
        this.numPag = value;
    }

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", editorial=" + editorial + ", nombreAutor=" + nombreAutor
				+ ", nombreLibro=" + nombreLibro + ", numPag=" + numPag + "]";
	}

    
    
}
