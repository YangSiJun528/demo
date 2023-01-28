package kr.hellogsm.demo.domain.application.domain.entity.statusofapplicant.school;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class School {
    String name;

    AcademicRecord academicRecord;

    Local local;
}
