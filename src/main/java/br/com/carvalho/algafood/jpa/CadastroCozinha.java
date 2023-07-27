package br.com.carvalho.algafood.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.carvalho.algafood.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CadastroCozinha {

	@PersistenceContext
	private EntityManager manager;
	
	public List<Cozinha> listar() {
		return manager.createQuery("from Cozinha", Cozinha.class)
				.getResultList();
	}
	
}
