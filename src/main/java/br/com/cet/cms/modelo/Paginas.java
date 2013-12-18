package br.com.cet.cms.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @authores Glêsio Santos, Francisco Eduardo, Helio, Roberto Marinho e Adriano
 * 
 */
@Entity(name = "paginas")
public class Paginas {

	@Id
	@GeneratedValue
	private long id_pagina;
	@Column(unique = true)
	private String titulo_pagina;
	private String link_pagina;
	@OneToOne
	private Menu menu;

	public long getId_pagina() {
		return id_pagina;
	}

	public void setId_pagina(long id_pagina) {
		this.id_pagina = id_pagina;
	}

	public String getTitulo_pagina() {
		return titulo_pagina;
	}

	public void setTitulo_pagina(String titulo_pagina) {
		this.titulo_pagina = titulo_pagina;
	}

	public String getLink_pagina() {
		return link_pagina;
	}

	public void setLink_pagina(String link_pagina) {
		this.link_pagina = link_pagina;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}
