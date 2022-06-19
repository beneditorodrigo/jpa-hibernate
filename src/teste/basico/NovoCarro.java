package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Carro;

public class NovoCarro {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Carro carro = new Carro("OBS22A8", 2015, "Renault", "CLIO", "CINZA");
		
		em.getTransaction().begin();
		em.persist(carro);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
