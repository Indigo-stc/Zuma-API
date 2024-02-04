package com.skhola.zuma.service;

import com.skhola.zuma.model.Enrolment;
import com.skhola.zuma.repository.BaseRepository;
import com.skhola.zuma.repository.EnrolmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrolmentServiceImpl extends BaseServiceImpl<Enrolment, Long> implements EnrolmentService {

    @Autowired
    private EnrolmentRepository repository;

    public EnrolmentServiceImpl(BaseRepository<Enrolment, Long> baseRepository) {
        super(baseRepository);
    }
}
