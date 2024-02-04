package com.skhola.zuma.service;

import com.skhola.zuma.model.Roster;

import java.util.List;

public interface RosterService extends BaseService<Roster, Long> {

    List<Roster> findAllByActiveTrueAndTeam_Id(Long id);

}
