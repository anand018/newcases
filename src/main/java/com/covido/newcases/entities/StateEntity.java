package com.covido.newcases.entities;

import javax.persistence.*;

@Table(name = "state")
@Entity
public class StateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer casesToday;
    private Integer casesYesterday;
    private Integer recoveredToday;
    private Integer deceasedToday;
    private Integer testedToday;
    private Integer vaccinatedToday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCasesToday() {
        return casesToday;
    }

    public void setCasesToday(Integer casesToday) {
        this.casesToday = casesToday;
    }

    public Integer getCasesYesterday() {
        return casesYesterday;
    }

    public void setCasesYesterday(Integer casesYesterday) {
        this.casesYesterday = casesYesterday;
    }

    public Integer getRecoveredToday() {
        return recoveredToday;
    }

    public void setRecoveredToday(Integer recoveredToday) {
        this.recoveredToday = recoveredToday;
    }

    public Integer getDeceasedToday() {
        return deceasedToday;
    }

    public void setDeceasedToday(Integer deceasedToday) {
        this.deceasedToday = deceasedToday;
    }

    public Integer getTestedToday() {
        return testedToday;
    }

    public void setTestedToday(Integer testedToday) {
        this.testedToday = testedToday;
    }

    public Integer getVaccinatedToday() {
        return vaccinatedToday;
    }

    public void setVaccinatedToday(Integer vaccinatedToday) {
        this.vaccinatedToday = vaccinatedToday;
    }

    @Override
    public String toString() {
        return "CaseEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", casesToday='" + casesToday + '\'' +
                ", casesYesterday='" + casesYesterday + '\'' +
                ", recoveredToday='" + recoveredToday + '\'' +
                ", deceasedToday='" + deceasedToday + '\'' +
                ", testedToday='" + testedToday + '\'' +
                ", vaccinatedToday='" + vaccinatedToday + '\'' +
                '}';
    }
}
