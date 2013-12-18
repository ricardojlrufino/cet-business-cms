package br.com.cet.cms.action;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.mentawai.core.BaseAction;
import org.w3c.dom.ls.LSInput;

import br.com.cet.cms.modelo.MenuCategoria;
/** 
 * @authores Glêsio Santos, Francisco Eduardo, Helio, Roberto Marinho e Adriano
 *
 */
public class CategoriaMenuAction extends BaseAction implements ICrudAction{

	
	@Override
	public String cadastro() throws Exception {
		listar();
		return SUCCESS;
	}

	@Override
	public String salvar() throws Exception {
		
		long id = (long) input.getLong("id_cat");
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		MenuCategoria categoria = new MenuCategoria();
		
		if(id <= 0){
			
			categoria.setNome_categoria((String) input.getValue("nome_cat"));
			categoria.setDataCadatro(new Date());
			
			entityManager.persist(categoria);
			
		}else{
			return ERROR;			
		}
				
		
		return SUCCESS;
	}

	@Override
	public String editar() throws Exception {
		
		long id = (long) input.getLong("id_cat");
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
		MenuCategoria buscarCategoria = entityManager.find(MenuCategoria.class, id);
		
		output.setObject(buscarCategoria);
		
		return SUCCESS;
	}

	@Override
	public String excluir() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listar() throws Exception {
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		
		List<MenuCategoria> listar = entityManager.createQuery("from MenuCategoria").getResultList();
		
		output.setValue("lista", listar);
		
		return SUCCESS;
	}

	@Override
	public String buscar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
