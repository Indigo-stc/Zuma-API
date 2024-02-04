package com.skhola.zuma.repository;

import com.skhola.zuma.model.Team;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends BaseRepository<Team, Long> {

    List<Team> findByActiveTrue();

}
