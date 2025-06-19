package com.vish.hinge_ai_backend.profiles;

import com.vish.hinge_ai_backend.profiles.enums.Ethnicity;
import com.vish.hinge_ai_backend.profiles.enums.Gender;
import com.vish.hinge_ai_backend.profiles.enums.MyersBriggsPersonalityType;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileRequest {
    private String firstName;
    private String lastName;
    private int age;
    private Ethnicity ethnicity;
    private Gender gender;
    private String bio;
    private String imageUrl;
    private MyersBriggsPersonalityType myersBriggsPersonalityType;
}