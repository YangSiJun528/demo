package kr.hellogsm.demo.domain.application.domain.entity.application.school;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.ManyToOne;
import kr.hellogsm.demo.domain.application.domain.entity.application.Application;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Score {

    Long id;

    @Embedded
    Title title;
    BigDecimal value;

    @ManyToOne
    Application application;

}
