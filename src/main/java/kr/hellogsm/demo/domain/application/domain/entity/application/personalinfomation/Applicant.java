package kr.hellogsm.demo.domain.application.domain.entity.application.personalinfomation;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class Applicant {
    String name;
    String address;
    String gender;
    Date brith;
    String telephone; // TODO telephone 클래스를 만들까?
    PhoneNumber phoneNumber;
}
