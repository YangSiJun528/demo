package kr.hellogsm.demo.domain.application.domain.entity.application;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import kr.hellogsm.demo.domain.application.domain.entity.application.personalinfomation.PersonalInformation;
import kr.hellogsm.demo.domain.application.domain.entity.application.school.School;

import java.util.List;

@Entity
public class Application {

    //TODO 접수번호 생성기 만들기 - 아마 Transaction Level을 Serialize로 하고, Max(id+1)을 배정하는 식
    @Id
    Long id; // 접수번호

    @Embedded
    PersonalInformation personalInformation;

    @Embedded
    School school;

    @Enumerated(EnumType.STRING) // 전형
    Type type;

    @Size(min=3, max=3)
    @OneToMany
    List<Department> desiredDepartments;  // 1,2,3 지망 학과


}
