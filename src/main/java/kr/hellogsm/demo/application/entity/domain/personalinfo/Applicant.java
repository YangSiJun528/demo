package kr.hellogsm.demo.application.entity.domain.personalinfo;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Date;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Applicant {
    String name;
    String gender;
    Date brith;

    @Embedded
    Local local;
    String telephone; // TODO telephone 클래스를 만들까?
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "applicant_phone_number"))
    PhoneNumber phoneNumber;
}