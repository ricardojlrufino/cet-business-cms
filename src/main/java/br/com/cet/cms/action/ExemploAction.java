package br.com.cet.cms.action;

import java.util.List;

import javax.persistence.EntityManager;

import org.mentawai.core.BaseAction;

import br.com.cet.cms.modelo.Exemplo;

public class ExemploAction extends BaseAction implements ICrudAction{

	public String cadastro()  throws Exception{
		// Não precisa de nenhuma operação, basicamente abre para cadastro.
		// Outras action podem precisar carregar dados para alimentar <Selects> ou outros.
		
		listar(); // Mostrar a listagem na tela de cadastro
		
		return SUCCESS;
	}

	public String salvar()  throws Exception {
		// Carregando o EntityManager usando IoC e MentaContainerFilter
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
		System.err.println("Usando EntityManager = " + entityManager);
		
		long id = input.getLong("id");
		
		// OBS: Tem codigo repetido nas linhas abaixo, tente evitar !!!
		
		if(id <= 0){ // Novo Cadastro
		
			String nome = input.getString("nome");
			Exemplo exemplo = new Exemplo("teste");
			exemplo.setNome(nome);	
			entityManager.persist(exemplo);

		}else{ // Atualizando
			
			String nome = input.getString("nome");
			Exemplo exemplo = entityManager.find(Exemplo.class, input.getLong("id"));
			exemplo.setNome(nome);	
			entityManager.persist(exemplo);
			
		}
		
		return SUCCESS;
	}

	public String editar()  throws Exception {
		// Carregando o EntityManager usando IoC e MentaContainerFilter
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
		Exemplo exemplo = entityManager.find(Exemplo.class, input.getLong("id"));
		
		output.setObject(exemplo); // Extrai todas as propriedades e joga no output
		
		listar(); // Mostrar a listagem na tela de cadastro
		
		return SUCCESS;
	}

	public String excluir()  throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String listar()  throws Exception {
		
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
		List<Exemplo> lista = entityManager.createQuery("from Exemplo").getResultList();
		
		output.setValue("lista", lista);
		
		return SUCCESS;
	}

	public String buscar()  throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	


}
