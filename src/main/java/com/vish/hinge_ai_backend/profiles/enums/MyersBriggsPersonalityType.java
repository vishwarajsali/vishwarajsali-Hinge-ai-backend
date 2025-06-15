package com.vish.hinge_ai_backend.profiles.enums;


public enum MyersBriggsPersonalityType {
    ISTJ("Inspector"),
    ISFJ("Protector"),
    INFJ("Counselor"),
    INTJ("Mastermind"),
    ISTP("Crafter"),
    ISFP("Composer"),
    INFP("Healer"),
    INTP("Architect"),
    ESTP("Dynamo"),
    ESFP("Performer"),
    ENFP("Champion"),
    ENTP("Visionary"),
    ESTJ("Supervisor"),
    ESFJ("Provider"),
    ENFJ("Teacher"),
    ENTJ("Commander");

    private final String description;

    MyersBriggsPersonalityType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}