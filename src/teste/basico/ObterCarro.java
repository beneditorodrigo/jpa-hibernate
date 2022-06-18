package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Carro;

public class ObterCarro {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Carro carro = em.find(Carro.class, 1L);
		
		System.out.println(carro.getPlaca());
		
		em.close();
		emf.close();
	}

}
