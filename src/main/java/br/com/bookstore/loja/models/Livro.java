package br.com.bookstore.loja.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity
public class Livro {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	
	private String titulo;
	
	@Lob
	private String descricao;
	private BigDecimal preco;
	
	private Integer numeroPaginas;
	
	@ManyToMany
	private List<Autor> autores = new ArrayList<>();
	
	public Livro() {
		super();
	}
	
	public Livro(Integer id, String titulo, String descricao, BigDecimal preco, Integer numeroPaginas,
			List<Autor> autores) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
		this.numeroPaginas = numeroPaginas;
		this.autores = autores;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", preco=" + preco
				+ ", numeroPaginas=" + numeroPaginas + ", autores=" + autores + "]";
	}
	
	
	
	
}
