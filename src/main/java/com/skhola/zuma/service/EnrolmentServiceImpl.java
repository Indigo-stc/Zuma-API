package com.skhola.zuma.service;

import com.skhola.zuma.exception.ResourceNotFoundException;
import com.skhola.zuma.model.Enrolment;
import com.skhola.zuma.repository.BaseRepository;
import com.skhola.zuma.repository.EnrolmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrolmentServiceImpl extends BaseServiceImpl<Enrolment, Long> implements EnrolmentService {

    @Autowired
    private EnrolmentRepository repository;

    public EnrolmentServiceImpl(BaseRepository<Enrolment, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Enrolment> findByActiveTrueAndTournament_Id(Long id) {
        List<Enrolment> enrolments = repository.findByActiveTrueAndTournament_Id(id);
        if (enrolments.isEmpty()) {
            throw new ResourceNotFoundException("There aren't records");
        }
        return enrolments;
    }

    @Override
    public List<Enrolment> findByTournament_Id(Long id) {
        List<Enrolment> enrolments = repository.findByTournament_Id(id);
        if (enrolments.isEmpty()) {
            throw new ResourceNotFoundException("There aren't records");
        }
        return enrolments;
    }
}
