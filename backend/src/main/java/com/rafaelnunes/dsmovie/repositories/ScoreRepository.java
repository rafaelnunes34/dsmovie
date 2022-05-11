package com.rafaelnunes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelnunes.dsmovie.entities.Score;
import com.rafaelnunes.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
