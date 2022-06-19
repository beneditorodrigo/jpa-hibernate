package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		
		if(usuario instanceof Usuario) {
			usuario.setNome("Benedito");
			usuario.setEmail("benedito@lanche.com.br");
			em.merge(usuario);
		} else {
			System.out.println("Usuário não encontrado!");
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
