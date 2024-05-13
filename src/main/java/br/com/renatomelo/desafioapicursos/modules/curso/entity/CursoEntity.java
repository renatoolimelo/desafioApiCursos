package br.com.renatomelo.desafioapicursos.modules.curso.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity(name = "cursos")
public class CursoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String category;
	
	@NotNull
	private Boolean active;
	
	@CreationTimestamp
	private LocalDateTime created_at;
	
	@CreationTimestamp
	private LocalDateTime updated_at;

}