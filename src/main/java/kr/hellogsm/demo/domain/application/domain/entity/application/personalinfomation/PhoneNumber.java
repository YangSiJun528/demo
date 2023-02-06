package kr.hellogsm.demo.domain.application.domain.entity.application.personalinfomation;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PhoneNumber {
    @Pattern(regexp="^0(\\d{2})(\\d{4})(\\d{4})") //TODO 검토 필요 - 전화번호 표현 규칙을 모르니까 임시로
    String value;
}
