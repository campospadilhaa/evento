package com.campospadilha.evento.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// Class que representa a PK COMPOSTA da tabela Participanteatividade
@Embeddable
public class ParticipanteAtividadePK {

	@ManyToOne
	@JoinColumn(name = "participante_id")
	private Participante participante;

	@ManyToOne
	@JoinColumn(name = "atividade_id")
	private Atividade atividade;

	public ParticipanteAtividadePK() {

	}

	public Participante getParticipante() {
		return participante;
	}
	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(participante, atividade);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		ParticipanteAtividadePK other = (ParticipanteAtividadePK) obj;

		return Objects.equals(participante, other.participante) && Objects.equals(atividade, other.atividade);
	}
}