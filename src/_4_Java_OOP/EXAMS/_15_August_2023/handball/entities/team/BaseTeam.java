package _4_Java_OOP.EXAMS._15_August_2023.handball.entities.team;

import static _4_Java_OOP.EXAMS._15_August_2023.handball.common.ExceptionMessages.*;

public abstract class BaseTeam implements Team{
    private String name;
    private String country;
    private int advantage;

    protected BaseTeam(String name, String country, int advantage) {
        this.setName(name);
        this.setCountry(country);
        this.setAdvantage(advantage);
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw  new NullPointerException(TEAM_NAME_NULL_OR_EMPTY);
        }
        this.name = name;

    }

    @Override
    public abstract void play();

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAdvantage() {
        return this.advantage;
    }

    private void setCountry(String country) {
        if (country == null || country.trim().isEmpty()){
            throw  new NullPointerException(TEAM_COUNTRY_NULL_OR_EMPTY);
        }
        this.country = country;
    }

    public void setAdvantage(int advantage) {
        if (advantage <= 0){
            throw  new IllegalArgumentException(TEAM_ADVANTAGE_BELOW_OR_EQUAL_ZERO);
        }
        this.advantage = advantage;
    }
}
