package com.skhola.zuma.service;

import com.skhola.zuma.model.Team;

import java.util.List;

public interface TeamService extends BaseService<Team, Long> {

    List<Team> findByActiveTrue();

    Team activateTeam(Long id);

}
