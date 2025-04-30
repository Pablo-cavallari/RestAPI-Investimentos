package br.com.unicuritiba.projectinvestimento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.projectinvestimento.models.User;

public interface UserRepository 
	extends JpaRepository<User, Long> {

}
