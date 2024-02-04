package com.skhola.zuma.controller;

import com.skhola.zuma.model.Team;
import com.skhola.zuma.service.BaseService;
import com.skhola.zuma.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/team")
public class TeamController extends BaseControllerImpl<Team, Long> {

    @Autowired
    private TeamService service;

    protected TeamController(BaseService<Team, Long> baseService) {
        super(baseService);
    }

    // to obtain all active teams ("not deleted")
    @GetMapping("/team/active")
    public ResponseEntity<?> listActiveTeams() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findByActiveTrue());
    }

    // to activate or des-activate (false delete)
    @PutMapping("/team/sanction/{id}")
    public ResponseEntity<?> activateTeam(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.activateTeam(id));
    }


}
