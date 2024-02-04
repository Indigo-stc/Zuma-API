package com.skhola.zuma.service;

import com.skhola.zuma.model.Tournament;
import com.skhola.zuma.repository.BaseRepository;
import com.skhola.zuma.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TournamentServiceImpl extends BaseServiceImpl<Tournament, Long> implements TournamentService {

    @Autowired
    private TournamentRepository repository;

    public TournamentServiceImpl(BaseRepository<Tournament, Long> baseRepository) {
        super(baseRepository);
    }
}
