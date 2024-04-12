package com.educandoWeb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoWeb.course.entities.User;

@RestController // pra dizer que é um recurso web e é implementado por um contralador Rest
@RequestMapping(value = "/users") // da um nome do recurso
public class UserResource {
	
	@GetMapping // anotação que indica que o método que responde a requisição do tipo get do http
	public ResponseEntity<User> findAll() { // para testar se ta funcionando (ResponseEntity é um tipo especifico do Spring para retornar respostas de requisição web e é um generic)
		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		
		return ResponseEntity.ok().body(u); //ResposeEntity.ok() = retorna uma resposta com sucesso; .body(u) = corpo da resposta do usuario u que acabou de instaciar
	}
}
