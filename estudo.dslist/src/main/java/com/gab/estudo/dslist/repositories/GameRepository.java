package com.gab.estudo.dslist.repositories;

import com.gab.estudo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
