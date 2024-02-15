package com.skhola.zuma.service;

import com.skhola.zuma.model.Enrolment;

import java.util.List;

public interface EnrolmentService extends BaseService<Enrolment, Long> {

    List<Enrolment> findByActiveTrueAndTournament_Id(Long id);

    List<Enrolment> findByTournament_Id(Long id);

}
