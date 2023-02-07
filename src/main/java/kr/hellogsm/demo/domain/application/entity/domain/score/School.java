package kr.hellogsm.demo.domain.application.entity.domain.score;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import kr.hellogsm.demo.domain.record.domain.entity.AcademicRecord;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class School {
    String name;

}
