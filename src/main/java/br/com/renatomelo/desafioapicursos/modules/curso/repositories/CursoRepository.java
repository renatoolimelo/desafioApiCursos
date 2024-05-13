package br.com.renatomelo.desafioapicursos.modules.curso.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renatomelo.desafioapicursos.modules.curso.entity.CursoEntity;

public interface CursoRepository extends JpaRepository<CursoEntity, UUID> {
	Optional<CursoEntity> findByNameAndCategory(String name, String category);
}