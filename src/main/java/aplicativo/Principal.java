package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null, "Naruto", "naruto@gmail.com");
		Pessoa p2 = new Pessoa(null, "Hinata", "hinata@gmail.com");
		Pessoa p3 = new Pessoa(null, "Sakura", "sakura@gmail.com");
		Pessoa p4 = new Pessoa(null, "Sasuke", "sasuke@gmail.com");
		
//		abrir conexão com BD
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

//		Inserir dados		
		/*em.getTransaction().begin();
		em.persist(p4);
		em.getTransaction().commit();*/			  


//		Busca no BD
		Pessoa p = em.find(Pessoa.class, 6);
		System.out.println(p);
		
//		remover do BD		
		/*em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();*/

//		fechar conexão com BD
		em.close();
		emf.createEntityManager();

	}
}
