package kr.hellogsm.demo.domain.application.domain.entity.application.statusofapplicant.school;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class School {
    String name;

    @Enumerated(EnumType.STRING)
    AcademicRecord academicRecord;

    Local local;
}
