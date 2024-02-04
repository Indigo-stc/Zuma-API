package com.skhola.zuma.service;

import com.skhola.zuma.exception.ResourceNotFoundException;
import com.skhola.zuma.model.Roster;
import com.skhola.zuma.repository.BaseRepository;
import com.skhola.zuma.repository.RosterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RosterServiceImpl extends BaseServiceImpl<Roster, Long> implements RosterService {

    @Autowired
    private RosterRepository repository;

    public RosterServiceImpl(BaseRepository<Roster, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Roster> findAllByActiveTrueAndTeam_Id(Long id) {
        List<Roster> roster = repository.findAllByActiveTrueAndTeam_Id(id);
        if(roster.isEmpty()) {
            throw new ResourceNotFoundException("There aren't records");
        }
        return roster;
    }
}
