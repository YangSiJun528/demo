package kr.hellogsm.demo.domain.application.domain.entity.application.personalinfomation;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Applicant {
    String name;
    String address;
    String gender;
    Date brith;
    String telephone; // TODO telephone 클래스를 만들까?
    PhoneNumber phoneNumber;
}
