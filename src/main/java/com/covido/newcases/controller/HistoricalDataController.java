package com.covido.newcases.controller;

import com.covido.newcases.services.HistoricalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HistoricalDataController  {

    @Autowired
    private HistoricalDataService historicalDataService;

    @GetMapping("/historical-data")
    public String getHistoricalData() {
        return historicalDataService.getHistoricalData();
    }
}
