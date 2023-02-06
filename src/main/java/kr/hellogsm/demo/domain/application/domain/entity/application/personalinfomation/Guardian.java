package kr.hellogsm.demo.domain.application.domain.entity.application.personalinfomation;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Guardian {
    String name;
    String relationship;
    PhoneNumber phoneNumber;
}
