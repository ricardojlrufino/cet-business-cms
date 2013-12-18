package br.com.cet.cms.modelo;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Criação da Entidade Cliente e da tabela do mesmo//
 */
	@ Entity
	@Table (name = "Cliente")
	public class Cliente implements Serializable{
		
		/**
		 * Id gerado ao cadastrar-se no banco
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue
		private int id;
		// alterei situação tava com interogação e cedilha //
	 //nullable false faz  que os dados não possam estar nulos ou seja o cadastro deles é obrigatorio//
	 
		
		private String situacao;
		  @Column(name = "status",nullable = false)
		private Boolean status;
		  
		  @OneToOne
		private Usuario usuario;
		  @Column(name = "nome",nullable = false)
		private String nome;
		  @Column(name = "cpf",nullable = false)
		private String cpf;
		  @Column(name = "rg",nullable = false)
		private String rg;
		
	   @Column(name = "dataNascimento",nullable = false)
	   @Temporal(TemporalType.DATE)
		private Date datNasc;
	   @Column(name = "sexo",nullable = false)
		private String sexo;
	   @Column(name = "logradouro",nullable = false)
		private String logradouro;
	   @Column(name = "logradouroNumero",nullable = false)
		private int logradouroNumero;
	   @Column(name = "telefone",nullable = false)
		private String telefone;
	   @Column(name = "cidade",nullable = false)
		private String cidade;
	   @Column(name = "uf",nullable = false)
		private String uf;
	   @Column(name = "bairro",nullable = false)
		private String bairro;

	   public Cliente() {
		}
		
		public Cliente(String nome) {
			super();
			this.nome = nome;
		}
	   
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public Date getDatNasc() {
			return datNasc;
		}

		public void setDatNasc(Date datNasc) {
			this.datNasc = datNasc;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}


		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getUf() {
			return uf;
		}

		public void setUf(String uf) {
			this.uf = uf;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}


		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public int getLogradouroNumero() {
			return logradouroNumero;
		}

		public void setLogradouroNumero(int logradouroNumero) {
			this.logradouroNumero = logradouroNumero;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSituacao() {
			return situacao;
		}

		public void setSituacao(String situacao) {
			this.situacao = situacao;
		}

		public Boolean getStatus() {
			return status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}
		
		
		
	}
