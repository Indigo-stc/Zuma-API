package com.skhola.zuma.controller;

import com.skhola.zuma.model.Sport;
import com.skhola.zuma.service.BaseService;
import com.skhola.zuma.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sport")
public class SportController extends BaseControllerImpl<Sport, Long> {

    @Autowired
    private SportService service;

    protected SportController(BaseService<Sport, Long> baseService) {
        super(baseService);
    }

}
