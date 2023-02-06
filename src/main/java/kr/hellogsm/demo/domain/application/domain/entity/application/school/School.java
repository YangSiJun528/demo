package kr.hellogsm.demo.domain.application.domain.entity.application.school;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kr.hellogsm.demo.domain.application.domain.entity.application.school.score.Score;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class School {
    String name;

    @Enumerated(EnumType.STRING)
    AcademicRecord academicRecord;

    Local local;

    List<Score> scores;
}
