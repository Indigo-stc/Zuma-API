package com.skhola.zuma.controller;

import com.skhola.zuma.model.Tournament;
import com.skhola.zuma.service.BaseService;
import com.skhola.zuma.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tournament")
public class TournamentController extends BaseControllerImpl<Tournament, Long> {

    @Autowired
    private TournamentService service;

    protected TournamentController(BaseService<Tournament, Long> baseService) {
        super(baseService);
    }

}
