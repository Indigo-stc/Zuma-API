package com.skhola.zuma.service;

import com.skhola.zuma.model.Player;
import com.skhola.zuma.repository.BaseRepository;
import com.skhola.zuma.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl extends BaseServiceImpl<Player, Long> implements PlayerService {

    @Autowired
    private PlayerRepository repository;

    public PlayerServiceImpl(BaseRepository<Player, Long> baseRepository) {
        super(baseRepository);
    }
}
