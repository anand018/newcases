package com.covido.newcases.services;

import com.covido.newcases.dto.StatesDto;

public interface NewCaseService {
    StatesDto findNewCasesToday();
}
