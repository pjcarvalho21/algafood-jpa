package br.com.carvalho.algafood.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_restaurante")
public class Restaurante {
	@Id
	private Long id;
	@Column(name = "nome_cozinha")
	private String nome;
	@Column(name = "taxa_frete")
	private BigDecimal taxa_frete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public BigDecimal getTaxa_frete() {
		return taxa_frete;
	}

	public void setTaxa_frete(BigDecimal taxa_frete) {
		this.taxa_frete = taxa_frete;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurante other = (Restaurante) obj;
		return Objects.equals(id, other.id);
	}

}
