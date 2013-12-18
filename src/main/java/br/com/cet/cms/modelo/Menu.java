package br.com.cet.cms.modelo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@ManyToOne
	@JoinColumn(name="cat_id")
	private MenuCategoria categorias; 

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

	public MenuCategoria getCategorias() {
		return categorias;
	}
	
	public void setCategorias(MenuCategoria categorias) {
		this.categorias = categorias;
	}

}
