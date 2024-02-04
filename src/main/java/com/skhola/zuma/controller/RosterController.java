package com.skhola.zuma.controller;

import com.skhola.zuma.model.Roster;
import com.skhola.zuma.service.BaseService;
import com.skhola.zuma.service.RosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roster")
public class RosterController extends BaseControllerImpl<Roster, Long> {

    @Autowired
    private RosterService service;

    protected RosterController(BaseService<Roster, Long> baseService) {
        super(baseService);
    }

    @GetMapping("/team/{id}")
    public ResponseEntity<?> getRosterByIdActive(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllByActiveTrueAndTeam_Id(id));
    }

}
