package com.educandoWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWeb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> { // nao vai precisar implementar por causa que o jpaRepository já tem uma implementação padrao para essa interface
	
}
