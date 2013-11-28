package br.com.cet.business.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comentario")
public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String email;
	private String conteudo;
	private Calendar dataHoraComentario;
	
	@ManyToOne
	@JoinColumn(name = "noticia_id")
	private Noticia notica;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Calendar getDataHoraComentario() {
		return dataHoraComentario;
	}

	public void setDataHoraComentario(Calendar dataHoraComentario) {
		this.dataHoraComentario = dataHoraComentario;
	}

	public Noticia getNotica() {
		return notica;
	}

	public void setNotica(Noticia notica) {
		this.notica = notica;
	}

}
