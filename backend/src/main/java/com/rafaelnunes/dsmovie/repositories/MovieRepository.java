package com.rafaelnunes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelnunes.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
