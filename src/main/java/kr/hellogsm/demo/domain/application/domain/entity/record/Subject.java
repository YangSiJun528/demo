package kr.hellogsm.demo.domain.application.domain.entity.record;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
//TODO VO 객체라 hasHash인가 equals 관련된거 override 필요함
public class Subject {
    Subject parents;
    String subject;
    Category category;
}
