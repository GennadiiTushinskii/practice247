package org.example;
public enum StudyProfile {
    MEDICINE("Медицинский"),
    MECHANIC("Механический"),
    ELECTRICITY("Электротехника"),
    OPTIKA("Оптикомеханический"),
    CHEMICAL("Химический"),
    IT_TEHNOLOGY("IT технологии");

    private final String profileName;

    private StudyProfile(String profileName){
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }

}
