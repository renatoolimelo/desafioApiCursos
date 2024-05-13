package br.com.renatomelo.desafioapicursos.modules.exceptions;

public class UserFoundException extends RuntimeException{

	public UserFoundException() {
		super("Curso já existe");
	}
	
}
