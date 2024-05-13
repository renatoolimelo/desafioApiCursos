package br.com.renatomelo.desafioapicursos.modules.curso.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.renatomelo.desafioapicursos.modules.curso.entity.CursoEntity;
import br.com.renatomelo.desafioapicursos.modules.curso.repositories.CursoRepository;
import br.com.renatomelo.desafioapicursos.modules.exceptions.UserFoundException;

@Service
public class CreateCursoUseCase {

	@Autowired
	private CursoRepository cursoRepository;

	public CursoEntity execute(CursoEntity cursoEntity) {
		this.cursoRepository.findByNameAndCategory(cursoEntity.getName(), cursoEntity.getCategory())
				.ifPresent((user) -> {
					throw new UserFoundException();
				});

		return this.cursoRepository.save(cursoEntity);
	}

}
