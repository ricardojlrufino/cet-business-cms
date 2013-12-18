package br.com.cet.cms.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @authores Glêsio Santos, Francisco Eduardo, Helio, Roberto Marinho e Adriano
 * 
 */

@Entity
@Table(name="menu")
public class Menu {

	@Id
	@GeneratedValue
	private long id_menu;
	@Column(unique=true)
	private String nome_menu;
	@OneToMany
	private Collection<MenuCategoria> categoria = new ArrayList<MenuCategoria>(); 

	public long getId_menu() {
		return id_menu;
	}

	public void setId_menu(long id_menu) {
		this.id_menu = id_menu;
	}

	public String getNome_menu() {
		return nome_menu;
	}

	public void setNome_menu(String nome_menu) {
		this.nome_menu = nome_menu;
	}

	public Collection<MenuCategoria> getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Collection<MenuCategoria> categoria) {
		this.categoria = categoria;
	}

}
