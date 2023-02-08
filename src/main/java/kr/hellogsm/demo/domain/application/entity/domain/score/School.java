package kr.hellogsm.demo.domain.application.entity.domain.score;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//TODO 점수 저장하는 거에 사용하는 클래스가 아니니까 클래스 위치를 바꿔야 할거 같은데
public class School {
    String name;

}
