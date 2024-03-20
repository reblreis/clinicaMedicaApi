package br.com.reginareis.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reginareis.domain.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, UUID> {

}
