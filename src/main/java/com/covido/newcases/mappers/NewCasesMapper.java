package com.covido.newcases.mappers;

import com.covido.newcases.dto.StateDto;
import com.covido.newcases.dto.StatesDto;
import com.covido.newcases.entities.StateEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NewCasesMapper {

    public StatesDto entityToDto(List<StateEntity> entities) {

        StatesDto statesDto = new StatesDto();
        List<StateDto> stateDtos = new ArrayList<>();

        for (StateEntity entity : entities) {
            StateDto stateDto = new StateDto();
            stateDto.setCasesToday(String.valueOf(entity.getCasesToday()));
            stateDto.setCasesYesterday(String.valueOf(entity.getCasesYesterday()));
            stateDto.setName(String.valueOf(entity.getName()));
            stateDto.setDeceasedToday(String.valueOf(entity.getDeceasedToday()));
            stateDto.setRecoveredToday(String.valueOf(entity.getRecoveredToday()));
            stateDto.setTestedToday(String.valueOf(entity.getTestedToday()));
            stateDto.setVaccinatedToday(String.valueOf(entity.getVaccinatedToday()));
            stateDtos.add(stateDto);
        }
        statesDto.setStateList(stateDtos);
        return statesDto;
    }
}
