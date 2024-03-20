package br.com.reginareis.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reginareis.domain.entities.Exame;

public interface ExameRepository extends JpaRepository<Exame, UUID> {

}
