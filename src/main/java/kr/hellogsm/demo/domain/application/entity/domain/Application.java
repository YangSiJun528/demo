package kr.hellogsm.demo.domain.application.entity.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import kr.hellogsm.demo.domain.application.entity.domain.personalinfo.Applicant;
import kr.hellogsm.demo.domain.application.entity.domain.personalinfo.Guardian;
import kr.hellogsm.demo.domain.application.entity.domain.personalinfo.Teacher;
import kr.hellogsm.demo.domain.application.entity.domain.score.School;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

import java.util.List;

@Entity
@Table(name = "application")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Application {

    @Id
    @Column(name = "application_id")
    Long id;

    @Embedded
    @AttributeOverride(name = "name", column = @Column(name = "applicant_name"))
    @AttributeOverride(name = "gender", column = @Column(name = "applicant_gender"))
    @AttributeOverride(name = "brith", column = @Column(name = "applicant_brith"))
    @AttributeOverride(name = "telephone", column = @Column(name = "applicant_telephone"))
    Applicant applicant;
    @Embedded
    @AttributeOverride(name = "name", column = @Column(name = "guardian_name"))
    @AttributeOverride(name = "relationship", column = @Column(name = "guardian_relationship"))
    Guardian guardian;
    @Embedded
    @AttributeOverride(name = "name", column = @Column(name = "teacher_name"))
    Teacher teacher;

    @Enumerated(EnumType.STRING) // 전형
    @Column(name = "application_type")
    Type type;

    @Size(min=3, max=3)
    @OneToMany
    @JoinColumn(name = "desired_department_id")
    List<DesiredDepartment> desiredDepartments;  // 1,2,3 지망 학과

    @Embedded
    @AttributeOverride(name = "name", column = @Column(name = "school_name"))
    School school;

}
