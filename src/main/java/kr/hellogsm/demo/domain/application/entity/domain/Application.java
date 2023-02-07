package kr.hellogsm.demo.domain.application.entity.domain;

import com.example.demo.application.entity.domain.personalinfo.Guardian;
import com.example.demo.application.entity.domain.personalinfo.Teacher;
import com.example.demo.application.entity.domain.score.School;
import com.example.demo.application.entity.domain.personalinfo.Applicant;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Application {

    @Id
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
    Type type;

    @Size(min=3, max=3)
    @OneToMany
    List<DesiredDepartment> desiredDepartments;  // 1,2,3 지망 학과

    @Embedded
    @AttributeOverride(name = "name", column = @Column(name = "school_name"))
    School school;

}
