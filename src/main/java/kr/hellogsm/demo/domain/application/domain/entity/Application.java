package kr.hellogsm.demo.domain.application.domain.entity;

import jakarta.validation.constraints.Size;
import kr.hellogsm.demo.domain.application.domain.entity.personalinfomation.PersonalInformation;
import kr.hellogsm.demo.domain.application.domain.entity.statusofapplicant.school.School;
import kr.hellogsm.demo.domain.application.domain.entity.statusofapplicant.school.AcademicRecord;
import kr.hellogsm.demo.domain.application.domain.entity.statusofapplicant.score.Score;
import kr.hellogsm.demo.domain.application.domain.entity.statusofapplicant.Type;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Application {

    Long id;

    PersonalInformation personalInformation;

    AcademicRecord academicRecord;

    School school;  //TODO score까지 묶어서 지원자 현황으로 만들까?

    Type type;
    Score score; // TODO Score 하위 클래스 값 추가해야함

    @Size(min=3, max=3)
    List<Department> desiredDepartments;
}
