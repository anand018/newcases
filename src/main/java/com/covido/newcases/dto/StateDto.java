package com.covido.newcases.dto;

public class StateDto {

    private String name;
    private String casesToday;
    private String casesYesterday;
    private String recoveredToday;
    private String deceasedToday;
    private String testedToday;
    private String vaccinatedToday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCasesToday() {
        return casesToday;
    }

    public void setCasesToday(String casesToday) {
        this.casesToday = casesToday;
    }

    public String getCasesYesterday() {
        return casesYesterday;
    }

    public void setCasesYesterday(String casesYesterday) {
        this.casesYesterday = casesYesterday;
    }

    public String getRecoveredToday() {
        return recoveredToday;
    }

    public void setRecoveredToday(String recoveredToday) {
        this.recoveredToday = recoveredToday;
    }

    public String getDeceasedToday() {
        return deceasedToday;
    }

    public void setDeceasedToday(String deceasedToday) {
        this.deceasedToday = deceasedToday;
    }

    public String getTestedToday() {
        return testedToday;
    }

    public void setTestedToday(String testedToday) {
        this.testedToday = testedToday;
    }

    public String getVaccinatedToday() {
        return vaccinatedToday;
    }

    public void setVaccinatedToday(String vaccinatedToday) {
        this.vaccinatedToday = vaccinatedToday;
    }

    @Override
    public String toString() {
        return "StateDto{" +
                "name='" + name + '\'' +
                ", casesToday='" + casesToday + '\'' +
                ", casesYesterday='" + casesYesterday + '\'' +
                ", recoveredToday='" + recoveredToday + '\'' +
                ", deceasedToday='" + deceasedToday + '\'' +
                ", testedToday='" + testedToday + '\'' +
                ", vaccinatedToday='" + vaccinatedToday + '\'' +
                '}';
    }
}
