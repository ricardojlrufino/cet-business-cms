package br.com.cet.cms.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cet.cms.modelo.Exemplo;

public class AlimentarBanco {
	public static void main(String[] args) {
		 	EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
		    EntityManager entityManager = factory.createEntityManager();
		    
		    Exemplo exemplo = new Exemplo("Desenvolvimento");
		    
		    entityManager.getTransaction().begin();
		    entityManager.persist(exemplo);
		    entityManager.getTransaction().commit();
		    
		    factory.close();
	}
}
