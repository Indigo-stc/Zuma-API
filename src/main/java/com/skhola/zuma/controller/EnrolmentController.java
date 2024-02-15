package com.skhola.zuma.controller;

import com.skhola.zuma.model.Enrolment;
import com.skhola.zuma.service.BaseService;
import com.skhola.zuma.service.EnrolmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enrolment")
public class EnrolmentController extends BaseControllerImpl<Enrolment, Long> {

    @Autowired
    private EnrolmentService service;

    protected EnrolmentController(BaseService<Enrolment, Long> baseService) {
        super(baseService);
    }

    @GetMapping("/tournament/{id}")
    public ResponseEntity<?> getActiveEnrolmentsByTeamId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findByActiveTrueAndTournament_Id(id));
    }
    
}