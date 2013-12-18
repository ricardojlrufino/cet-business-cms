package br.com.cet.cms.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cet.cms.modelo.Cliente;
import br.com.cet.cms.modelo.Exemplo;
import br.com.cet.cms.modelo.Usuario;

public class AlimentarBanco {
	public static void main(String[] args) {
		 	EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
		    EntityManager entityManager = factory.createEntityManager();
		    
		    Exemplo exemplo = new Exemplo("Desenvolviccccmento");
		    
		    Usuario u = new Usuario();
		    u.setLogin("ssss");
		    u.setSenha("1234");
		    
		    Cliente c = new Cliente();
		    c.setUsuario(u);
		    
		    //Cliente cliente = new Cliente("Desenvolvimento");
		    entityManager.getTransaction().begin();
		    entityManager.persist(c);
		    entityManager.getTransaction().commit();
		    
		    factory.close();
	}
}
