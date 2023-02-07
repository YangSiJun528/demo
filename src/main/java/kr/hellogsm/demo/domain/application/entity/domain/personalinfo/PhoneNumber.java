package kr.hellogsm.demo.domain.application.entity.domain.personalinfo;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Pattern;

@Embeddable
public class PhoneNumber {
    @Pattern(regexp="^0(\\d{2})(\\d{4})(\\d{4})") //TODO 검토 필요 - 전화번호 표현 규칙을 모르니까 임시로
    String value;
}
