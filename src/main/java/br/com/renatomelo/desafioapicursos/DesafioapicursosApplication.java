package br.com.renatomelo.desafioapicursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "br.com.renatomelo.desafioapicursos.modules.curso.entity")
@SpringBootApplication
public class DesafioapicursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioapicursosApplication.class, args);
	}

}
