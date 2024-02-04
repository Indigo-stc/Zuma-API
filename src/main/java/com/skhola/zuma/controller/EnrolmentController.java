package com.skhola.zuma.controller;

import com.skhola.zuma.model.Enrolment;
import com.skhola.zuma.service.BaseService;
import com.skhola.zuma.service.EnrolmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enrolment")
public class EnrolmentController extends BaseControllerImpl<Enrolment, Long> {

    @Autowired
    private EnrolmentService service;

    protected EnrolmentController(BaseService<Enrolment, Long> baseService) {
        super(baseService);
    }

}