package br.com.cet.cms.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @authores Gl�sio Santos, Francisco Eduardo, Helio, Roberto Marinho e Adriano
 * 
 */

@Entity(name = "menu")
public class Menu {

	@Id
	@GeneratedValue
	private long id_menu;
	@Column(unique=true)
	private String nome_menu;
	@OneToMany
	private MenuCategoria categoria;

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

	public MenuCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(MenuCategoria categoria) {
		this.categoria = categoria;
	}

}
