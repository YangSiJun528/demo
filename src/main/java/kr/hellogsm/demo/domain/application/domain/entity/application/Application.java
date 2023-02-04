package kr.hellogsm.demo.domain.application.domain.entity.application;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import kr.hellogsm.demo.domain.application.domain.entity.application.personalinfomation.PersonalInformation;
import kr.hellogsm.demo.domain.application.domain.entity.application.statusofapplicant.school.School;
import kr.hellogsm.demo.domain.application.domain.entity.application.statusofapplicant.school.AcademicRecord;
import kr.hellogsm.demo.domain.application.domain.entity.application.statusofapplicant.Type;
import kr.hellogsm.demo.domain.application.domain.entity.application.statusofapplicant.score.Score;
import kr.hellogsm.demo.domain.application.domain.entity.application.statusofapplicant.score.Title;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Application {

    //TODO 접수번호 생성기 만들기 - 아마 Transaction Level을 Serialize로 하고, Max(id+1)을 배정하는 식
    @Id
    Long id; // 접수번호

    @Embedded
    PersonalInformation personalInformation;

    @Embedded
    School school;  //TODO score까지 묶어서 지원자 현황으로 만들까?

    List<Score> scores;

    @Enumerated(EnumType.STRING)
    Type type;

    @Size(min=3, max=3)
    List<Department> desiredDepartments;
}
