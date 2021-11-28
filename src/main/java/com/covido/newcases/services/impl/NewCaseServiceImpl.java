package com.covido.newcases.services.impl;

import com.covido.newcases.dto.StatesDto;
import com.covido.newcases.mappers.NewCasesMapper;
import com.covido.newcases.repo.NewCaseRepo;
import com.covido.newcases.services.NewCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewCaseServiceImpl implements NewCaseService {

    @Autowired
    private NewCaseRepo newCaseRepo;

    @Autowired
    private NewCasesMapper casesMapper;

    @Override
    public StatesDto findNewCasesToday() {
        System.out.println(newCaseRepo.findAll());
        return casesMapper.entityToDto(newCaseRepo.findAll());
    }
}
