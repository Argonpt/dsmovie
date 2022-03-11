package com.projetos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.dsmovie.entities.Score;
import com.projetos.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	
}
