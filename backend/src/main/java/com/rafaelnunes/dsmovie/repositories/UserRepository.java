package com.rafaelnunes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelnunes.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
