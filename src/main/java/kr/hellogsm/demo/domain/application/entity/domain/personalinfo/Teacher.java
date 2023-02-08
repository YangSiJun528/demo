package kr.hellogsm.demo.domain.application.entity.domain.personalinfo;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Teacher {

    private String name;
    @Embedded
    @AttributeOverride(name = "phoneNumber", column = @Column(name = "teacher_phone_number"))
    private PhoneNumber phoneNumber;
}
