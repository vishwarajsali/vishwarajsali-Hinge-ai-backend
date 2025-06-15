package com.vish.hinge_ai_backend.profiles;

import com.vish.hinge_ai_backend.profiles.enums.Ethnicity;
import com.vish.hinge_ai_backend.profiles.enums.Gender;
import com.vish.hinge_ai_backend.profiles.enums.MyersBriggsPersonalityType;
import org.springframework.data.annotation.Id;

public record Profile(
        @Id String id,
        String firstname,
        String lastname,
        int age,
        Ethnicity ethnicity,
        Gender gender,
        String bio,
        String imageUrl,
        MyersBriggsPersonalityType myersBriggsPersonalityType
) {
}
