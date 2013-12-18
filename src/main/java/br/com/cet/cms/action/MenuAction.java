package br.com.cet.cms.action;

import java.util.List;

import javax.persistence.EntityManager;

import org.mentawai.core.BaseAction;

import br.com.cet.cms.modelo.Menu;

public class MenuAction extends BaseAction implements ICrudAction{

	@Override
	public String cadastro() throws Exception {
		listar();
		return SUCCESS;
	}

	@Override
	public String salvar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String excluir() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listar() throws Exception {
		EntityManager entityManager = (EntityManager) input.getValue("entityManager");
		List<Menu> listarMenu = entityManager.createQuery("from Menu").getResultList();
		
		output.setValue("listarMenu", listarMenu);
		
		return SUCCESS;
	}

	@Override
	public String buscar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
