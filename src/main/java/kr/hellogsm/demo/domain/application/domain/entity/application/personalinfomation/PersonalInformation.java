package kr.hellogsm.demo.domain.application.domain.entity.application.personalinfomation;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PersonalInformation {

    @Embedded
    Applicant applicant;
    @Embedded
    Guardian guardian;
    @Embedded
    Teacher teacher;
}
