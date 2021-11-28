package com.covido.newcases.services.impl;

import com.covido.newcases.dto.ConfigProperties;
import com.covido.newcases.services.HistoricalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HistoricalDataServiceImpl implements HistoricalDataService {

    @Autowired
    private ConfigProperties configProperties;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getHistoricalData() {
        return restTemplate.getForEntity(configProperties.getUrl(), String.class).getBody();
    }
}
