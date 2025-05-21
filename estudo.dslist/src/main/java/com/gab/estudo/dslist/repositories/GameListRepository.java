package com.gab.estudo.dslist.repositories;

import com.gab.estudo.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
