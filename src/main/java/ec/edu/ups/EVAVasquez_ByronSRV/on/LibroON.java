package ec.edu.ups.EVAVasquez_ByronSRV.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.EVAVasquez_ByronSRV.dao.LibroDAO;
import ec.edu.ups.EVAVasquez_ByronSRV.model.Libro;

@Stateless
public class LibroON {

	@Inject
	private LibroDAO libroDAO;
	
	public void crearLibro(Libro libro) {
		if( libroDAO.read(libro.getCodigo())!= null) {
			libroDAO.upgrade(libro);
		}else {
			libroDAO.insert(libro);
		}
	}
	
	public List<Libro> getLibros(){
		return libroDAO.getList();
	}
	
	
}
