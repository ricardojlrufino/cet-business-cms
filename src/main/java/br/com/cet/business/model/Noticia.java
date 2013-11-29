package br.com.cet.business.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/** 
 * @authores Jivago, Bruno, marcelo, Alexandre
 *
 */

@Entity
@Table(name = "noticia")
public class Noticia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String titulo;
	private String resumo;
	private String imagem;
	private String link;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataHoraCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataAtualizacao;

	@ManyToOne
	@JoinColumn(name = "autor_id")
	private Autor autor;

	@OneToMany(mappedBy = "noticia")
	private List<Comentario> comentarios = new ArrayList<Comentario>();

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private CategoriaNoticia categoriaNoticia;

	@OneToMany(mappedBy = "noticia")
	private List<ImagemNoticia> imagemNoticias = new ArrayList<ImagemNoticia>();

	@OneToOne
	@JoinColumn(name = "imagem_capa")
	private ImagemNoticia imagemCapa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public ImagemNoticia getImagemCapa() {
		return imagemCapa;
	}

	public void setImagemCapa(ImagemNoticia imagemCapa) {
		this.imagemCapa = imagemCapa;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Calendar getDataHoraCadastro() {
		return dataHoraCadastro;
	}

	public void setDataHoraCadastro(Calendar dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public CategoriaNoticia getCategoriaNoticia() {
		return categoriaNoticia;
	}

	public void setCategoriaNoticia(CategoriaNoticia categoriaNoticia) {
		this.categoriaNoticia = categoriaNoticia;
	}

	public List<ImagemNoticia> getImagemNoticias() {
		return imagemNoticias;
	}

	public void setImagemNoticias(List<ImagemNoticia> imagemNoticias) {
		this.imagemNoticias = imagemNoticias;
	}

}
