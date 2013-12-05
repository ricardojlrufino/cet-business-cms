package br.com.cet.cms.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Criação da Entidade Produto e da tabela do mesmo//
 */
	@ Entity
	@Table (name = "Produto")
 public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "preco",nullable = false)
	private float preco;
	@Column(name = "categoria",nullable = false)
	private String categoria;
	@Column(name = "subcategoria",nullable = false)
	private String subcategoria;
	@Column(name = "descricao",nullable = false)
	private String descricao;
	@Column(name = "desconto",nullable = false)
	private float desconto;
	@Column(name = "status",nullable = false)
	private String status;
	@Column(name = "fornecedor",nullable = false)
	private String fornecedor;
	@Column(name = "fabricante",nullable = false)
	private String fabricante;
	@Column(name = "emb_compra",nullable = false)
	private String emb_compra;
	@Column(name = "emb_venda",nullable = false)
	private String emb_venda;
	@Column(name = "codbar",nullable = false)
	private String codbar;
	@Column(name = "nome_popular",nullable = true)
	private String nome_popular;
	 @Column(name = "qte_embalagem",nullable = false)
	private Double qte_embalagem;
	 @Column(name = "fracao",nullable = false)
	private Double fracao;
	 @Column(name = "und_fracao",nullable = false)
	private String und_fracao;

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getEmb_compra() {
		return emb_compra;
	}

	public void setEmb_compra(String emb_compra) {
		this.emb_compra = emb_compra;
	}

	public String getEmb_venda() {
		return emb_venda;
	}

	public void setEmb_venda(String emb_venda) {
		this.emb_venda = emb_venda;
	}

	public String getCodbar() {
		return codbar;
	}

	public void setCodbar(String codbar) {
		this.codbar = codbar;
	}

	public String getNome_popular() {
		return nome_popular;
	}

	public void setNome_popular(String nome_popular) {
		this.nome_popular = nome_popular;
	}

	public Double getQte_embalagem() {
		return qte_embalagem;
	}

	public void setQte_embalagem(Double qte_embalagem) {
		this.qte_embalagem = qte_embalagem;
	}

	public Double getFracao() {
		return fracao;
	}

	public void setFracao(Double fracao) {
		this.fracao = fracao;
	}

	public String getUnd_fracao() {
		return und_fracao;
	}

	public void setUnd_fracao(String und_fracao) {
		this.und_fracao = und_fracao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
