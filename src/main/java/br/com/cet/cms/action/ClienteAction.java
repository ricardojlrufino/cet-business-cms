package br.com.cet.cms.action;

import java.util.List;

import javax.persistence.EntityManager;

import org.mentawai.core.BaseAction;

import br.com.cet.cms.modelo.Cliente;

public class ClienteAction extends BaseAction implements ICrudAction{

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
		Cliente cliente;
		
		if(id <= 0){ // Novo Cadastro
		
			cliente = input.getObject(Cliente.class);			

		}else{ // Atualizando
			
			cliente = entityManager.find(Cliente.class, input.getLong("id"));
			input.inject(cliente);				
			
		}
		
		try {
			entityManager.persist(cliente);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return SUCCESS;
	}

	public String editar()  throws Exception {
		// Carregando o EntityManager usando IoC e MentaContainerFilter
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
		Cliente cliente = entityManager.find(Cliente.class, input.getLong("id"));
		
		output.setObject(cliente); // Extrai todas as propriedades e joga no output
		
		listar(); // Mostrar a listagem na tela de cadastro
		
		return SUCCESS;
	}

	public String excluir()  throws Exception {
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
	    try {
	    	Cliente cliente = entityManager.find(Cliente.class, input.getLong("id"));
	      
	      entityManager.remove(cliente);
	    } catch (Exception e) {	    	
	    	output.setValue("erro", e.getMessage());
	    } 
	    listar(); // Mostrar a listagem na tela de cadastro
		return SUCCESS;
	}

	public String listar()  throws Exception {
		
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
		@SuppressWarnings("unchecked")
		List<Cliente> lista = entityManager.createQuery("from Exemplo").getResultList();
		
		output.setValue("lista", lista);
		
		return SUCCESS;
	}

	public String buscar()  throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	


}

