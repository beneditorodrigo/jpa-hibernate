package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Carro;

public class NovoCarro {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Carro novoCarro = new Carro("RST03S7", 2018, "FIAT", "Palio", "Vermelho");
		
		em.getTransaction().begin();
		em.persist(novoCarro);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
