package ec.edu.ups.EVAVasquez_ByronSRV.bean;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.EVAVasquez_ByronSRV.model.Libro;
import ec.edu.ups.EVAVasquez_ByronSRV.on.LibroON;

@WebService
public class LibroSOAP {

	@Inject
	private LibroON libroON;
	
	@WebMethod
	public String crearLibro(Libro libro) {
		try {
			libroON.crearLibro(libro);
			return "Libro Creado";
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
			
	}
	
	@WebMethod
	public List<Libro> getLibros(){
		return libroON.getLibros();
	}
}
