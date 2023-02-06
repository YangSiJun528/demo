package kr.hellogsm.demo.domain.application.domain.entity.application.school.score;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import kr.hellogsm.demo.domain.application.domain.entity.application.Application;
import kr.hellogsm.demo.domain.application.domain.entity.application.school.School;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Score {

    Long id;
    Title title;
    BigDecimal value;

    @ManyToOne
    Application application;

}
