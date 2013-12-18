package br.com.cet.cms.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Criação da Entidade Usuario e dos campos login e senha 
 */
@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "login", nullable = false)
	private String login;
	@Column(name = "senha", nullable = false)
	private String senha;
	@Column(name = "nome", nullable = false)
	private String nome;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}