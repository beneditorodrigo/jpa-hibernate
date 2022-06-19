package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Carro;

public class ObterCarros {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select c from Carro c";
		TypedQuery<Carro> query = em.createQuery(jpql, Carro.class);
		
		List<Carro> carros = query.getResultList();
		
		for(Carro carro: carros) {
			System.out.println("ID: " + carro.getId()
			+ " Placa: " + carro.getPlaca());
		}
		
		em.close();
		emf.close();
	}

}
