package com.skhola.zuma.controller;

import com.skhola.zuma.model.Player;
import com.skhola.zuma.service.BaseService;
import com.skhola.zuma.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController extends BaseControllerImpl<Player, Long> {

    @Autowired
    private PlayerService service;

    private PlayerController(BaseService<Player, Long> service) {
        super(service);
    }

}
