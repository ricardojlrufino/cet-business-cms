package br.com.cet.cms.action;

import java.util.List;

import javax.persistence.EntityManager;

import org.mentawai.core.BaseAction;

import br.com.cet.cms.modelo.Usuario;

public class UsuarioAction extends BaseAction implements ICrudAction{

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
		Usuario usuario;
		
		if(id <= 0){ // Novo Cadastro
		
			usuario = input.getObject(Usuario.class);			

		}else{ // Atualizando
			
			usuario = entityManager.find(Usuario.class, input.getLong("id"));
			input.inject(usuario);				
			
		}
		
		try {
			entityManager.persist(usuario);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return SUCCESS;
	}

	public String editar()  throws Exception {
		// Carregando o EntityManager usando IoC e MentaContainerFilter
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
		Usuario usuario = entityManager.find(Usuario.class, input.getLong("id"));
		
		output.setObject(usuario); // Extrai todas as propriedades e joga no output
		
		listar(); // Mostrar a listagem na tela de cadastro
		
		return SUCCESS;
	}

	public String excluir()  throws Exception {
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
	    try {
	    	Usuario usuario = entityManager.find(Usuario.class, input.getLong("id"));
	      
	      entityManager.remove(usuario);
	    } catch (Exception e) {	    	
	    	output.setValue("erro", e.getMessage());
	    } 
	    listar(); // Mostrar a listagem na tela de cadastro
		return SUCCESS;
	}

	public String listar()  throws Exception {
		
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
		@SuppressWarnings("unchecked")
		List<Usuario> lista = entityManager.createQuery("from Usuario").getResultList();
		
		output.setValue("lista", lista);
		
		return SUCCESS;
	}

	public String buscar()  throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	


}


