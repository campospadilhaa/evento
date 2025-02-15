package com.campospadilha.evento.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade")
public class Atividade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	@Column(columnDefinition = "TEXT") // definição de um texto longo, não somente um varchar
	private String descricao;

	private Double preco;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	@OneToMany(mappedBy = "atividade")
	private Set<Bloco> listaBloco = new HashSet<>();

	@OneToMany(mappedBy = "id.atividade")
	private Set<Participanteatividade> listaParticipanteatividade = new HashSet<>();

	public Atividade() {

	}

	public Atividade(Integer id, Categoria categoria, String nome, String descricao, Double preco, Set<Bloco> listaBloco) {

		this.id = id;
		this.categoria = categoria;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.listaBloco = listaBloco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<Bloco> getListaBloco() {
		return listaBloco;
	}

	public void setListaBloco(Set<Bloco> listaBloco) {
		this.listaBloco = listaBloco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Set<Participanteatividade> getListaParticipanteatividade() {
		return listaParticipanteatividade;
	}

	public void setListaParticipanteatividade(Set<Participanteatividade> listaParticipanteatividade) {
		this.listaParticipanteatividade = listaParticipanteatividade;
	}

	// retorna a lista de products 
	public List<Participante> getInscritos() {
		return listaParticipanteatividade.stream().map(listaParticipanteatividade -> listaParticipanteatividade.getParticipante()).toList();
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

		Atividade other = (Atividade) obj;

		return Objects.equals(id, other.id);
	}
}