package kr.hellogsm.demo.application.entity.domain.personalinfo;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Guardian {
    String name;
    String relationship;
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "guardian_phone_number"))
    PhoneNumber phoneNumber;
}