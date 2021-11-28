package com.covido.newcases.dto;

import java.util.List;

public class StatesDto {

    private List<StateDto> stateList;

    public List<StateDto> getStateList() {
        return stateList;
    }

    public void setStateList(List<StateDto> stateList) {
        this.stateList = stateList;
    }

    @Override
    public String toString() {
        return "StatesDto{" +
                "stateList=" + stateList +
                '}';
    }
}
