package kr.hellogsm.demo.domain.application.domain.entity.application.school;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Local {

    // TODO 외국에선 street line 1(도로명), 2(세부 주소) 로 부르는데 이러면 우리 입장에선 처음에 알아듣기 힘들지 않을까?

    String streetAddress;
    String addressDetails;
}
