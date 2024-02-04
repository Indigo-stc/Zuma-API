package com.skhola.zuma.service;

import com.skhola.zuma.model.Sport;
import com.skhola.zuma.repository.BaseRepository;
import com.skhola.zuma.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportServiceImpl extends BaseServiceImpl<Sport, Long> implements SportService {

    @Autowired
    private SportRepository repository;

    public SportServiceImpl(BaseRepository<Sport, Long> baseRepository) {
        super(baseRepository);
    }

}
