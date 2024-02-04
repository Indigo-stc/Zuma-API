package com.skhola.zuma.service;

import com.skhola.zuma.exception.ResourceNotFoundException;
import com.skhola.zuma.model.Team;
import com.skhola.zuma.repository.BaseRepository;
import com.skhola.zuma.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl extends BaseServiceImpl<Team, Long> implements TeamService {

    @Autowired
    private TeamRepository repository;

    public TeamServiceImpl(BaseRepository<Team, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Team> findByActiveTrue() {
        List<Team> temas = repository.findByActiveTrue();
        if (temas.isEmpty()) {
            throw new ResourceNotFoundException("There aren't active teams");
        }
        return temas;
    }

    @Override
    public Team activateTeam(Long id) {
        Optional<Team> current = repository.findById(id);
        if (current.isEmpty()) {
            throw new ResourceNotFoundException("Team doesn't exist ");
        }
        Team activate = current.get();
        if (activate.isActive()) {
            activate.setActive(false);
        }
        activate.setActive(true);
        repository.save(activate);
        return activate;
    }

}
