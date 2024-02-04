package com.skhola.zuma.repository;

import com.skhola.zuma.model.Player;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends BaseRepository<Player, Long> {
}
