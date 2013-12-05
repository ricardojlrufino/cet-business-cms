package br.com.cet.cms.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Exemplo {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	
	public Exemplo() {
	}
	
	public Exemplo(String nome) {
		super();
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
