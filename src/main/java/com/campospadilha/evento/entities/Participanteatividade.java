package com.campospadilha.evento.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_participante_atividade")
public class Participanteatividade {

	@EmbeddedId
	private ParticipanteAtividadePK id = new ParticipanteAtividadePK(); // necessario instanciar o atributo quando representação de chave PK

	private Double preco;

	public Participanteatividade() {

	}

	public Participanteatividade(Participante participante, Atividade atividade, Double preco) {

		// atribuição manual dos atributos para configurar a PK
		id.setParticipante(participante);
		id.setAtividade(atividade);

		this.preco = preco;
	}

	//// manipulação dos atributos que configuram a PK
	// busca manual dos atributos que configuram PK
	public Participante getParticipante() {
		return id.getParticipante();
	}

	// atribuição manual dos atributos para configurar a PK
	public void setParticipante(Participante participante) {
		id.setParticipante(participante);
	}

	// busca manual dos atributos que configuram PK
	public Atividade getAtividade() {
		return id.getAtividade();
	}

	// atribuição manual dos atributos para configurar a PK
	public void setAtividade(Atividade atividade) {
		id.setAtividade(atividade);
	}
	////

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
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

		Participanteatividade other = (Participanteatividade) obj;

		return Objects.equals(id, other.id);
	}	
}