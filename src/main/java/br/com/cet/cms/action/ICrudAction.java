package br.com.cet.cms.action;

public interface ICrudAction {
	
	/**
	 * Action que tem por finalizade abrir o formulário de cadastro
	 */
	public String cadastro() throws Exception;
	
	/**
	 * Action responsável por salvar um novo cadastro ou fazer a atualização do mesmo
	 */
	public String salvar()  throws Exception;
	
	/**
	 * Action responsável carregar os dados do Banco de Dados e abrir o formulário para edição.
	 */
	public String editar()  throws Exception;
	
	/**
	 * Excluir o registro do banco de dados por ID
	 */
	public String excluir()  throws Exception;
	
	public String listar()  throws Exception;
	
	public String buscar()  throws Exception;
	
}
