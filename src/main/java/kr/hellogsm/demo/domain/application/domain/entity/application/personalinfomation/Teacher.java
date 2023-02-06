package kr.hellogsm.demo.domain.application.domain.entity.application.personalinfomation;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Teacher {
    private String name;
    private PhoneNumber phoneNumber;
}
