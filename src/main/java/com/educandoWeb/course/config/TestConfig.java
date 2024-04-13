package com.educandoWeb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.educandoWeb.course.entities.User;
import com.educandoWeb.course.repositories.UserRepository;

@Configuration //anotação para dizer que é uma classe de configuração
public class TestConfig implements CommandLineRunner { // implementação para executar quando o programa rodar automaticamento, é uma interface por isso tem que implementar a classe run abaixo
	
	@Autowired //injeção de dependencia do spring implicito
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2)); //userRepository metodo saveAll para salvar no bd, e espera uma lista que está sendo com elementos u1 e u2
	}	
}
