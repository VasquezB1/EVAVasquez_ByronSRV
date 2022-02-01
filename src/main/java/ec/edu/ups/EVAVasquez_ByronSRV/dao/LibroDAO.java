package ec.edu.ups.EVAVasquez_ByronSRV.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.EVAVasquez_ByronSRV.model.Libro;

@Stateless
public class LibroDAO {

	@PersistenceContext
	private EntityManager em;

	public void insert(Libro op) {

		em.persist(op);

	}

	public void upgrade(Libro op) {

		em.merge(op);

	}

	public List<Libro> getList() {

		List<Libro> listado = new ArrayList<Libro>();

		// No se hace consulta a la base sino a la entidad.
		String jpql = "SELECT op FROM Libro op";
		Query query = em.createQuery(jpql, Libro.class);
		listado = query.getResultList();

		// JPQL
		// Alternativa para SQL

		return listado;
	}

}
