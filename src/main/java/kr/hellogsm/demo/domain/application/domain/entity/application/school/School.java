package kr.hellogsm.demo.domain.application.domain.entity.application.school;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class School {
    String name;

    @Enumerated(EnumType.STRING)
    AcademicRecord academicRecord;

    @Embedded
    Local local;
}
