package br.com.cet.cms.action;

import java.util.List;

import javax.persistence.EntityManager;

import org.jruby.RubyProcess.Sys;
import org.mentawai.core.BaseAction;

import br.com.cet.cms.modelo.Menu;
import br.com.cet.cms.modelo.MenuCategoria;

/**
 * @authores Glêsio Santos, Francisco Eduardo, Helio, Roberto Marinho e Adriano
 * 
 */
public class MenuAction extends BaseAction implements ICrudAction {

	@Override
	public String cadastro() throws Exception {
		listar();
		listaCategorias();
		return SUCCESS;
	}

	@Override
	public String salvar() throws Exception {

		EntityManager entityManager = (EntityManager) input
				.getValue("entityManager");
		long id_menu = input.getLong("id_menu");
		Menu menu = new Menu();
		MenuCategoria categoria = new MenuCategoria();

		if (id_menu <= 0) {

			categoria = entityManager.find(MenuCategoria.class,
					input.getLong("categorias"));

			menu.setNome_menu((String) input.getValue("nome_menu"));
			menu.setCategorias(categoria);

			entityManager.persist(menu);

		} else {

			categoria = entityManager.find(MenuCategoria.class,
					input.getLong("categorias"));
			menu.setNome_menu((String) input.getValue("nome_menu"));
			menu.setCategorias(categoria);

			input.inject(menu);
			entityManager.persist(menu);

		}

		return SUCCESS;
	}

	@Override
	public String editar() throws Exception {
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");

		Menu buscarMenu = entityManager.find(Menu.class,input.getLong("id_menu"));

		output.setObject(buscarMenu);
		output.setValue("nome_menu", buscarMenu.getNome_menu());
		
		listar();

		return SUCCESS;
	}

	@Override
	public String excluir() throws Exception {
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");

		try {
			Menu buscarMenu = entityManager.find(Menu.class, input.getLong("id_menu"));
			entityManager.remove(buscarMenu);
		} catch (Exception e) {
			output.setValue("error", "Error ao excluir o item");
		}

		listar();
		return SUCCESS;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String listar() throws Exception {
		EntityManager entityManager = (EntityManager) input
				.getValue("entityManager");
		List<Menu> listarMenu = entityManager.createQuery("from Menu")
				.getResultList();

		output.setValue("listarMenu", listarMenu);

		return SUCCESS;
	}

	@Override
	public String buscar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String listaCategorias() throws Exception {
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		@SuppressWarnings("unchecked")
		List<MenuCategoria> listaCategoria = entityManager.createQuery("from MenuCategoria").getResultList();

		output.setValue("listaCategoria", listaCategoria);

		return SUCCESS;
	}

}
