package br.com.renatomelo.desafioapicursos.modules.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.renatomelo.desafioapicursos.modules.curso.entity.CursoEntity;
import br.com.renatomelo.desafioapicursos.modules.curso.useCases.CreateCursoUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	public CreateCursoUseCase createCursoUseCase;

	@PostMapping("")
	public ResponseEntity<Object> create(@Valid @RequestBody CursoEntity cursoEntity) {

		try {
			CursoEntity result = this.createCursoUseCase.execute(cursoEntity);
			return ResponseEntity.ok().body(result);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}

	}

}
