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
public class CategoriaMenuAction extends BaseAction implements ICrudAction {

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
			

		if (id <= 0) {
			categoria.setNome_categoria((String) input.getValue("nome_cat"));
			categoria.setDataCadatro(new Date());

			entityManager.persist(categoria);

		} else {
			MenuCategoria categoriaResult = entityManager.find(MenuCategoria.class, input.getLong("id_cat"));
			categoriaResult.setNome_categoria((String) input.getValue("nome_cat"));
			entityManager.persist(categoriaResult);
			
			
		}

		return SUCCESS;
	}

	@Override
	public String editar() throws Exception {

		EntityManager entityManager = (EntityManager) input.getValue("entityManager");

		MenuCategoria buscarCategoria = entityManager.find(MenuCategoria.class,input.getLong("id_cat"));

		System.out.println(buscarCategoria.getNome_categoria());

		output.setObject(buscarCategoria);
		output.setValue("nome_cat", buscarCategoria.getNome_categoria());
		
		listar();

		return SUCCESS;
	}

	@Override
	public String excluir() throws Exception {
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");

		try {
			MenuCategoria buscarCategoria = entityManager.find(MenuCategoria.class,input.getLong("id_cat"));
			entityManager.remove(buscarCategoria);
		} catch (Exception e) {
			output.setValue("error", "Error ao excluir o item");
		}
		
		listar();
		return SUCCESS;
	}

	@SuppressWarnings("unchecked")
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
