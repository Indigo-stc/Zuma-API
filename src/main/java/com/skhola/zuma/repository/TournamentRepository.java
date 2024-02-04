package com.skhola.zuma.repository;

import com.skhola.zuma.model.Tournament;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends BaseRepository<Tournament, Long> {
}
