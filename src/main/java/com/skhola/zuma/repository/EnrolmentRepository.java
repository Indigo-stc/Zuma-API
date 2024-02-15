package com.skhola.zuma.repository;

import com.skhola.zuma.model.Enrolment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrolmentRepository extends BaseRepository<Enrolment, Long> {

    List<Enrolment> findByActiveTrueAndTournament_Id(Long id);

    List<Enrolment> findByTournament_Id(Long id);

}
