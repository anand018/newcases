package com.covido.newcases.controller;

import com.covido.newcases.dto.StatesDto;
import com.covido.newcases.services.NewCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NewCasesController {

    @Autowired
    private NewCaseService caseService;

    @GetMapping("/today")
    public StatesDto getCasesForToday() {
        return caseService.findNewCasesToday();
    }
}
