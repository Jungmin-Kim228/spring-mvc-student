package com.nhnacademy.student.domain;

import lombok.Value;

@Value
public class StudentModifierRequest {
    String name;
    String email;
    int score;
    String comment;
}
