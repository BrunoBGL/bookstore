package br.com.bookstore.loja.daos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.bookstore.loja.models.Autor;
import br.com.bookstore.loja.models.Livro;

public class LivroDao {

	// private EntityManagerFactory emf =
	// Persistence.createEntityManagerFactory("bookstore");
	//
	// private EntityManager manager = emf.createEntityManager();

	public void salvar(Livro livro) {
		System.out.println(livro);
	}

	public List<Livro> listar(){	
//		String jpql ="select distinct(l) from Livro l join fech l.autores ";
//		return ManageReferralControl.createQuery(jpql, Livro.class).getResultList();
		List<Livro> livros = new ArrayList<>();
		List<Autor> autores = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			int numeroAleatorio = (int)(Math.random()*3);	

			for (int j = 1; j <= numeroAleatorio; j++) {
				autores.add(new Autor(Integer.valueOf(j), "Autor"+i));
			}
			livros.add(new Livro(Integer.valueOf(i), "Livro"+i, "descricao"+1, BigDecimal.valueOf(i*3), Integer.valueOf(i*100), autores));
		}
		
		return livros;
		
	}
}
