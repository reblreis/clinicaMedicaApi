package br.com.reginareis.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reginareis.domain.entities.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, UUID> {

}
