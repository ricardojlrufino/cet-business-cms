package br.com.cet.cms.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * @authores Glêsio Santos, Francisco Eduardo, Helio, Roberto Marinho e Adriano
 *
 */

@Entity
@Table(name="menuCategoria")
public class MenuCategoria {

	@Id
	@GeneratedValue
	private long id_categoria;
	@Column(unique=true)
	private String nome_categoria;
	@Temporal(TemporalType.DATE)
	private Date dataCadatro;

	public long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNome_categoria() {
		return nome_categoria;
	}

	public void setNome_categoria(String nome_categoria) {
		this.nome_categoria = nome_categoria;
	}

	public Date getDataCadatro() {
		return dataCadatro;
	}

	public void setDataCadatro(Date dataCadatro) {
		this.dataCadatro = dataCadatro;
	}

}
