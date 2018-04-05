package br.com.bookstore.loja.daos;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.bookstore.loja.models.Autor;

public class AutorDao {

//	@PersistenceContext
//	private EntityManager manager;
	public List<Autor> listar(){	
		//return manager.createQuery("select a from Autor a",Autor.class).getResultList();
		return Arrays.asList(new Autor(1, "Paulo Silveira"), new Autor(2, "Sérgio Lopes"), new Autor(3, "Guilherme Silveira"), new Autor(4, "Albeto Souza"));
	}
}
