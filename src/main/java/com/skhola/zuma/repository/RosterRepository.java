package com.skhola.zuma.repository;

import com.skhola.zuma.model.Roster;
import com.skhola.zuma.model.Team;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RosterRepository extends BaseRepository<Roster, Long> {

    List<Roster> findAllByActiveTrueAndTeam_Id(Long id);

}
