package br.com.reginareis.domain.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_exame")
@Data
public class Exame {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "descricao", length = 300, nullable = false)
	private String descricao;

	@Column(name = "tipo", length = 20)
	private String tipo;

	@Column(name = "observacoes", length = 50)
	private String observacoes;

	@ManyToOne
	@JoinColumn(name = "atendimento_id", nullable = false)
	private Atendimento atendimento;

}