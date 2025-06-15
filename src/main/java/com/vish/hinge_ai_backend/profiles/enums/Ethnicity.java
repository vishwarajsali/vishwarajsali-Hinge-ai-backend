package com.vish.hinge_ai_backend.profiles.enums;

public enum Ethnicity {
    ASIAN("Asian"),
    BLACK_OR_AFRICAN_AMERICAN("Black or African American"),
    HISPANIC_OR_LATINO("Hispanic or Latino"),
    WHITE("White"),
    NATIVE_AMERICAN_OR_ALASKA_NATIVE("Native American or Alaska Native"),
    NATIVE_HAWAIIAN_OR_OTHER_PACIFIC_ISLANDER("Native Hawaiian or Other Pacific Islander"),
    MIDDLE_EASTERN_OR_NORTH_AFRICAN("Middle Eastern or North African"),
    TWO_OR_MORE_RACES("Two or More Races"),
    OTHER("Other"),
    PREFER_NOT_TO_SAY("Prefer not to say");

    private final String description;

    Ethnicity(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}