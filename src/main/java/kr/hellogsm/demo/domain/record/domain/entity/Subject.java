package kr.hellogsm.demo.domain.record.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
//TODO VO 객체라 hasHash인가 equals 관련된거 override 필요함
public class Subject {
    private Subject parents;
    private String subject;
    private Category category;
}
